package akka.http.scaladsl

package object server {

  type Directives = org.apache.pekko.http.scaladsl.server.Directives
  val Directives: org.apache.pekko.http.scaladsl.server.Directives.type =
    org.apache.pekko.http.scaladsl.server.Directives
  type Route = org.apache.pekko.http.scaladsl.server.Route
  val Route: org.apache.pekko.http.scaladsl.server.Route.type =
    org.apache.pekko.http.scaladsl.server.Route
  type RejectionError = org.apache.pekko.http.scaladsl.server.RejectionError
  val RejectionError
      : org.apache.pekko.http.scaladsl.server.RejectionError.type =
    org.apache.pekko.http.scaladsl.server.RejectionError
  type ValidationRejection =
    org.apache.pekko.http.scaladsl.server.ValidationRejection
  val ValidationRejection
      : org.apache.pekko.http.scaladsl.server.ValidationRejection.type =
    org.apache.pekko.http.scaladsl.server.ValidationRejection
}
