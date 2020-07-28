package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.dtlsstatechange
import org.scalablytyped.std.stdStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDtlsTransport
  extends RTCStatsProvider
     with RTCTransport {
  var ondtlsstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCDtlsTransportStateChangedEvent, _]) | Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val state: RTCDtlsTransportState = js.native
  val transport: RTCIceTransport = js.native
  @JSName("addEventListener")
  def addEventListener_dtlsstatechange(
    `type`: dtlsstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDtlsTransportStateChangedEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dtlsstatechange(
    `type`: dtlsstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDtlsTransportStateChangedEvent, _],
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
  def getLocalParameters(): RTCDtlsParameters = js.native
  def getRemoteCertificates(): js.Array[ArrayBuffer] = js.native
  def getRemoteParameters(): RTCDtlsParameters | Null = js.native
  @JSName("removeEventListener")
  def removeEventListener_dtlsstatechange(
    `type`: dtlsstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDtlsTransportStateChangedEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dtlsstatechange(
    `type`: dtlsstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDtlsTransportStateChangedEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def start(remoteParameters: RTCDtlsParameters): Unit = js.native
  def stop(): Unit = js.native
}

