package org.scalablytyped.std.global

import org.scalablytyped.std.EventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_storage extends js.Object {
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.StorageEvent, _]
  ): Unit = js.native
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.StorageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.StorageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

