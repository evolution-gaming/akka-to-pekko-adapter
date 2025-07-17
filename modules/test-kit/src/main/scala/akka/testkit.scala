package akka

package object testkit {
  type DefaultTimeout = org.apache.pekko.testkit.DefaultTimeout
  type ImplicitSender = org.apache.pekko.testkit.ImplicitSender
  type TestProbe = org.apache.pekko.testkit.TestProbe
  val TestProbe: org.apache.pekko.testkit.TestProbe.type =
    org.apache.pekko.testkit.TestProbe
  type TestKit = org.apache.pekko.testkit.TestKit
  val TestKit: org.apache.pekko.testkit.TestKit.type =
    org.apache.pekko.testkit.TestKit
  type TestKitBase = org.apache.pekko.testkit.TestKitBase
  type TestActor = org.apache.pekko.testkit.TestActor
  val TestActor: org.apache.pekko.testkit.TestActor.type =
    org.apache.pekko.testkit.TestActor
}
