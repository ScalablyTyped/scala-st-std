package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worker
  extends EventTarget
     with AbstractWorker {
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.Function1[/* ev */ MessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.Function1[/* ev */ MessageEvent, _], useCapture: scala.Boolean): Unit = js.native
  def onmessage(ev: MessageEvent): js.Any = js.native
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, ports: js.Any): Unit = js.native
  def terminate(): Unit = js.native
}

