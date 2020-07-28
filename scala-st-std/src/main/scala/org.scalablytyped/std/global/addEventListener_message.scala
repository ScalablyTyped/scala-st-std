package org.scalablytyped.std.global

import org.scalablytyped.std.AddEventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_message extends js.Object {
  def apply(
    `type`: message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.MessageEvent, _]
  ): Unit = js.native
  def apply(
    `type`: message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.MessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

