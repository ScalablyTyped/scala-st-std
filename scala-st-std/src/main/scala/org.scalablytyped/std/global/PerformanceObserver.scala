package org.scalablytyped.std.global

import org.scalablytyped.std.PerformanceObserverCallback
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PerformanceObserver")
@js.native
class PerformanceObserver protected ()
  extends org.scalablytyped.std.PerformanceObserver {
  def this(callback: PerformanceObserverCallback) = this()
}

@JSGlobal("PerformanceObserver")
@js.native
object PerformanceObserver
  extends Instantiable1[
      /* callback */ PerformanceObserverCallback, 
      org.scalablytyped.std.PerformanceObserver
    ] {
  val supportedEntryTypes: js.Array[java.lang.String] = js.native
}

