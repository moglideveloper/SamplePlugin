name := "sample"

scalaVersion := "2.13.2"

intellijPlugins += "org.intellij.scala:2021.1.16".toPlugin
intellijDownloadSources := true
bundleScalaLibrary in ThisBuild := false

intellijBuild in ThisBuild := "211.6693.14"

lazy val scalaIntellij = project.in(file("."))
  .enablePlugins(SbtIdeaPlugin)
