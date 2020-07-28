package org.scalablytyped.std.global

import org.scalablytyped.std.Event
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.emptied
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_emptied extends js.Object {
  def apply(`type`: emptied, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]): Unit = js.native
  def apply(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
}
