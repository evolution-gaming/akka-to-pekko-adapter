package akka

package object util {
  type Timeout = org.apache.pekko.util.Timeout
  val Timeout: org.apache.pekko.util.Timeout.type =
    org.apache.pekko.util.Timeout
  type Version = org.apache.pekko.util.Version
  val Version: org.apache.pekko.util.Version.type =
    org.apache.pekko.util.Version
}
