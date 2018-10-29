using System;
using System.Linq;
using System.Windows.Input;
using PoketDex.Models;
using PoketDex.Services;
using Prism.Commands;
using Prism.Navigation;
using Realms;
using Xamarin.Forms;

namespace PoketDex.ViewModels
{
    public class DetailPageViewModel : ViewModelBase
    {
        private readonly Realm _realm;
        private DbService _dbService;
        private Poke _pokemon;

        public Poke Pokemon
        {
            get => _pokemon;
            set => SetProperty(ref _pokemon, value);
        }
        private bool _isFavorite;

        public bool IsFavorite
        {
            get => _isFavorite;
            set => SetProperty(ref _isFavorite, value);
        }


        private string _image;

        public string Image
        {
            get => _image;
            set => SetProperty(ref _image, value);
        }

        public DelegateCommand ChangeFavoriteCommand { get; private set; }
        private readonly INavigationService _navigationService;

        public ICommand BtnFavCommand
        {
            get;
            private set;
        }
        public DetailPageViewModel(INavigationService navigationService, Realm realm)
            : base(navigationService)
        {
            // _navigationService = navigationService;
            Title = "Detalle de Pokemon";
            BtnFindText = "Encuentralo en el Mapa";

            _pokemon = new Poke();

            _navigationService = navigationService;

            BtnFindCommand = new DelegateCommand(NavigateFind);
            ChangeFavoriteCommand = new DelegateCommand(ChangeFavorite);
            // TapCommand=new Command();
            BtnFavCommand = new DelegateCommand(ChangeFavorite);
            IsFavorite = false;

            _realm = realm;
            _dbService=new DbService();

        }

        private void ChangeFavorite()
        {
            //var exist = _realm.All<PokeFav>().First(d => d.PokemonId == Pokemon.PokemonId);
            //var exist = _realm.All<PokeFav>().Count(d => d.PokemonId == Pokemon.PokemonId);
            var exist = _realm.All<PokeFav>().Where(d => d.PokemonId == Pokemon.PokemonId);
            //if (exist == null)
            if (exist.Count() != 0)
            {
                _dbService.RemovePokemon(Pokemon);
                IsFavorite = false;
                Image = "ic_favorite_border";
                //var obj = _realm.All<PokeFav>().First(b => b.PokemonId == Pokemon.PokemonId);
                //using (var trans = _realm.BeginWrite())
                //{
                //    _realm.Remove(obj);
                //    trans.Commit();
                //}

            }
            else
            {
                _dbService.SavePokemon(Pokemon);
                //_realm.Write(() =>
                //{
                //    _realm.Add(new PokeFav { PokemonId = Pokemon.PokemonId });
                //});


                // _realm.Remove(exist);
                //  trans.Commit();
                IsFavorite = true;
                Image = "ic_favorite";
               
            }

        }

        public ImageSource SomeIcon { get { return ImageSource.FromFile("ic_favorite.png"); } }
        private void NavigateFind()
        {
            var navigationParams = new NavigationParameters { { "model", Pokemon } };
            _navigationService.NavigateAsync("MapPage", navigationParams);
        }
        public ICommand BtnFindCommand
        {
            get;
            private set;
        }

        private string _btnFindText;

        public string BtnFindText
        {
            get => _btnFindText;
            set => SetProperty(ref _btnFindText, value);
        }

        public override void OnNavigatingTo(NavigationParameters parameters)
        {
            Pokemon = (Poke)parameters["model"];
            try
            {
                // var exist = _realm.Find<PokeFav>(Pokemon.PokemonId);
                // var exist = _realm.All<PokeFav>().First(d => d.PokemonId == Pokemon.PokemonId);
                var exist = _realm.All<PokeFav>().Where(d => d.PokemonId == Pokemon.PokemonId);

                if (exist.Count() != 0)
                {
                    IsFavorite = true;
                    Image = "ic_favorite";
                }
                else
                {
                    IsFavorite = false;
                    Image = "ic_favorite_border";
                }
            }
            catch (Exception e)
            {
                _realm.Write(() =>
                {
                    _realm.Add(new PokeFav { PokemonId = Pokemon.PokemonId });
                });

            }


        }
    }
}
