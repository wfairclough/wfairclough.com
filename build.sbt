name := "wfairclough"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  // jdbc,
  // anorm,
  javaCore,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.0",
  "org.webjars" % "foundation" % "5.0.2-1",
  "org.mongodb" %% "casbah" % "2.6.3"
)     

play.Project.playScalaSettings
