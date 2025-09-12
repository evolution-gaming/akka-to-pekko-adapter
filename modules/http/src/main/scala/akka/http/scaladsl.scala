package akka.http

package object scaladsl {
  val Http: org.apache.pekko.http.scaladsl.Http.type =
    org.apache.pekko.http.scaladsl.Http
  type HttpExt = org.apache.pekko.http.scaladsl.HttpExt
  type HttpsConnectionContext =
    org.apache.pekko.http.scaladsl.HttpsConnectionContext
}
