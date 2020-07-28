package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.close
import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.message
import org.scalablytyped.std.stdStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocket extends EventTarget {
  val CLOSED: Double = js.native
  val CLOSING: Double = js.native
  val CONNECTING: Double = js.native
  val OPEN: Double = js.native
  var binaryType: java.lang.String = js.native
  val bufferedAmount: Double = js.native
  val extensions: java.lang.String = js.native
  val protocol: java.lang.String = js.native
  val readyState: Double = js.native
  val url: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(`type`: open, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def close(): Unit = js.native
  def close(code: js.UndefOr[scala.Nothing], reason: java.lang.String): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, reason: java.lang.String): Unit = js.native
  def onclose(ev: CloseEvent): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
  def onmessage(ev: MessageEvent): js.Any = js.native
  def onopen(ev: Event): js.Any = js.native
  def send(data: js.Any): Unit = js.native
}

