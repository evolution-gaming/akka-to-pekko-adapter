package akka.management.cluster

package object bootstrap {
  type ClusterBootstrap =
    org.apache.pekko.management.cluster.bootstrap.ClusterBootstrap
  val ClusterBootstrap
      : org.apache.pekko.management.cluster.bootstrap.ClusterBootstrap.type =
    org.apache.pekko.management.cluster.bootstrap.ClusterBootstrap
}
