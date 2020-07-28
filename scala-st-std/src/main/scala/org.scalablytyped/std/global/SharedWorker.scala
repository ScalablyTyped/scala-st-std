package org.scalablytyped.std.global

import org.scalablytyped.std.WorkerOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SharedWorker")
@js.native
class SharedWorker protected ()
  extends org.scalablytyped.std.SharedWorker {
  def this(scriptURL: java.lang.String) = this()
  def this(scriptURL: java.lang.String, options: WorkerOptions) = this()
  def this(scriptURL: java.lang.String, options: java.lang.String) = this()
}

@JSGlobal("SharedWorker")
@js.native
object SharedWorker
  extends Instantiable1[/* scriptURL */ java.lang.String, org.scalablytyped.std.SharedWorker]
     with Instantiable2[
      /* scriptURL */ java.lang.String, 
      (/* options */ java.lang.String) | (/* options */ WorkerOptions), 
      org.scalablytyped.std.SharedWorker
    ]

