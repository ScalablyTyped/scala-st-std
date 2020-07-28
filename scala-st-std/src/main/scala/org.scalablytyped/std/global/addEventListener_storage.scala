package org.scalablytyped.std.global

import org.scalablytyped.std.AddEventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_storage extends js.Object {
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.StorageEvent, _]
  ): Unit = js.native
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.StorageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.StorageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

