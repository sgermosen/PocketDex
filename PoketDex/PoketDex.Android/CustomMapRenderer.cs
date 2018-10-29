//using System;
//using System.Collections.Generic;
//using System.Linq;
//using System.Text;

//using Android.App;
//using Android.Content;
//using Android.Gms.Maps;
//using Android.OS;
//using Android.Runtime;
//using Android.Views;
//using Android.Widget;
//using CustomMapRenderer.Droid;
//using PoketDex.Clases;
//using Xamarin.Forms;
//using Xamarin.Forms.Maps;
//using Xamarin.Forms.Maps.Android;

//[assembly: ExportRenderer(typeof(CustomMap), typeof(CustomMapRenderer.Droid.CustomMapRenderer))]
//namespace CustomMapRenderer.Droid
//{
//    public class CustomMapRenderer : MapRenderer, GoogleMap.IInfoWindowAdapter
//    {
//        List<CustomPin> customPins;

//        public CustomMapRenderer(Context context) : base(context)
//        {
//        }

//        protected override void OnElementChanged(Xamarin.Forms.Platform.Android.ElementChangedEventArgs<Map> e)
//        {
//            base.OnElementChanged(e);

//            if (e.OldElement != null)
//            {
//                NativeMap.InfoWindowClick -= OnInfoWindowClick;
//            }

//            if (e.NewElement != null)
//            {
//                var formsMap = (CustomMap)e.NewElement;
//                customPins = formsMap.CustomPins;
//                Control.GetMapAsync(this);
//            }
//        }

//        protected override void OnMapReady(GoogleMap map)
//        {
//            base.OnMapReady(map);

//            NativeMap.InfoWindowClick += OnInfoWindowClick;
//            NativeMap.SetInfoWindowAdapter(this);
//        }
       
//    }
//}