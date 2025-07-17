package akka

package object stream {
  @deprecated(
    "The Materializer now has all methods the ActorMaterializer used to have",
    "Akka 2.6.0"
  )
  type ActorMaterializer = org.apache.pekko.stream.ActorMaterializer
  type Materializer = org.apache.pekko.stream.Materializer
  val Materializer: org.apache.pekko.stream.Materializer.type =
    org.apache.pekko.stream.Materializer
  type Shape = org.apache.pekko.stream.Shape
  type Graph[A <: Shape, B] = org.apache.pekko.stream.Graph[A, B]
  type OverflowStrategy = org.apache.pekko.stream.OverflowStrategy
  val OverflowStrategy: org.apache.pekko.stream.OverflowStrategy.type =
    org.apache.pekko.stream.OverflowStrategy
  type QueueOfferResult = org.apache.pekko.stream.QueueOfferResult
  val QueueOfferResult: org.apache.pekko.stream.QueueOfferResult.type =
    org.apache.pekko.stream.QueueOfferResult
}
