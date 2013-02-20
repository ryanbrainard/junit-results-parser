import sbt._
import Keys._

object Build extends Build {

  val junitResultsParser = Project("junit-results-parser", file(".")) settings(
    organization := "com.ryanbrainard",
    name := "junit-results-parser",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.10.0",
    crossScalaVersions := Seq("2.10.0"),
    libraryDependencies ++= dependencies
  )

  def dependencies = Seq(
  )
}
