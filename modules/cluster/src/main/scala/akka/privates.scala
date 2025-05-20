package org.apache.pekko.cluster

import org.apache.pekko.util.Version

package object privates {
  type SeenChanged = org.apache.pekko.cluster.ClusterEvent.SeenChanged
  object SeenChanged {
    def unapply(event: SeenChanged) =
      org.apache.pekko.cluster.ClusterEvent.SeenChanged.unapply(event)
  }
  type ReachabilityChanged =
    org.apache.pekko.cluster.ClusterEvent.ReachabilityChanged
  object ReachabilityChanged {
    def unapply(event: ReachabilityChanged) =
      org.apache.pekko.cluster.ClusterEvent.ReachabilityChanged.unapply(event)
  }
  type Reachability = org.apache.pekko.cluster.Reachability

  object Member {
    def apply(
        uniqueAddress: UniqueAddress,
        roles: Set[String],
        appVersion: Version
    ): Member =
      org.apache.pekko.cluster.Member(uniqueAddress, roles, appVersion)
  }
}
