package akka.http.scaladsl

package object unmarshalling {
  type Unmarshal[A] =
    org.apache.pekko.http.scaladsl.unmarshalling.Unmarshal[A]
  val Unmarshal: org.apache.pekko.http.scaladsl.unmarshalling.Unmarshal.type =
    org.apache.pekko.http.scaladsl.unmarshalling.Unmarshal
  type Unmarshaller[A, B] =
    org.apache.pekko.http.scaladsl.unmarshalling.Unmarshaller[A, B]
  val Unmarshaller
      : org.apache.pekko.http.scaladsl.unmarshalling.Unmarshaller.type =
    org.apache.pekko.http.scaladsl.unmarshalling.Unmarshaller
  type FromEntityUnmarshaller[A] =
    org.apache.pekko.http.scaladsl.unmarshalling.FromEntityUnmarshaller[A]
  type FromResponseUnmarshaller[A] =
    org.apache.pekko.http.scaladsl.unmarshalling.FromResponseUnmarshaller[A]
  type FromMessageUnmarshaller[A] =
    org.apache.pekko.http.scaladsl.unmarshalling.FromMessageUnmarshaller[A]
}
