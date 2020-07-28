package org.scalablytyped.std.global

import org.scalablytyped.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener extends js.Object {
  def apply(`type`: java.lang.String): Unit = js.native
  def apply(
    `type`: java.lang.String,
    listener: js.UndefOr[EventListenerOrEventListenerObject],
    useCapture: scala.Boolean
  ): Unit = js.native
  def apply(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
}

