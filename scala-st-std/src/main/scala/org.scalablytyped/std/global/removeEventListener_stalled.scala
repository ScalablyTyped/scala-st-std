package org.scalablytyped.std.global

import org.scalablytyped.std.Event
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.stalled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_stalled extends js.Object {
  def apply(`type`: stalled, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]): Unit = js.native
  def apply(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
}
