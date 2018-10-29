namespace PoketDex.Models
{
    using Newtonsoft.Json;
    using System.Collections.Generic;

    public partial class Pokemon
    {
        [JsonProperty("forms")]
        public List<Species> Forms { get; set; }

        [JsonProperty("abilities")]
        public List<Ability> Abilities { get; set; }

        [JsonProperty("stats")]
        public List<Stat> Stats { get; set; }

        [JsonProperty("name")]
        public string Name { get; set; }

        [JsonProperty("weight")]
        public long? Weight { get; set; }

        [JsonProperty("moves")]
        public List<Move> Moves { get; set; }

        [JsonProperty("sprites")]
        public Sprites Sprites { get; set; }

        [JsonProperty("held_items")]
        public List<object> HeldItems { get; set; }

        [JsonProperty("location_area_encounters")]
        public string LocationAreaEncounters { get; set; }

        [JsonProperty("height")]
        public long? Height { get; set; }

        [JsonProperty("is_default")]
        public bool? IsDefault { get; set; }

        [JsonProperty("species")]
        public Species Species { get; set; }

        [JsonProperty("id")]
        public long? Id { get; set; }

        [JsonProperty("order")]
        public long? Order { get; set; }

        [JsonProperty("game_indices")]
        public List<GameIndex> GameIndices { get; set; }

        [JsonProperty("base_experience")]
        public long? BaseExperience { get; set; }

        [JsonProperty("types")]
        public List<TypeElement> Types { get; set; }
    }
}
