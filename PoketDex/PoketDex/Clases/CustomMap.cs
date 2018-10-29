using System;
using System.Collections.Generic;
using System.Text;
using Xamarin.Forms.Maps;

namespace PoketDex.Clases
{
    public class CustomMap : Map
    {
        public List<CustomPin> CustomPins { get; set; }
    }
}
