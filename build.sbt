name := "mstt_scala_actors"

version := "0.1"

scalaVersion := "2.13.0"

resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

val AkkaVersion = "2.7.0"

libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion