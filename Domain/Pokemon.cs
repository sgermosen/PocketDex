using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Domain
{
    public class Pokemon
    {
        [Key]
        public int PokemonId { get; set; }
        public string PokedexNumber { get; set; }

        public string Name { get; set; }

        [DataType(DataType.ImageUrl)]
        public string Sprite { get; set; }

        public string Types { get; set; }

        public string Moves { get; set; }

        public string Abilities { get; set; }

        public string LocationLat { get; set; }

        public string LocationLong { get; set; }
    }
}
