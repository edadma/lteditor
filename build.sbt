import AssemblyKeys._

import LaikaKeys._

name := "LTEditor"

version := "0.7"

scalaVersion := "2.11.2"

scalacOptions ++= Seq( "-deprecation", "-feature", "-language:postfixOps", "-language:implicitConversions", "-language:existentials" )

incOptions := incOptions.value.withNameHashing( true )

organization := "org.lteditor"

libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "1.0.1"

resolvers += "Hyperreal Repository" at "http://hyperreal.ca/maven2"

libraryDependencies ++= Seq(
	"org.lteditor" %% "typesetter" % "0.4",
	"org.lteditor" %% "markup" % "0.4"
	)

mainClass in (Compile, packageBin) := Some( "lowerthirds.LowerThirdsEditor" )

mainClass in (Compile, run) := Some( "lowerthirds.LowerThirdsEditor" )


assemblySettings

mainClass in assembly := Some( "lowerthirds.LowerThirdsEditor" )

jarName in assembly := "lteditor-" + version.value + ".jar"


publishTo := Some( Resolver.sftp( "private", "hyperreal.ca", "/var/www/hyperreal.ca/maven2" ) )

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("GPL" -> url("http://opensource.org/licenses/GPL-3.0"))

homepage := Some(url("https://github.com/LTEditor/LTEditor"))

pomExtra := (
  <scm>
    <url>git@github.com:LTEditor/LTEditor.git</url>
    <connection>scm:git:git@github.com:LTEditor/LTEditor.git</connection>
  </scm>
  <developers>
    <developer>
      <id>edadma</id>
      <name>Edward A. Maxedon, Sr.</name>
      <url>http://lteditor.org</url>
    </developer>
  </developers>)
