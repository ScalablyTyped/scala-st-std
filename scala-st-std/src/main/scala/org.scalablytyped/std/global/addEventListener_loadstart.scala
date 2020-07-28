package org.scalablytyped.std.global

import org.scalablytyped.std.AddEventListenerOptions
import org.scalablytyped.std.Event
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.loadstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_loadstart extends js.Object {
  def apply(`type`: loadstart, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]): Unit = js.native
  def apply(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
}

