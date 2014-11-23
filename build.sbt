lazy val root = (project in file(".")).
  settings(
    name := "rapture-json-poc",
    version := "1.0",
    scalaVersion := "2.11.4",
    libraryDependencies ++= Seq("com.propensive" %% "rapture-json-jawn" % "1.0.8"),
    libraryDependencies ++= Seq("com.propensive" %% "rapture-uri" % "1.0.0"),
    libraryDependencies ++= Seq("com.propensive" %% "rapture-codec" % "1.0.0"),
    libraryDependencies ++= Seq("com.propensive" %% "rapture-net" % "0.10.0")
  )
