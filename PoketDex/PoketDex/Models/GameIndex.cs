namespace PoketDex.Models
{
    using Newtonsoft.Json;

    public partial class GameIndex
    {
        [JsonProperty("version")]
        public Species Version { get; set; }

        [JsonProperty("game_index")]
        public long? GameIndexGameIndex { get; set; }
    }
}
