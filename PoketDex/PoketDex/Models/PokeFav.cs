using Realms;

namespace PoketDex.Models
{
   public class PokeFav:RealmObject
    {
        // [PrimaryKey]
        public int PokemonId { get; set; }
        public string PokedexNumber { get; set; }

        public string Name { get; set; }

        public string Sprite { get; set; }

        public string Types { get; set; }

        public string Moves { get; set; }

        public string Abilities { get; set; }

        public string LocationLat { get; set; }

        public string LocationLong { get; set; }

        public string FullSprite
        {
            get {
                if (string.IsNullOrEmpty(Sprite))
                {
                    return "avatar_poke.png";
                }
                return string.Format("http://pokemonbackend.azurewebsites.net{0}", Sprite.Substring(1));
            }
        }

        public byte[] SpriteArray { get; internal set; }
    }
}
