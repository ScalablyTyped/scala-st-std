package org.scalablytyped.std.global

import org.scalablytyped.std.PerformanceEntryList
import org.scalablytyped.std.PerformanceObserverCallback
import org.scalablytyped.std.PerformanceObserverInit
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PerformanceObserver")
@js.native
class PerformanceObserver protected ()
  extends org.scalablytyped.std.PerformanceObserver {
  def this(callback: PerformanceObserverCallback) = this()
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def observe(options: PerformanceObserverInit): Unit = js.native
  /* CompleteClass */
  override def takeRecords(): PerformanceEntryList = js.native
}

@JSGlobal("PerformanceObserver")
@js.native
object PerformanceObserver
  extends Instantiable1[
      /* callback */ PerformanceObserverCallback, 
      org.scalablytyped.std.PerformanceObserver
    ]

