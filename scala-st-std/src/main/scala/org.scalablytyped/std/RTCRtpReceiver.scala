package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpReceiver extends RTCStatsProvider {
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val rtcpTransport: RTCDtlsTransport = js.native
  val track: MediaStreamTrack | Null = js.native
  val transport: RTCDtlsTransport | RTCSrtpSdesTransport = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  def receive(parameters: RTCRtpParameters): Unit = js.native
  def requestSendCSRC(csrc: Double): Unit = js.native
  def setTransport(transport: RTCDtlsTransport): Unit = js.native
  def setTransport(transport: RTCDtlsTransport, rtcpTransport: RTCDtlsTransport): Unit = js.native
  def setTransport(transport: RTCSrtpSdesTransport): Unit = js.native
  def setTransport(transport: RTCSrtpSdesTransport, rtcpTransport: RTCDtlsTransport): Unit = js.native
  def stop(): Unit = js.native
}

