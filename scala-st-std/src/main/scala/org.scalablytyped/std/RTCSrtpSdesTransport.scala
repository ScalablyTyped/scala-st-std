package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCSrtpSdesTransport
  extends EventTarget
     with RTCTransport {
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]) | Null = js.native
  val transport: RTCIceTransport = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
}

