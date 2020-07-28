package org.scalablytyped.std.global

import org.scalablytyped.std.AddEventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.keyup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_keyup extends js.Object {
  def apply(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.KeyboardEvent, _]
  ): Unit = js.native
  def apply(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.KeyboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.KeyboardEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

