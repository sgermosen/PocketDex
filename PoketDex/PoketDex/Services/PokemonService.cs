namespace PoketDex.Services
{
    using Newtonsoft.Json;
    using Interfaces;
    using Models;
    using System;
    using System.Collections.Generic;
    using System.Net.Http;
    using System.Threading.Tasks;

    public class PokemonService : IPokemonService
    {
        public async Task<IEnumerable<Poke>> GetAllPokemonsAsync(int id)
        {
            var result = new List<Poke>();

            try
            {
                var client = new HttpClient();
                var ruta = "https://pokemonapi.azurewebsites.net/api/pokemons";
                if (id != 0)
                {
                    ruta += $"/{id}";
                }

                var response = await client.GetStringAsync(ruta);
                result = JsonConvert.DeserializeObject<List<Poke>>(response);

            }
            catch (Exception e)
            {
                return result;
            }

            return result;
        }
    }
}
