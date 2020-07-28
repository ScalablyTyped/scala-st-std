package org.scalablytyped.std.global

import org.scalablytyped.std.Console
import org.scalablytyped.std.FrameRequestCallback
import org.scalablytyped.std.Window
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Window")
@js.native
class Window_ () extends Window {
  /* CompleteClass */
  override val console: Console = js.native
  /* CompleteClass */
  override val indexedDB: org.scalablytyped.std.IDBFactory = js.native
  /* CompleteClass */
  override val localStorage: org.scalablytyped.std.Storage = js.native
  /* CompleteClass */
  override val sessionStorage: org.scalablytyped.std.Storage = js.native
  /* CompleteClass */
  override def atob(encodedString: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def btoa(rawString: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def cancelAnimationFrame(handle: Double): Unit = js.native
  /* CompleteClass */
  override def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
}

@JSGlobal("Window")
@js.native
object Window_ extends Instantiable0[Window]

