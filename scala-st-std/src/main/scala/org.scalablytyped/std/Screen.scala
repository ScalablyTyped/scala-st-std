package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.MSOrientationChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Screen extends EventTarget {
  var availHeight: Double = js.native
  var availWidth: Double = js.native
  var bufferDepth: Double = js.native
  var colorDepth: Double = js.native
  var deviceXDPI: Double = js.native
  var deviceYDPI: Double = js.native
  var fontSmoothingEnabled: scala.Boolean = js.native
  var height: Double = js.native
  var logicalXDPI: Double = js.native
  var logicalYDPI: Double = js.native
  var msOrientation: java.lang.String = js.native
  var pixelDepth: Double = js.native
  var systemXDPI: Double = js.native
  var systemYDPI: Double = js.native
  var width: Double = js.native
  @JSName("addEventListener")
  def addEventListener_MSOrientationChange(`type`: MSOrientationChange, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSOrientationChange(`type`: MSOrientationChange, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  def msLockOrientation(orientations: java.lang.String): scala.Boolean = js.native
  def msLockOrientation(orientations: js.Array[java.lang.String]): scala.Boolean = js.native
  def msUnlockOrientation(): Unit = js.native
  def onmsorientationchange(ev: Event): js.Any = js.native
}

