import sbt._

object Dependencies {
  object Pekko {
    val PekkoVersion = "1.1.3"
    val PekkoHttpVersion = "1.1.0"
    val actor = "org.apache.pekko" %% "pekko-actor" % PekkoVersion
    val cluster = "org.apache.pekko" %% "pekko-cluster" % PekkoVersion
    val stream = "org.apache.pekko" %% "pekko-stream" % PekkoVersion
    val sharding = "org.apache.pekko" %% "pekko-cluster-sharding" % PekkoVersion
  }
}
