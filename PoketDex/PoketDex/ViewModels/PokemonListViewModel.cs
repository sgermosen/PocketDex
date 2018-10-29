using Prism.Commands;
using Prism.Mvvm;
using Prism.Navigation;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Threading.Tasks;
using PoketDex.Interfaces;
using PoketDex.Models;

namespace PoketDex.ViewModels
{
    public class PokemonListViewModel : ViewModelBase
    {
        public DelegateCommand NavigateCommand { get; private set; }
        private readonly INavigationService _navigationService;
        private readonly IPokemonService _pokemonService;

        private ObservableCollection<Poke> _pokemons;

        public ObservableCollection<Poke> Pokemons
        {
            get => _pokemons;
            set => SetProperty(ref _pokemons, value);
        }
        private Poke _selectedPokemon;

        public Poke SelectedPokemon
        {
            get => _selectedPokemon;
            set => SetProperty(ref _selectedPokemon, value);
        }

        public PokemonListViewModel(INavigationService navigationService,IPokemonService pokemonService) 
            : base(navigationService)
        {
            Title = "Pokemon List";
            _pokemonService = pokemonService;
            _navigationService = navigationService;
            //  NavigateCommand = new DelegateCommand(Navigate);
            Pokemons = new ObservableCollection<Poke>();

             GetPokemonsFromApi();
            NavigateCommand= new DelegateCommand(NavigateDetail);
        }

       private async void NavigateDetail()
        {
           var navigationParams = new NavigationParameters{{"model",_selectedPokemon}};
            await _navigationService.NavigateAsync("DetailPage", navigationParams);
        }

        private async void GetPokemonsFromApi()
        {
            IsRunning = true;
            var result = await _pokemonService.GetAllPokemonsAsync(0);
            IsRunning = false;

            foreach (var item in result)
            {
                Pokemons.Add(item);
            }
        }

        //async void Navigate()
        //{
        //    // var navigationParams = new NavigationParameters{{"model",param}};
        //    await _navigationService.NavigateAsync("");
        //}
    }
}
