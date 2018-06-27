name := """play-playground"""
organization := "9renpoto"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  evolutions,
  jdbc,
  guice,
  "io.sentry" % "sentry-logback" % "1.7.5",
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2",
  "org.postgresql" % "postgresql" % "42.2.2",
  "org.scalikejdbc" %% "scalikejdbc" % "3.2.3",
  "org.scalikejdbc" %% "scalikejdbc-config" % "3.2.3",
  "org.scalikejdbc" %% "scalikejdbc-play-dbapi-adapter" % "2.6.0-scalikejdbc-3.2",
  "org.scalikejdbc" %% "scalikejdbc-play-fixture" % "2.6.0-scalikejdbc-3.2"
)

coverageEnabled := true

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "9renpoto.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "9renpoto.binders._"
