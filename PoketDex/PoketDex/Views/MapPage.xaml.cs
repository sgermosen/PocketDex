using System;
using System.Collections.Generic;
using PoketDex.Clases;
using Xamarin.Forms;
using Xamarin.Forms.Maps;

namespace PoketDex.Views
{
    public partial class MapPage : ContentPage
    {
        public MapPage()
        {
            InitializeComponent();
        }
        private void Street_OnClicked(object sender, EventArgs e)
        {
           // MapView.MapType = MapType.Street;
        }


        private void Hybrid_OnClicked(object sender, EventArgs e)
        {
          //  MapView.MapType = MapType.Hybrid;
        }

        private void Satellite_OnClicked(object sender, EventArgs e)
        {
           // MapView.MapType = MapType.Satellite;
        }
    }
}
