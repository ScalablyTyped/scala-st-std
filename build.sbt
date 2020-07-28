val tsVersion = sys.env.get("TS_VERSION").getOrElse("3.9")

def forVersion(name: String, pkg: String, libs: String*): Project = {
  require(libs.nonEmpty)
  Project(name, file(name))
    .enablePlugins(ScalablyTypedConverterGenSourcePlugin)
    .settings(
      organization := "org.scalablytyped",
      scalaVersion := "2.13.2",
      crossScalaVersions := List("2.12.10", scalaVersion.value),
      version := s"${org.scalablytyped.converter.internal.BuildInfo.version}-$tsVersion",
      stOutputPackage := pkg,
      stStdlib := libs.toList,
      stUseScalaJsDom := false,
      stSourceGenMode := SourceGenMode.Manual((Compile / scalaSource).value),
      stEnableScalaJsDefined := Selection.All,
      stTypescriptVersion := tsVersion,
      // publication settings
      homepage := Some(new URL("https://github.com/ScalablyTyped/scala-st-std")),
      startYear := Some(2020),
      pomExtra := (
        <scm>
          <connection>scm:git:github.com:/ScalablyTyped/scala-js-std</connection>
          <developerConnection>scm:git:git@github.com:ScalablyTyped/scala-js-std.git</developerConnection>
          <url>github.com:ScalablyTyped/scala-js-std.git</url>
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
val `scala-js-std` = forVersion(
  name = "scala-st-std",
  pkg = "org.scalablytyped",
  libs = "dom", "es6"
)

//// also offer esnext for the adventurous
//val `scala-js-std-esnext` = forVersion(
//  name = "scala-st-std-esnext",
//  pkg = "org.scalablytyped.esnext",
//  libs = "dom", "esnext")
