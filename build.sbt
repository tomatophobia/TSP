name := "TSP"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "2.1.0"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.1"
libraryDependencies += "org.scala-lang.modules" %% "scala-async" % "0.10.0"
libraryDependencies += "org.scala-lang.plugins" %% "scala-continuations-library" % "1.0.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.21",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.21" % Test
)
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % "2.5.21",
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.21" % Test
)
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.1.7",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.1.7" % Test
)
libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % "2.5.21"
libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding" %  "2.5.21"
libraryDependencies += "com.typesafe.akka" %% "akka-distributed-data" % "2.5.21"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence" % "2.5.21"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.27"
libraryDependencies += "org.scalaz" %% "scalaz-effect" % "7.2.27"
libraryDependencies += "org.scalaz" %% "scalaz-ioeffect" % "2.9.0"
