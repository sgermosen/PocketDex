using Prism.Commands;
using System.Windows.Input;
using Prism.Navigation;
using Realms;

namespace PoketDex.ViewModels
{
	public class MainPageViewModel : ViewModelBase
	{
	   // private readonly Realm _realm;
       
        private string _btnPokeListText;

	    public string BtnPokeListText
	    {
	        get => _btnPokeListText;
	        set => SetProperty(ref _btnPokeListText, value);
	    }

	    private string _btnFavoriteText;

	    public string BtnFavoriteText
        {
	        get => _btnFavoriteText;
	        set => SetProperty(ref _btnFavoriteText, value);
	    }

	    public ICommand BtnPokeListCommand
	    {
	        get;
	        private set;
	    }
	    public ICommand BtnFavCommand
        {
	        get;
	        private set;
	    }
	  
	    private readonly INavigationService _navigationService;

        public MainPageViewModel(INavigationService navigationService, Realm realm)
            : base(navigationService)
        {
            Title = "Pokedex";
            BtnFavoriteText = "Mis pokemons Favoritos";
            BtnPokeListText = "Listado de Pokemons";
          
            _navigationService = navigationService;
           // NavigateCommand = new DelegateCommand(Navigate(""));
            BtnPokeListCommand= new DelegateCommand(NavigatePokeList);
            BtnFavCommand = new DelegateCommand(NavigateFav);
           
            //_realm = realm;
        }

	    private void NavigatePokeList()
	    {
	        // var navigationParams = new NavigationParameters{{"model",param}};
	         _navigationService.NavigateAsync("PokemonList");
	    }
	    private void NavigateFav()
	    {
	        // var navigationParams = new NavigationParameters{{"model",param}};
	        _navigationService.NavigateAsync("FavoritePage");
	    }
	   
    }
}
