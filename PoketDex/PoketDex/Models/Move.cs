namespace PoketDex.Models
{
    using Newtonsoft.Json;
    using System.Collections.Generic;

    public partial class Move
    {
        [JsonProperty("version_group_details")]
        public List<VersionGroupDetail> VersionGroupDetails { get; set; }

        [JsonProperty("move")]
        public Species MoveMove { get; set; }
    }
}
