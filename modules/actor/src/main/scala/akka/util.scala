package akka

package object util {
  type Timeout = org.apache.pekko.util.Timeout
  val Timeout: org.apache.pekko.util.Timeout.type =
    org.apache.pekko.util.Timeout
  type Version = org.apache.pekko.util.Version
  val Version: org.apache.pekko.util.Version.type =
    org.apache.pekko.util.Version
  type ByteString = org.apache.pekko.util.ByteString
  val ByteString: org.apache.pekko.util.ByteString.type =
    org.apache.pekko.util.ByteString
}
