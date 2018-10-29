using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using PoketDex.Models;
using Realms;

namespace PoketDex.Services
{
    public class DbService
    {
        protected Realm RealmInstance;
        public DbService()
        {
            RealmInstance = Realm.GetInstance();
        }

        public List<PokeFav> GetAllFavorites()
        {
            try
            {
                var list =RealmInstance.All<PokeFav>().ToList();
                return list;
            }
            catch (Exception e)
            {
                return new List<PokeFav>();
            }
          
            //var pokeList = RealmInstance.All<PokeFav>();
            //var pokeReturn = new List<Poke>();
            //foreach (var pokemon in pokeList)
            //{
            //    var poke = new Poke
            //    {
            //        PokemonId = pokemon.PokemonId,
            //        SpriteArray = pokemon.SpriteArray,
            //        LocationLong = pokemon.LocationLong,
            //        LocationLat = pokemon.LocationLat,
            //        Abilities = pokemon.Abilities,
            //        Moves = pokemon.Moves,
            //        Types = pokemon.Types,
            //        PokedexNumber = pokemon.PokedexNumber,
            //        Name = pokemon.Name
            //    };
            //    pokeReturn.Add(poke);
            //}
           
            //return pokeReturn;

        }

        public bool SavePokemon(Poke pokemon)
        {
            try
            {
                RealmInstance.Write(() =>
                {
                    RealmInstance.Add(new PokeFav
                    {
                        PokemonId = pokemon.PokemonId,
                        Sprite= pokemon.Sprite,
                        SpriteArray = pokemon.SpriteArray,
                        LocationLong = pokemon.LocationLong,
                        LocationLat = pokemon.LocationLat,
                        Abilities = pokemon.Abilities,
                        Moves = pokemon.Moves,
                        Types = pokemon.Types,
                        PokedexNumber = pokemon.PokedexNumber,
                        Name = pokemon.Name
                    });
                });
                // RealmInstance.Write(() =>
                //{
                //    var pokefav = RealmInstance.CreateObject<PokeFav>(pokemon);
                //    pokefav.PokemonId = pokemon.PokemonId;
                //});
                return true;
            }
            catch (Exception e)
            {
                return false;
            }



        }

        public bool RemovePokemon(Poke pokemon)
        {
            try
            {
                var obj = RealmInstance.All<PokeFav>().FirstOrDefault(b => b.PokemonId == pokemon.PokemonId);
                using (var trans = RealmInstance.BeginWrite())
                {
                    RealmInstance.Remove(obj);
                    trans.Commit();
                }
                return true;
            }
            catch (Exception e)
            {
                return false;
            }



        }
    }
}
