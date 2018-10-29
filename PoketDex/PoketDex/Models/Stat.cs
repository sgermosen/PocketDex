namespace PoketDex.Models
{
    using Newtonsoft.Json;

    public partial class Stat
    {
        [JsonProperty("stat")]
        public Species StatStat { get; set; }

        [JsonProperty("effort")]
        public long? Effort { get; set; }

        [JsonProperty("base_stat")]
        public long? BaseStat { get; set; }
    }
}
