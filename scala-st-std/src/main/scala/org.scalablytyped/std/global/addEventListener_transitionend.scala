package org.scalablytyped.std.global

import org.scalablytyped.std.AddEventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.transitionend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_transitionend extends js.Object {
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.TransitionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.TransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.TransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

