package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowTimersExtension extends js.Object {
  def clearImmediate(handle: Double): Unit = js.native
  def setImmediate(handler: js.Any, args: js.Any*): Double = js.native
  def setImmediate(handler: js.Function1[/* repeated */ js.Any, Unit]): Double = js.native
}

