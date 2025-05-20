package akka.stream

package object scaladsl {
  type Flow[A, B, C] = org.apache.pekko.stream.scaladsl.Flow[A, B, C]
  type Source[A, B] = org.apache.pekko.stream.scaladsl.Source[A, B]
  type Sink[A, B] = org.apache.pekko.stream.scaladsl.Sink[A, B]
  type RunnableGraph[A] = org.apache.pekko.stream.scaladsl.RunnableGraph[A]
  val Keep: org.apache.pekko.stream.scaladsl.Keep.type =
    org.apache.pekko.stream.scaladsl.Keep
}
