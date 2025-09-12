package akka.http.scaladsl

package object settings {
  type ClientConnectionSettings =
    org.apache.pekko.http.scaladsl.settings.ClientConnectionSettings
  val ClientConnectionSettings
      : org.apache.pekko.http.scaladsl.settings.ClientConnectionSettings.type =
    org.apache.pekko.http.scaladsl.settings.ClientConnectionSettings
  type ConnectionPoolSettings =
    org.apache.pekko.http.scaladsl.settings.ConnectionPoolSettings
  val ConnectionPoolSettings
      : org.apache.pekko.http.scaladsl.settings.ConnectionPoolSettings.type =
    org.apache.pekko.http.scaladsl.settings.ConnectionPoolSettings
}
