// addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0")

libraryDependencies +=
 Defaults.sbtPluginExtra(
   "com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0",
   "0.11.2",
   "2.9.1"
 )

resolvers += "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"

// addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.0.10")

libraryDependencies +=
 Defaults.sbtPluginExtra(
   "org.ensime" % "ensime-sbt-cmd" % "0.0.10",
   "0.11.2",
   "2.9.1"
 )

resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

addSbtPlugin("com.github.mpeltonen" %% "sbt-idea" % "1.1.0-SNAPSHOT")