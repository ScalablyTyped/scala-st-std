package org.scalablytyped.std.global

import org.scalablytyped.std.AddEventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.contextmenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_contextmenu extends js.Object {
  def apply(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.MouseEvent, _]
  ): Unit = js.native
  def apply(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.MouseEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

