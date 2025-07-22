package akka

package object serialization {
  type Serializer = org.apache.pekko.serialization.Serializer
  val Serializers: org.apache.pekko.serialization.Serializers.type =
    org.apache.pekko.serialization.Serializers
  type SerializerWithStringManifest = org.apache.pekko.serialization.SerializerWithStringManifest
  type BaseSerializer = org.apache.pekko.serialization.BaseSerializer
  val BaseSerializer: org.apache.pekko.serialization.BaseSerializer.type =
    org.apache.pekko.serialization.BaseSerializer
}
