package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSStreamReader
  extends EventTarget
     with MSBaseReader {
  val error: DOMError = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: js.UndefOr[EventListenerOrEventListenerObject],
    options: AddEventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: js.UndefOr[EventListenerOrEventListenerObject],
    options: scala.Boolean
  ): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def readAsArrayBuffer(stream: MSStream): Unit = js.native
  def readAsArrayBuffer(stream: MSStream, size: Double): Unit = js.native
  def readAsBinaryString(stream: MSStream): Unit = js.native
  def readAsBinaryString(stream: MSStream, size: Double): Unit = js.native
  def readAsBlob(stream: MSStream): Unit = js.native
  def readAsBlob(stream: MSStream, size: Double): Unit = js.native
  def readAsDataURL(stream: MSStream): Unit = js.native
  def readAsDataURL(stream: MSStream, size: Double): Unit = js.native
  def readAsText(stream: MSStream): Unit = js.native
  def readAsText(stream: MSStream, encoding: js.UndefOr[scala.Nothing], size: Double): Unit = js.native
  def readAsText(stream: MSStream, encoding: java.lang.String): Unit = js.native
  def readAsText(stream: MSStream, encoding: java.lang.String, size: Double): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: js.UndefOr[EventListenerOrEventListenerObject],
    options: EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: js.UndefOr[EventListenerOrEventListenerObject],
    options: scala.Boolean
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
}

