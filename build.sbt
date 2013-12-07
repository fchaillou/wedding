name := """wedding"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  // Select Play modules
  //jdbc,      // The JDBC connection pool and the play.api.db API
  //anorm,     // Scala RDBMS Library
  //javaJdbc,  // Java database API
  //javaEbean, // Java Ebean plugin
  //javaJpa,   // Java JPA plugin
  //filters,   // A set of built-in filters
  //javaCore,  // The core Java API
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  // WebJars pull in client-side web libraries
  "org.webjars" %% "webjars-play" % "2.2.0",
  "org.webjars" % "bootstrap" % "3.0.2",
  "org.webjars" % "jquery" % "1.10.2",
  "org.webjars" % "font-awesome" % "3.2.1",
  "org.webjars" % "html5shiv" % "3.6.2",
  "org.webjars" % "respond" % "1.3.0"
  // Add your own project dependencies in the form:
  // "group" % "artifact" % "version"
)

play.Project.playScalaSettings
