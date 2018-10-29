using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Api.Models
{
    public class PokemonResponse
    {

        public int PokemonId { get; set; }

        public string PokedexNumber { get; set; }

        public string Name { get; set; }

        public string Sprite { get; set; }

        public string Types { get; set; }

        public string Moves { get; set; }

        public string Abilities { get; set; }

        public string LocationLat { get; set; }

        public string LocationLong { get; set; }
    }
}