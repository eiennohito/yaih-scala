import sbt._

organization := "org.eiennohito"

name := "squeryl-test"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.1"

moduleName := "plast_calc"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"

libraryDependencies ++=
					Seq("org.scalaz" %% "scalaz-core" % "6.0.3",
						"com.github.jsuereth.scala-arm" %% "scala-arm" % "1.0",
						"org.squeryl" %% "squeryl" % "0.9.4",
						"mysql" % "mysql-connector-java" % "5.1.10")

libraryDependencies += "com.github.scala-incubator.io" %% "scala-io-core" % "0.2.0"

libraryDependencies +=  "com.github.scala-incubator.io" %% "scala-io-file" % "0.2.0"

libraryDependencies ++= {
  val liftVersion = "2.4-M4" // Put the current/latest lift version here
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-wizard" % liftVersion % "compile->default",
	"javax.servlet" % "servlet-api" % "2.5" % "provided->default")
}

parallelExecution := true