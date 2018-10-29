namespace PoketDex.Models
{
    using Newtonsoft.Json;

    public partial class Species
    {
        [JsonProperty("url")]
        public string Url { get; set; }

        [JsonProperty("name")]
        public string Name { get; set; }
    }
}
