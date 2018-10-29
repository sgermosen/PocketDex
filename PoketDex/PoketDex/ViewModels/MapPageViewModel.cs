using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using PoketDex.Clases;
using PoketDex.Interfaces;
using PoketDex.Models;
using Prism.Commands;
using Prism.Navigation;
using Xamarin.Forms.Maps;

namespace PoketDex.ViewModels
{
    public class MapPageViewModel : ViewModelBase
    {
       // public DelegateCommand NavigateCommand { get; private set; }
        private readonly INavigationService _navigationService;
        private readonly IPokemonService _pokemonService;
        public MapPageViewModel(INavigationService navigationService, IPokemonService pokemonService)
            : base(navigationService)
        {
            Title = "Mapa de Pokemons";
            _pokemonService = pokemonService;
            _navigationService = navigationService;

            Map = new CustomMap();
            CustomMap = new CustomMap
            {
                MapType = MapType.Street,
                WidthRequest = App.ScreenWidth,
                HeightRequest = App.ScreenHeight
            };
            //var pins = new List<CustomPin>();
            _pokemon = new Poke();
        }
        
        //private async void GetPokemonFromApi(int id)
        //{
        //    IsRunning = true;
        //    var result = await _pokemonService.GetAllPokemonsAsync(1);
        //    IsRunning = false;

        //    foreach (var item in result)
        //    {
        //        Pokemons.Add(item);
        //    }
        //}

        // [Authorize]
        public Map Map { get; private set; }
        public CustomMap CustomMap { get; private set; }

        private Poke _pokemon;

        public Poke Pokemon
        {
            get => _pokemon;
            set => SetProperty(ref _pokemon, value);
        }
        //private ObservableCollection<Poke> _pokemons;

        //public ObservableCollection<Poke> Pokemons
        //{
        //    get => _pokemons;
        //    set => SetProperty(ref _pokemons, value);
        //}
        public override void OnNavigatingTo(NavigationParameters parameters)
        {
            Pokemon = (Poke)parameters["model"];

           
            //  NavigateCommand = new DelegateCommand(Navigate);
            //Pokemons = new ObservableCollection<Poke>();

           //GetPokemonsFromApi();

            var pin = new CustomPin
            {
                Type = PinType.Place,
                Position = new Position(Convert.ToDouble(Pokemon.LocationLat), Convert.ToDouble(Pokemon.LocationLong)),
                Label = "Xamarin San Francisco Office",
                Address = "394 Pacific Ave, San Francisco CA",
                Id = "xam",
                Url = "http://xamarin.com/about/"

            };

            CustomMap.CustomPins = new List<CustomPin> { pin };
            CustomMap.Pins.Add(pin);



            CustomMap.MoveToRegion(MapSpan.FromCenterAndRadius(new Position(Convert.ToDouble(Pokemon.LocationLat), Convert.ToDouble(Pokemon.LocationLong)), Distance.FromMiles(1.0)));


            //if (Pokemon.PokemonId == 1)
            //{
            //    IsFavorite = true;
            //}
        }
        //private void Street_OnClicked(object sender, EventArgs e)
        //{
        //    MapView.MapType = MapType.Street;
        //}


        //private void Hybrid_OnClicked(object sender, EventArgs e)
        //{
        //    MapView.MapType = MapType.Hybrid;
        //}

        //private void Satellite_OnClicked(object sender, EventArgs e)
        //{
        //    MapView.MapType = MapType.Satellite;
        //}
    }
}
