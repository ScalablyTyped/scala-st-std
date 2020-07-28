package org.scalablytyped.std.global

import org.scalablytyped.std.Event
import org.scalablytyped.std.stdStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_change extends js.Object {
  def apply(`type`: change, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  def apply(`type`: change, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
}

