package org.scalablytyped.std.global

import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.keydown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_keydown extends js.Object {
  def apply(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.KeyboardEvent, _]
  ): Unit = js.native
  def apply(
    `type`: keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.KeyboardEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
}

