using PoketDex.Interfaces;
using PoketDex.Services;
using Prism;
using Prism.Ioc;
using PoketDex.Views;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using Prism.Unity;

[assembly: XamlCompilation(XamlCompilationOptions.Compile)]
namespace PoketDex
{
    public partial class App : PrismApplication
    {
        public static double ScreenWidth;
        public static double ScreenHeight;
        public App() : this(null) { }

        public App(IPlatformInitializer initializer) : base(initializer) { }

        protected override async void OnInitialized()
        {
            InitializeComponent();

           // await NavigationService.NavigateAsync("BaseNavigationPage/MasterPage");
            await NavigationService.NavigateAsync("NavigationPage/MainPage");
        }

        protected override void RegisterTypes(IContainerRegistry containerRegistry)
        {
            //containerRegistry.RegisterForNavigation<NavigationPage>();
            ////containerRegistry.RegisterForNavigation<MainPage>();
            //containerRegistry.RegisterForNavigation<MasterPage>();
            ////containerRegistry.RegisterForNavigation<MyNavigationPage>();
            ////containerRegistry.RegisterForNavigation<MasterPageView>();
            ////containerRegistry.RegisterForNavigation<MasterPage>();
            //containerRegistry.RegisterForNavigation<Xamarin.Forms.MasterDetailPage>();
            ////containerRegistry.RegisterForNavigation<MasterDetailPage>();
            //containerRegistry.RegisterForNavigation<BaseNavigationPage>();
            //containerRegistry.RegisterForNavigation<DetailPage>();

            ////containerRegistry.RegisterTypeForNavigation<MasterDetailPageView, MasterDetailPageViewModel>();
            ////Container.RegisterTypeForNavigation<MasterPageView, MasterPageViewModel>();
            //Container.RegisterTypeForNavigation<DetailPageView, DetailPageViewModel>();
            //Container.RegisterTypeForNavigation<BaseNavigationPageView, BaseNavigationPageViewModel>();
            containerRegistry.RegisterInstance(Realms.Realm.GetInstance());

            containerRegistry.RegisterForNavigation<NavigationPage>();
            containerRegistry.RegisterForNavigation<MainPage>();
            containerRegistry.RegisterForNavigation<FavoritePage>();
            containerRegistry.RegisterForNavigation<PokemonList>();
            containerRegistry.RegisterForNavigation<MainPage>();
            containerRegistry.RegisterForNavigation<DetailPage>();
            containerRegistry.RegisterForNavigation<MapPage>();

            containerRegistry.Register<IPokemonService,PokemonService>();
           // containerRegistry.Register<IApiser, PokemonService>();
        }
    }
}
