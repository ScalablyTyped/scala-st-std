package org.scalablytyped.std.global

import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.pointerdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_pointerdown extends js.Object {
  def apply(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.PointerEvent, _]
  ): Unit = js.native
  def apply(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.PointerEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
}

