name := "wfairclough"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaCore,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.0",
  "org.webjars" % "angularjs" % "1.2.13",
  "org.webjars" % "jquery" % "2.1.0-2",
  "org.webjars" % "modernizr" % "2.6.2-1",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.10.2"
)     

play.Project.playScalaSettings
