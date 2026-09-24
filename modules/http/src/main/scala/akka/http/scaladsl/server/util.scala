package akka.http.scaladsl.server

package object util {
  type Tuple[T] = org.apache.pekko.http.scaladsl.server.util.Tuple[T]
  val Tuple: org.apache.pekko.http.scaladsl.server.util.Tuple.type =
    org.apache.pekko.http.scaladsl.server.util.Tuple
  type Tupler[T] = org.apache.pekko.http.scaladsl.server.util.Tupler[T]
  val Tupler: org.apache.pekko.http.scaladsl.server.util.Tupler.type =
    org.apache.pekko.http.scaladsl.server.util.Tupler
  type ApplyConverter[L] =
    org.apache.pekko.http.scaladsl.server.util.ApplyConverter[L]
  val ApplyConverter
      : org.apache.pekko.http.scaladsl.server.util.ApplyConverter.type =
    org.apache.pekko.http.scaladsl.server.util.ApplyConverter
  val TupleOps: org.apache.pekko.http.scaladsl.server.util.TupleOps.type =
    org.apache.pekko.http.scaladsl.server.util.TupleOps
}
