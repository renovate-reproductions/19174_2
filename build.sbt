lazy val root = (project in file("."))

scalaVersion := "2.13.10"

val tapirVersion = "1.2.4"
val jacksonVersion = "2.14.1"

libraryDependencies ++= Seq(
  "com.softwaremill.sttp.tapir" %% "tapir-play-server" % tapirVersion,
  "com.softwaremill.sttp.tapir" %% "tapir-swagger-ui" % tapirVersion,
)

dependencyOverrides ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-annotations" % jacksonVersion,
  "com.fasterxml.jackson.core" % "jackson-core" % jacksonVersion,
)
