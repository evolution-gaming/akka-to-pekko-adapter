package akka.stream

package object scaladsl {
  type Flow[A, B, C] = org.apache.pekko.stream.scaladsl.Flow[A, B, C]
  val Flow: org.apache.pekko.stream.scaladsl.Flow.type =
    org.apache.pekko.stream.scaladsl.Flow
  type Source[A, B] = org.apache.pekko.stream.scaladsl.Source[A, B]
  val Source: org.apache.pekko.stream.scaladsl.Source.type =
    org.apache.pekko.stream.scaladsl.Source
  type Sink[A, B] = org.apache.pekko.stream.scaladsl.Sink[A, B]
  val Sink: org.apache.pekko.stream.scaladsl.Sink.type =
    org.apache.pekko.stream.scaladsl.Sink
  type RunnableGraph[A] = org.apache.pekko.stream.scaladsl.RunnableGraph[A]
  type SourceQueue[A] = org.apache.pekko.stream.scaladsl.SourceQueue[A]
  val Keep: org.apache.pekko.stream.scaladsl.Keep.type =
    org.apache.pekko.stream.scaladsl.Keep
}
