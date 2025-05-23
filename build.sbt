import Dependencies._
import sbt._

ThisBuild / versionScheme := Some("early-semver")

def crossSettings[T](scalaVersion: String, if3: List[T], if2: List[T]) =
  CrossVersion.partialVersion(scalaVersion) match {
    case Some((3, _))       => if3
    case Some((2, 12 | 13)) => if2
    case _                  => Nil
  }

lazy val commonSettings = Seq(
  organization := "com.evolution",
  homepage := Some(
    url("https://github.com/evolution-gaming/akka-to-pekko-adapter")
  ),
  startYear := Some(2025),
  organizationName := "Evolution",
  organizationHomepage := Some(url("https://evolution.com")),
  scalaVersion := crossScalaVersions.value.head,
  crossScalaVersions := Seq("2.13.16", "3.3.6"),
  licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT"))),
  scalacOptions ++= crossSettings(
    scalaVersion.value,
    if3 = List("-release:17"),
    if2 = List("-release:17", "-Xsource:3"),
  ),
  scalacOptsFailOnWarn := Some(false),
  publishTo := Some(Resolver.evolutionReleases),
)

val alias: Seq[sbt.Def.Setting[?]] =
  addCommandAlias("build", "+all compile test") ++
    addCommandAlias("check", "scalafmtCheck")

lazy val root =
  project
    .in(file("."))
    .settings(
      commonSettings,
      name := "akka-to-pekko-adapter",
      publish / skip := true,
      publishArtifact := false
    )
    .settings(alias)
    .aggregate(
      actor,
      cluster,
      stream,
      spray,
      http,
      management,
      `cluster-sharding`
    )

lazy val actor =
  project
    .in(file("modules/actor"))
    .settings(commonSettings)
    .settings(
      name := "akka-to-pekko-adapter-actor",
      libraryDependencies ++= Seq(
        Dependencies.Pekko.actor
      )
    )

lazy val cluster =
  project
    .in(file("modules/cluster"))
    .settings(commonSettings)
    .settings(
      name := "akka-to-pekko-adapter-cluster",
      libraryDependencies ++= Seq(
        Dependencies.Pekko.cluster
      )
    )

lazy val stream =
  project
    .in(file("modules/stream"))
    .settings(commonSettings)
    .settings(
      name := "akka-to-pekko-adapter-stream",
      libraryDependencies ++= Seq(
        Dependencies.Pekko.stream
      )
    )

lazy val `cluster-sharding` =
  project
    .in(file("modules/sharding"))
    .settings(commonSettings)
    .settings(
      name := "akka-to-pekko-adapter-sharding",
      libraryDependencies ++= Seq(
        Dependencies.Pekko.sharding
      )
    )

lazy val spray =
  project
    .in(file("modules/spray"))
    .settings(commonSettings)
    .settings(
      name := "akka-to-pekko-adapter-spray",
      libraryDependencies ++= Seq(
        Dependencies.Pekko.spray
      )
    )

lazy val http =
  project
    .in(file("modules/http"))
    .dependsOn(actor, stream)
    .settings(commonSettings)
    .settings(
      name := "akka-to-pekko-adapter-http",
      libraryDependencies ++= Seq(
        Dependencies.Pekko.http
      )
    )

lazy val management =
  project
    .in(file("modules/management"))
    .settings(commonSettings)
    .settings(
      name := "akka-to-pekko-adapter-management",
      libraryDependencies ++= Seq(
        Dependencies.Pekko.management,
        Dependencies.Pekko.bootstrap,
        Dependencies.Pekko.`cluster-http`
      )
    )
