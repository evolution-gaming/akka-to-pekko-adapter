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

  type Directive[L] = org.apache.pekko.http.scaladsl.server.Directive[L]
  val Directive: org.apache.pekko.http.scaladsl.server.Directive.type =
    org.apache.pekko.http.scaladsl.server.Directive
  type Directive0 = org.apache.pekko.http.scaladsl.server.Directive0
  type Directive1[T] = org.apache.pekko.http.scaladsl.server.Directive1[T]
  type RequestContext = org.apache.pekko.http.scaladsl.server.RequestContext
  type RouteResult = org.apache.pekko.http.scaladsl.server.RouteResult
  val RouteResult: org.apache.pekko.http.scaladsl.server.RouteResult.type =
    org.apache.pekko.http.scaladsl.server.RouteResult
  type StandardRoute = org.apache.pekko.http.scaladsl.server.StandardRoute
  val StandardRoute: org.apache.pekko.http.scaladsl.server.StandardRoute.type =
    org.apache.pekko.http.scaladsl.server.StandardRoute
  type Rejection = org.apache.pekko.http.scaladsl.server.Rejection
  type PathMatcher[L] = org.apache.pekko.http.scaladsl.server.PathMatcher[L]
  val PathMatcher: org.apache.pekko.http.scaladsl.server.PathMatcher.type =
    org.apache.pekko.http.scaladsl.server.PathMatcher
  type PathMatcher1[T] = org.apache.pekko.http.scaladsl.server.PathMatcher1[T]
  type PathMatchers = org.apache.pekko.http.scaladsl.server.PathMatchers
  val PathMatchers: org.apache.pekko.http.scaladsl.server.PathMatchers.type =
    org.apache.pekko.http.scaladsl.server.PathMatchers
  type RouteConcatenation =
    org.apache.pekko.http.scaladsl.server.RouteConcatenation
  val RouteConcatenation
      : org.apache.pekko.http.scaladsl.server.RouteConcatenation.type =
    org.apache.pekko.http.scaladsl.server.RouteConcatenation
  type RouteGenerator[T] =
    org.apache.pekko.http.scaladsl.server.RouteGenerator[T]
}
