name := "sample"

scalaVersion := "2.13.2"

intellijPlugins += "org.intellij.scala:2020.3.20".toPlugin
intellijDownloadSources := true
bundleScalaLibrary in ThisBuild := false

lazy val scalaIntellij = project.in(file("."))
  .enablePlugins(SbtIdeaPlugin)
