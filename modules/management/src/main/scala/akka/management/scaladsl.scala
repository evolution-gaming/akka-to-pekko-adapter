package akka.management

package object scaladsl {
  type AkkaManagement = org.apache.pekko.management.scaladsl.PekkoManagement
  val AkkaManagement
      : org.apache.pekko.management.scaladsl.PekkoManagement.type =
    org.apache.pekko.management.scaladsl.PekkoManagement
}
