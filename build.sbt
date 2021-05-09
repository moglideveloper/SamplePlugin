name := "sample"

scalaVersion := "2.13.2"
ThisBuild / intellijPluginName := "sample"
ThisBuild / intellijBuild := "211.7142.13"
ThisBuild / intellijPlatform := intellijPlatform.in(Global).??(IntelliJPlatform.IdeaCommunity).value
ThisBuild / bundleScalaLibrary  := false

intellijPlugins += "org.intellij.scala:2021.1.18".toPlugin

// scala library is coming with this dependency
libraryDependencies += "com.github.pathikrit" %% "better-files" % "3.9.1"

lazy val scalaIntellij = project.in(file("."))
  .enablePlugins(SbtIdeaPlugin)
