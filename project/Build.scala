import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "draft"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "javax.mail" % "mail" % "1.4.5",
      "mysql" % "mysql-connector-java" % "5.1.18",
      "com.github.play2war" %% "play2-war-core" % "0.5"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      resolvers += "Play2war plugins release" at "http://repository-play-war.forge.cloudbees.com/release/"
    )

}
