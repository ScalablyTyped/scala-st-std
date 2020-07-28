package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTarget extends js.Object {
  def addEventListener(`type`: java.lang.String): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.UndefOr[EventListenerOrEventListenerObject],
    useCapture: scala.Boolean
  ): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def dispatchEvent(evt: Event): scala.Boolean = js.native
  def removeEventListener(`type`: java.lang.String): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.UndefOr[EventListenerOrEventListenerObject],
    useCapture: scala.Boolean
  ): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
}

