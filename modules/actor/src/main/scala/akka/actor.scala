package akka

package object actor {
  type ActorRef = org.apache.pekko.actor.ActorRef
  val ActorRef: org.apache.pekko.actor.ActorRef.type =
    org.apache.pekko.actor.ActorRef
  type ActorSystem = org.apache.pekko.actor.ActorSystem
  val ActorSystem: org.apache.pekko.actor.ActorSystem.type =
    org.apache.pekko.actor.ActorSystem
  type ActorSystemSetup = org.apache.pekko.actor.setup.ActorSystemSetup
  val ActorSystemSetup: org.apache.pekko.actor.setup.ActorSystemSetup.type =
    org.apache.pekko.actor.setup.ActorSystemSetup
  type Setup = org.apache.pekko.actor.setup.Setup
  type BootstrapSetup = org.apache.pekko.actor.BootstrapSetup
  val BootstrapSetup: org.apache.pekko.actor.BootstrapSetup.type =
    org.apache.pekko.actor.BootstrapSetup
  type Props = org.apache.pekko.actor.Props
  val Props: org.apache.pekko.actor.Props.type = org.apache.pekko.actor.Props
  type Actor = org.apache.pekko.actor.Actor
  val Actor: org.apache.pekko.actor.Actor.type = org.apache.pekko.actor.Actor
  type ActorLogging = org.apache.pekko.actor.ActorLogging
  type ActorContext = org.apache.pekko.actor.ActorContext
  type ActorRefFactory = org.apache.pekko.actor.ActorRefFactory
  type ActorSelection = org.apache.pekko.actor.ActorSelection
  type ActorPath = org.apache.pekko.actor.ActorPath
  val ActorPath: org.apache.pekko.actor.ActorPath.type =
    org.apache.pekko.actor.ActorPath
  type ActorRefProvider = org.apache.pekko.actor.ActorRefProvider
  type Address = org.apache.pekko.actor.Address
  val Address: org.apache.pekko.actor.Address.type =
    org.apache.pekko.actor.Address
  type RootActorPath = org.apache.pekko.actor.RootActorPath
  val RootActorPath: org.apache.pekko.actor.RootActorPath.type =
    org.apache.pekko.actor.RootActorPath
  type Timers = org.apache.pekko.actor.Timers
  val AddressFromURIString = org.apache.pekko.actor.AddressFromURIString
  type CoordinatedShutdown = org.apache.pekko.actor.CoordinatedShutdown
  val CoordinatedShutdown: org.apache.pekko.actor.CoordinatedShutdown.type =
    org.apache.pekko.actor.CoordinatedShutdown
  type ExtendedActorSystem = org.apache.pekko.actor.ExtendedActorSystem
  type Scheduler = org.apache.pekko.actor.Scheduler
  val Scheduler: org.apache.pekko.actor.Scheduler.type =
    org.apache.pekko.actor.Scheduler
}
