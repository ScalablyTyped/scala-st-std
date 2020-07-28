package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadonlySet[T] extends js.Object {
  val size: Double = js.native
  def forEach(callbackfn: js.Function3[/* value */ T, /* value2 */ T, /* set */ ReadonlySet[T], Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* value2 */ T, /* set */ ReadonlySet[T], Unit],
    thisArg: js.Any
  ): Unit = js.native
  def has(value: T): scala.Boolean = js.native
}

