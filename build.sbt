val tsVersion = sys.env.get("TS_VERSION").getOrElse("3.9")

def forVersion(name: String, pkg: String, libs: String*): Project = {
  require(libs.nonEmpty)
  Project(name, file(name))
    .enablePlugins(ScalablyTypedConverterGenSourcePlugin)
    .settings(
      organization := "com.olvind",
      scalaVersion := "2.13.2",
      crossScalaVersions := List("2.12.10", scalaVersion.value),
      version := s"1.0.0-beta22-$tsVersion",
      stOutputPackage := pkg,
      stStdlib := libs.toList,
      stUseScalaJsDom := false,
      stSourceGenMode := SourceGenMode.Manual((Compile / scalaSource).value),
      stEnableScalaJsDefined := Selection.All,
      stTypescriptVersion := tsVersion,
      // publication settings
      sources in (Compile, doc) := Seq(), // doc jar is a few hundred megabytes...
      homepage := Some(new URL("https://github.com/ScalablyTyped/scala-st-std")),
      startYear := Some(2020),
      pomExtra := (
        <scm>
          <connection>scm:git:github.com:/ScalablyTyped/scala-st-std</connection>
          <developerConnection>scm:git:git@github.com:ScalablyTyped/scala-st-std.git</developerConnection>
          <url>github.com:ScalablyTyped/scala-st-std.git</url>
        </scm>
          <developers>
            <developer>
              <id>oyvindberg</id>
              <name>Øyvind Raddum Berg</name>
            </developer>
          </developers>
      ),
      licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
      publishTo := {
        val nexus = "https://oss.sonatype.org/"
        if (isSnapshot.value)
          Some("snapshots" at nexus + "content/repositories/snapshots")
        else
          Some("releases" at nexus + "service/local/staging/deploy/maven2")
      }
    )
}

// es6 is what you get by default
val `scala-st-std` = forVersion(
  name = "scala-st-std",
  pkg = "org.scalablytyped",
  libs = "dom", "es6"
)

//// also offer esnext for the adventurous
//val `scala-st-std-esnext` = forVersion(
//  name = "scala-st-std-esnext",
//  pkg = "org.scalablytyped.esnext",
//  libs = "dom", "esnext")

lazy val root = project
  .in(file("."))
  .settings(name := "std-root")
  .configure(preventPublication)
  .aggregate(
    `scala-st-std`
//    `scala-st-std-esnext`,
  )

lazy val preventPublication: Project => Project =
  _.settings(
    publish := {},
    publishTo := Some(Resolver.file("Unused transient repository", target.value / "fakepublish")),
    publishArtifact := false,
    publishLocal := {},
    packagedArtifacts := Map.empty,
  ) // doesn't work - https://github.com/sbt/sbt-pgp/issues/42
