# scala-st-std
Javascript standard library bindings for Scala.js (powered by ScalablyTyped)

This is an automatic translation of Typescript definitions of the Javascript standard library.

For educational purposes it contains commits for all versions of the Typescript definitions of es6 going back to 1.8 (a few years).

It is distributed for Scala 2.12 and 2.13 with Scala.js 1

Add this to your `build.sbt`:
```
libraryDependencies ++= Seq(
    "com.olvind" %%% "scala-st-std" % "1.0.0-beta22-3.9" 
) 
```

To use this have a look inside `org.scalablytyped.std.global`, for instance:

```scala
org.scalablytyped.std.global.console.warn("Hello, World!")
````
