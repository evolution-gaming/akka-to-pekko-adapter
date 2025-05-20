package akka.cluster

package object sharding {

  type ClusterSharding = org.apache.pekko.cluster.sharding.ClusterSharding
  val ClusterSharding: org.apache.pekko.cluster.sharding.ClusterSharding.type =
    org.apache.pekko.cluster.sharding.ClusterSharding
  type ShardCoordinator = org.apache.pekko.cluster.sharding.ShardCoordinator
  val ShardCoordinator
      : org.apache.pekko.cluster.sharding.ShardCoordinator.type =
    org.apache.pekko.cluster.sharding.ShardCoordinator
  val ShardRegion: org.apache.pekko.cluster.sharding.ShardRegion.type =
    org.apache.pekko.cluster.sharding.ShardRegion
  type ClusterShardingSettings =
    org.apache.pekko.cluster.sharding.ClusterShardingSettings
  val ClusterShardingSettings
      : org.apache.pekko.cluster.sharding.ClusterShardingSettings.type =
    org.apache.pekko.cluster.sharding.ClusterShardingSettings
}
