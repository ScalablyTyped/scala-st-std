package org.scalablytyped.std.global

import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.popstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_popstate extends js.Object {
  def apply(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.PopStateEvent, _]
  ): Unit = js.native
  def apply(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.PopStateEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
}

