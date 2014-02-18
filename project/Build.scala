import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  libraryDependencies ++= Seq(

  )

  val appName         = "scalditestpro"
  val appVersion      = "1.0-SNAPSHOT"

  val repository = play.Project(appName + "-repository", appVersion, path = file("modules/repository"))

  val main = play.Project(appName, appVersion).settings(
    // Add your own project settings here
  ).dependsOn(repository).aggregate(repository)

}