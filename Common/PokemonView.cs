using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web;
using Domain;

namespace Common
{
    public class PokemonView:Pokemon
    {
        [Display(Name = "Sprite")]
        public HttpPostedFileBase SpriteFile { get; set; }
    }
}
