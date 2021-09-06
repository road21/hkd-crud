val scala3Version = "3.0.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "hkd",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.6.1",
      "com.novocode" % "junit-interface" % "0.11" % "test"
    )
  )
