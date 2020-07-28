package org.scalablytyped.std.global

import org.scalablytyped.std.WorkerOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Worker")
@js.native
class Worker protected ()
  extends org.scalablytyped.std.Worker {
  def this(stringUrl: org.scalablytyped.std.URL) = this()
  def this(stringUrl: java.lang.String) = this()
  def this(stringUrl: org.scalablytyped.std.URL, options: WorkerOptions) = this()
  def this(stringUrl: java.lang.String, options: WorkerOptions) = this()
}

@JSGlobal("Worker")
@js.native
object Worker
  extends Instantiable1[
      (/* stringUrl */ java.lang.String) | (/* stringUrl */ org.scalablytyped.std.URL), 
      org.scalablytyped.std.Worker
    ]
     with Instantiable2[
      (/* stringUrl */ java.lang.String) | (/* stringUrl */ org.scalablytyped.std.URL), 
      /* options */ WorkerOptions, 
      org.scalablytyped.std.Worker
    ]

