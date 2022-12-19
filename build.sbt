lazy val root = (project in file("."))

scalaVersion := "2.13.10"

val jacksonVersion = "2.13.1"

dependencyOverrides ++= Seq(
  "com.fasterxml.jackson.core" % "jackson-annotations" % jacksonVersion
)
