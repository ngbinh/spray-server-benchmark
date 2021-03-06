name := "spray-server-benchmark"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "io.spray" %% "spray-http" % "1.3.3",
  "io.spray" %% "spray-can" % "1.3.3",
  "io.spray" %% "spray-routing" % "1.3.3",
  "com.typesafe.akka" %% "akka-http-experimental" % "1.0-M5",
  "io.undertow" % "undertow-core" % "1.1.0.Final",
  "com.typesafe.akka" %% "akka-actor" % "2.3.9"
)