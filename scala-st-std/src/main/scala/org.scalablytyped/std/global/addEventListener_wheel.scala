package org.scalablytyped.std.global

import org.scalablytyped.std.AddEventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.wheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_wheel extends js.Object {
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.WheelEvent, _]
  ): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.WheelEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.WheelEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

