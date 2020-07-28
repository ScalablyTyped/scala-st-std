package org.scalablytyped.std.global

import org.scalablytyped.std.Event
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.volumechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_volumechange extends js.Object {
  def apply(`type`: volumechange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]): Unit = js.native
  def apply(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
}

