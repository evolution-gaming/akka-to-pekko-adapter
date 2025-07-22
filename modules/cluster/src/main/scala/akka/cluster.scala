package akka
import org.apache.pekko.cluster.privates
import org.apache.pekko.util.Version

package object cluster {
  type Cluster = org.apache.pekko.cluster.Cluster
  val Cluster: org.apache.pekko.cluster.Cluster.type =
    org.apache.pekko.cluster.Cluster
  type Member = org.apache.pekko.cluster.Member
  object Member {
    val none = org.apache.pekko.cluster.Member.none
    def apply(
        uniqueAddress: UniqueAddress,
        roles: Set[String],
        appVersion: Version
    ): Member =
      privates.Member(uniqueAddress, roles, appVersion)
  }
  type MemberStatus = org.apache.pekko.cluster.MemberStatus
  val MemberStatus: org.apache.pekko.cluster.MemberStatus.type =
    org.apache.pekko.cluster.MemberStatus
  type UniqueAddress = org.apache.pekko.cluster.UniqueAddress
  val UniqueAddress: org.apache.pekko.cluster.UniqueAddress.type =
    org.apache.pekko.cluster.UniqueAddress
  type ClusterSettings = org.apache.pekko.cluster.ClusterSettings
  object ClusterEvent {
    val InitialStateAsEvents =
      org.apache.pekko.cluster.ClusterEvent.InitialStateAsEvents
    type MemberEvent = org.apache.pekko.cluster.ClusterEvent.MemberEvent
    type MemberJoined = org.apache.pekko.cluster.ClusterEvent.MemberJoined
    val MemberJoined: org.apache.pekko.cluster.ClusterEvent.MemberJoined.type =
      org.apache.pekko.cluster.ClusterEvent.MemberJoined
    type MemberWeaklyUp = org.apache.pekko.cluster.ClusterEvent.MemberWeaklyUp
    val MemberWeaklyUp
        : org.apache.pekko.cluster.ClusterEvent.MemberWeaklyUp.type =
      org.apache.pekko.cluster.ClusterEvent.MemberWeaklyUp
    type MemberUp = org.apache.pekko.cluster.ClusterEvent.MemberUp
    val MemberUp: org.apache.pekko.cluster.ClusterEvent.MemberUp.type =
      org.apache.pekko.cluster.ClusterEvent.MemberUp
    type MemberLeft = org.apache.pekko.cluster.ClusterEvent.MemberLeft
    val MemberLeft: org.apache.pekko.cluster.ClusterEvent.MemberLeft.type =
      org.apache.pekko.cluster.ClusterEvent.MemberLeft
    type MemberExited = org.apache.pekko.cluster.ClusterEvent.MemberExited
    val MemberExited: org.apache.pekko.cluster.ClusterEvent.MemberExited.type =
      org.apache.pekko.cluster.ClusterEvent.MemberExited
    type MemberRemoved = org.apache.pekko.cluster.ClusterEvent.MemberRemoved
    val MemberRemoved
        : org.apache.pekko.cluster.ClusterEvent.MemberRemoved.type =
      org.apache.pekko.cluster.ClusterEvent.MemberRemoved
    type UnreachableMember =
      org.apache.pekko.cluster.ClusterEvent.UnreachableMember
    val UnreachableMember
        : org.apache.pekko.cluster.ClusterEvent.UnreachableMember.type =
      org.apache.pekko.cluster.ClusterEvent.UnreachableMember
    type ReachableMember = org.apache.pekko.cluster.ClusterEvent.ReachableMember
    val ReachableMember
        : org.apache.pekko.cluster.ClusterEvent.ReachableMember.type =
      org.apache.pekko.cluster.ClusterEvent.ReachableMember
    type MemberPreparingForShutdown =
      org.apache.pekko.cluster.ClusterEvent.MemberPreparingForShutdown
    val MemberPreparingForShutdown
        : org.apache.pekko.cluster.ClusterEvent.MemberPreparingForShutdown.type =
      org.apache.pekko.cluster.ClusterEvent.MemberPreparingForShutdown
    type MemberReadyForShutdown =
      org.apache.pekko.cluster.ClusterEvent.MemberReadyForShutdown
    val MemberReadyForShutdown
        : org.apache.pekko.cluster.ClusterEvent.MemberReadyForShutdown.type =
      org.apache.pekko.cluster.ClusterEvent.MemberReadyForShutdown
    type MemberDowned = org.apache.pekko.cluster.ClusterEvent.MemberDowned
    val MemberDowned: org.apache.pekko.cluster.ClusterEvent.MemberDowned.type =
      org.apache.pekko.cluster.ClusterEvent.MemberDowned
    type ClusterDomainEvent =
      org.apache.pekko.cluster.ClusterEvent.ClusterDomainEvent
    type SeenChanged = privates.SeenChanged
    object SeenChanged {
      def unapply(event: SeenChanged) =
        privates.SeenChanged.unapply(event)
    }
    type ReachabilityChanged = privates.ReachabilityChanged
    object ReachabilityChanged {
      def unapply(event: ReachabilityChanged) =
        privates.ReachabilityChanged.unapply(event)
    }
    type CurrentClusterState =
      org.apache.pekko.cluster.ClusterEvent.CurrentClusterState
    val CurrentClusterState
        : org.apache.pekko.cluster.ClusterEvent.CurrentClusterState.type =
      org.apache.pekko.cluster.ClusterEvent.CurrentClusterState
  }
  type JoinConfigCompatChecker =
    org.apache.pekko.cluster.JoinConfigCompatChecker
  val JoinConfigCompatChecker
      : org.apache.pekko.cluster.JoinConfigCompatChecker.type =
    org.apache.pekko.cluster.JoinConfigCompatChecker
  type ConfigValidation = org.apache.pekko.cluster.ConfigValidation
  type DowningProvider = org.apache.pekko.cluster.DowningProvider
  val Valid = org.apache.pekko.cluster.Valid
}

package object remote {
  object artery {
    type ThisActorSystemQuarantinedEvent =
      org.apache.pekko.remote.artery.ThisActorSystemQuarantinedEvent
  }
}
