import ammonite.ops._

implicit val wd = os.pwd

val versions = Seq(
  "1.8.0",
  "2.0.0",
  "2.1.0",
  "2.2.0",
  "2.3.0",
  "2.4.0",
  "2.5.0",
  "3.0.0",
  "3.1.0",
  "3.2.0",
  "3.3.0",
  "3.4.0",
  "3.5.0",
  "3.6.0",
  "3.7.0",
  "3.8.0",
  "3.9.0",
)

versions.foreach {v =>
  %.extend(Nil, Map("TS_VERSION" -> v))("sbt", "clean", "stImport")
  os.delete("yarn.lock")
  %git("add", "-A")
  %git("commit", "-m", s"version ${v}")
}
