import sbt.*

object Dependencies {
  object Pekko {
    val PekkoVersion = "1.2.0"
    val PekkoHttpVersion = "1.2.0"
    val PekkoManagementVersion = "1.1.1"
    val actor = "org.apache.pekko" %% "pekko-actor" % PekkoVersion
    val persistence = "org.apache.pekko" %% "pekko-persistence" % PekkoVersion
    val cluster = "org.apache.pekko" %% "pekko-cluster" % PekkoVersion
    val stream = "org.apache.pekko" %% "pekko-stream" % PekkoVersion
    val sharding = "org.apache.pekko" %% "pekko-cluster-sharding" % PekkoVersion
    val http = "org.apache.pekko" %% "pekko-http" % PekkoHttpVersion
    val spray = "org.apache.pekko" %% "pekko-http-spray-json" % PekkoHttpVersion
    val management =
      "org.apache.pekko" %% "pekko-management" % PekkoManagementVersion
    val bootstrap =
      "org.apache.pekko" %% "pekko-management-cluster-bootstrap" % PekkoManagementVersion
    val `cluster-http` =
      "org.apache.pekko" %% "pekko-management-cluster-http" % PekkoManagementVersion
    val `test-kit` =
      "org.apache.pekko" %% "pekko-testkit" % PekkoVersion
  }
}
