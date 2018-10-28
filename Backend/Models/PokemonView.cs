using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;
using Domain;

namespace Backend.Models
{
    public class PokemonView:Pokemon
    {
        [Display(Name = "Sprite")]
        public HttpPostedFileBase SpriteFile { get; set; }
    }
}