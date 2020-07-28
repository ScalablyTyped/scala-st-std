package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageEvent extends Event {
  val data: js.Any = js.native
  val origin: java.lang.String = js.native
  val ports: js.Array[MessagePort] = js.native
  val source: MessageEventSource = js.native
  def initMessageEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    data: js.Any,
    origin: java.lang.String,
    lastEventId: java.lang.String,
    source: Window
  ): Unit = js.native
}

