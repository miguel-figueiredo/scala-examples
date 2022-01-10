name := "testcontainers-scala"

version := "0.1"

scalaVersion := "2.12.10"

// Notes on the "... %% ... %" vs the "... % ... %" format:
// https://www.scala-sbt.org/1.x/docs/Library-Dependencies.html#Getting+the+right+Scala+version+with

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "2.8.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
libraryDependencies += "org.scalatest" %% "scalatest-funspec" % "3.2.9" % Test
libraryDependencies += "com.dimafeng" %% "testcontainers-scala-scalatest" % "0.39.5" % Test
libraryDependencies += "com.dimafeng" %% "testcontainers-scala-kafka" % "0.39.5" % Test
libraryDependencies += "com.dimafeng" %% "testcontainers-scala-elasticsearch" % "0.39.5" % Test
libraryDependencies += "com.dimafeng" %% "testcontainers-scala-mysql" % "0.39.5" % Test

// This allows for graceful shutdown of containers once the tests have finished running
Test / fork := true
