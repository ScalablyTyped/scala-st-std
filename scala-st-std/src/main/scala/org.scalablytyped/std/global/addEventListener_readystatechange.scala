package org.scalablytyped.std.global

import org.scalablytyped.std.AddEventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.readystatechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_readystatechange extends js.Object {
  def apply(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.ProgressEvent, _]
  ): Unit = js.native
  def apply(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

