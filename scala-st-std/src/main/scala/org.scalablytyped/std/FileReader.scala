package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileReader
  extends EventTarget
     with MSBaseReader {
  val error: DOMError = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: js.UndefOr[EventListenerOrEventListenerObject],
    options: scala.Boolean
  ): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def readAsArrayBuffer(blob: Blob): Unit = js.native
  def readAsBinaryString(blob: Blob): Unit = js.native
  def readAsDataURL(blob: Blob): Unit = js.native
  def readAsText(blob: Blob): Unit = js.native
  def readAsText(blob: Blob, encoding: java.lang.String): Unit = js.native
}

