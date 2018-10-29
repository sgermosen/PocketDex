using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Data.Entity.Infrastructure;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Threading.Tasks;
using System.Web.Http;
using System.Web.Http.Description;
using Api.Models;
using Domain;

namespace Api.Controllers
{
    public class PokemonsController : ApiController
    {
        private readonly DataContext _db = new DataContext();

        // GET: api/Pokemons
        public async Task<IHttpActionResult> GetPokemons()
        {
            var pokemons = await _db.Pokemons.ToArrayAsync();
            var list = new List<PokemonResponse>();
            foreach (var poke in pokemons)
            {
                list.Add(new PokemonResponse
                {
                    PokemonId = poke.PokemonId,
                    Sprite = poke.Sprite,
                    Name = poke.Name,
                    PokedexNumber = poke.PokedexNumber,
                    Types = poke.Types,
                    Moves = poke.Moves,
                    Abilities = poke.Abilities,
                    LocationLat = poke.LocationLat,
                    LocationLong = poke.LocationLong,
                    //Teams = league.Teams.ToList(),
                });
            }

            return Ok(list);
        }

        // GET: api/Pokemons/5
        [ResponseType(typeof(Pokemon))]
        public async Task<IHttpActionResult> GetPokemon(int id)
        {
            Pokemon pokemon = await _db.Pokemons.FindAsync(id);
            if (pokemon == null)
            {
                return NotFound();
            }

            return Ok(pokemon);
        }

       

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                _db.Dispose();
            }
            base.Dispose(disposing);
        }

        private bool PokemonExists(int id)
        {
            return _db.Pokemons.Count(e => e.PokemonId == id) > 0;
        }
    }
}