package org.scalablytyped.std.global

import org.scalablytyped.std.TimerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setInterval")
@js.native
object setInterval extends js.Object {
  def apply(handler: TimerHandler, timeout: js.UndefOr[scala.Nothing], arguments: js.Any*): Double = js.native
  def apply(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
}

