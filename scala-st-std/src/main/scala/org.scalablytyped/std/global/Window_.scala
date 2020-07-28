package org.scalablytyped.std.global

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
  override val localStorage: org.scalablytyped.std.Storage = js.native
  /* CompleteClass */
  override val sessionStorage: org.scalablytyped.std.Storage = js.native
  /* CompleteClass */
  override def cancelAnimationFrame(handle: Double): Unit = js.native
  /* CompleteClass */
  override def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
}

@JSGlobal("Window")
@js.native
object Window_ extends Instantiable0[Window]

