import sbt.Keys.scalaVersion

val scalactic = "org.scalactic" %% "scalactic" % "3.0.1"
val scalatest = "org.scalatest" %% "scalatest" % "3.0.1" % "test"

lazy val root = (project in file("."))
  .settings(
    name := "algorithms-scala",
    version := "1.0",
    scalaVersion := "2.12.2",
    libraryDependencies += scalactic,
    libraryDependencies += scalatest
  )