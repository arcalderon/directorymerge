import Dependencies._
import sbt.Keys.libraryDependencies

ThisBuild / scalaVersion     := "2.12.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "dirdirectorymerge",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4"
  )


