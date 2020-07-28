package org.scalablytyped.std.global

import org.scalablytyped.std.AddEventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.devicemotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_devicemotion extends js.Object {
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.DeviceMotionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.DeviceMotionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.DeviceMotionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

