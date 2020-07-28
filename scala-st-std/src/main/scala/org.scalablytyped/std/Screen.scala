package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.MSOrientationChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Screen extends EventTarget {
  val availHeight: Double = js.native
  val availWidth: Double = js.native
  var bufferDepth: Double = js.native
  val colorDepth: Double = js.native
  val deviceXDPI: Double = js.native
  val deviceYDPI: Double = js.native
  val fontSmoothingEnabled: scala.Boolean = js.native
  val height: Double = js.native
  val logicalXDPI: Double = js.native
  val logicalYDPI: Double = js.native
  val msOrientation: java.lang.String = js.native
  val pixelDepth: Double = js.native
  val systemXDPI: Double = js.native
  val systemYDPI: Double = js.native
  val width: Double = js.native
  @JSName("addEventListener")
  def addEventListener_MSOrientationChange(`type`: MSOrientationChange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSOrientationChange(
    `type`: MSOrientationChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSOrientationChange(
    `type`: MSOrientationChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def msLockOrientation(orientations: java.lang.String): scala.Boolean = js.native
  def msLockOrientation(orientations: js.Array[java.lang.String]): scala.Boolean = js.native
  def msUnlockOrientation(): Unit = js.native
  def onmsorientationchange(ev: Event): js.Any = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSOrientationChange(`type`: MSOrientationChange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSOrientationChange(
    `type`: MSOrientationChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSOrientationChange(
    `type`: MSOrientationChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
}

