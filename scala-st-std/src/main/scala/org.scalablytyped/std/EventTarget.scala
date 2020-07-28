package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTarget extends js.Object {
  def addEventListener(`type`: java.lang.String): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: Null, options: AddEventListenerOptions): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: Null, options: scala.Boolean): Unit = js.native
  def dispatchEvent(evt: Event): scala.Boolean = js.native
  def removeEventListener(`type`: java.lang.String): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.UndefOr[EventListenerOrEventListenerObject],
    options: EventListenerOptions
  ): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.UndefOr[EventListenerOrEventListenerObject],
    options: scala.Boolean
  ): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: Null, options: EventListenerOptions): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: Null, options: scala.Boolean): Unit = js.native
}

