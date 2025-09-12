package akka.http.scaladsl

package object marshalling {
  type Marshal[A] = org.apache.pekko.http.scaladsl.marshalling.Marshal[A]
  val Marshal: org.apache.pekko.http.scaladsl.marshalling.Marshal.type =
    org.apache.pekko.http.scaladsl.marshalling.Marshal
  type ToEntityMarshaller[A] =
    org.apache.pekko.http.scaladsl.marshalling.ToEntityMarshaller[A]
}
