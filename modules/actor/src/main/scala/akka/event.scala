package akka

package object event {
  type LoggingAdapter = org.apache.pekko.event.LoggingAdapter
  val Logging: org.apache.pekko.event.Logging.type =
    org.apache.pekko.event.Logging
  type EventStream = org.apache.pekko.event.EventStream
  type LoggingFilter = org.apache.pekko.event.LoggingFilter
}
