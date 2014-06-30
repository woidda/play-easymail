import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "play-easymail"
    val libVersion      = "0.5-SNAPSHOT"

    val appDependencies = Seq(
        javaCore
    )

    val main = play.Project(appName, libVersion, appDependencies).settings(
      	version := libVersion,
     	  organization := "com.feth",
      	libraryDependencies += "com.typesafe" %% "play-plugins-mailer" % "2.2.0",
        publishArtifact in packageDoc := false
    )
}