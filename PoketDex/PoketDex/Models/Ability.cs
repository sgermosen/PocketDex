namespace PoketDex.Models
{
    using Newtonsoft.Json;

    public partial class Ability
    {
        [JsonProperty("slot")]
        public long? Slot { get; set; }

        [JsonProperty("is_hidden")]
        public bool? IsHidden { get; set; }

        [JsonProperty("ability")]
        public Species AbilityAbility { get; set; }
    }
}
