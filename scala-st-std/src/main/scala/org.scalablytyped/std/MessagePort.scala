package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePort extends EventTarget {
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def close(): Unit = js.native
  def onmessage(ev: MessageEvent): js.Any = js.native
  def postMessage(): Unit = js.native
  def postMessage(message: js.UndefOr[scala.Nothing], ports: js.Any): Unit = js.native
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, ports: js.Any): Unit = js.native
  def start(): Unit = js.native
}

