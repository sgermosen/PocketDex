using Prism.Commands;
using Prism.Mvvm;
using Prism.Navigation;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using PoketDex.Models;
using PoketDex.Services;
using Realms;

namespace PoketDex.ViewModels
{
	public class FavoritePageViewModel : ViewModelBase
	{
	    private readonly INavigationService _navigationService;
	    protected Realm RealmInstance;
        private readonly DbService _dbService;
	    public DelegateCommand NavigateCommand { get; private set; }
        private ObservableCollection<PokeFav> _pokemons;

	    public ObservableCollection<PokeFav> Pokemons
	    {
	        get => _pokemons;
	        set => SetProperty(ref _pokemons, value);
	    }
	    private PokeFav _selectedPokemon;

	    public PokeFav SelectedPokemon
	    {
	        get => _selectedPokemon;
	        set => SetProperty(ref _selectedPokemon, value);
	    }
        public FavoritePageViewModel(INavigationService navigationService)
            : base(navigationService)
        {
            Title = "My Favorites Pokemons";

          //  Title = "Pokemon List";
           // _pokemonService = pokemonService;
            _navigationService = navigationService;
            //  NavigateCommand = new DelegateCommand(Navigate);
            Pokemons = new ObservableCollection<PokeFav>();
            RealmInstance = Realm.GetInstance();
            GetPokemonsFromDb();
            NavigateCommand = new DelegateCommand(NavigateDetail);
        }

	    private async void NavigateDetail()
	    {
            var pokemon = new Poke
            {
                PokemonId = SelectedPokemon.PokemonId,
                Sprite = SelectedPokemon.Sprite,
                SpriteArray = SelectedPokemon.SpriteArray,
                LocationLong = SelectedPokemon.LocationLong,
                LocationLat = SelectedPokemon.LocationLat,
                Abilities = SelectedPokemon.Abilities,
                Moves = SelectedPokemon.Moves,
                Types = SelectedPokemon.Types,
                PokedexNumber = SelectedPokemon.PokedexNumber,
                Name = SelectedPokemon.Name
            };
	        var navigationParams = new NavigationParameters { { "model", pokemon } };
	        await _navigationService.NavigateAsync("DetailPage", navigationParams);
	    }

	    private  void GetPokemonsFromDb()
	    {
	        IsRunning = true;
            // var result =  _dbService.GetAllFavorites();
	        try
	        {
	            var list = RealmInstance.All<PokeFav>().ToList();

	            foreach (var item in list)
	            {
	                Pokemons.Add(item);
	            }
            }
	        catch (Exception e)
	        {
	            
	        }
            IsRunning = false;

	       
	    }
    }
}
