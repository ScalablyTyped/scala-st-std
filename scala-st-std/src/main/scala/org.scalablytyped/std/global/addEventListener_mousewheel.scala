package org.scalablytyped.std.global

import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.mousewheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_mousewheel extends js.Object {
  def apply(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.WheelEvent, _]
  ): Unit = js.native
  def apply(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.WheelEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
}

