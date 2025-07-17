import sbt._

object Dependencies {
  object Pekko {
    val PekkoVersion = "1.1.3"
    val PekkoHttpVersion = "1.1.0"
    val actor = "org.apache.pekko" %% "pekko-actor" % PekkoVersion
    val cluster = "org.apache.pekko" %% "pekko-cluster" % PekkoVersion
    val stream = "org.apache.pekko" %% "pekko-stream" % PekkoVersion
    val sharding = "org.apache.pekko" %% "pekko-cluster-sharding" % PekkoVersion
    val http = "org.apache.pekko" %% "pekko-http" % PekkoHttpVersion
    val spray = "org.apache.pekko" %% "pekko-http-spray-json" % PekkoHttpVersion
    val management = "org.apache.pekko" %% "pekko-management" % PekkoHttpVersion
    val bootstrap =
      "org.apache.pekko" %% "pekko-management-cluster-bootstrap" % PekkoHttpVersion
    val `cluster-http` =
      "org.apache.pekko" %% "pekko-management-cluster-http" % PekkoHttpVersion
    val `test-kit` =
      "org.apache.pekko" %% "pekko-testkit" % PekkoVersion
  }
}
