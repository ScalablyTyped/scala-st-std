package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.ssrcconflict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpSender extends RTCStatsProvider {
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onssrcconflict: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCSsrcConflictEvent, _]) | Null = js.native
  val rtcpTransport: RTCDtlsTransport = js.native
  val track: MediaStreamTrack = js.native
  val transport: RTCDtlsTransport | RTCSrtpSdesTransport = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ssrcconflict(
    `type`: ssrcconflict,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCSsrcConflictEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ssrcconflict(
    `type`: ssrcconflict,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCSsrcConflictEvent, _],
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
  @JSName("removeEventListener")
  def removeEventListener_ssrcconflict(
    `type`: ssrcconflict,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCSsrcConflictEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ssrcconflict(
    `type`: ssrcconflict,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCSsrcConflictEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def send(parameters: RTCRtpParameters): Unit = js.native
  def setTrack(track: MediaStreamTrack): Unit = js.native
  def setTransport(transport: RTCDtlsTransport): Unit = js.native
  def setTransport(transport: RTCDtlsTransport, rtcpTransport: RTCDtlsTransport): Unit = js.native
  def setTransport(transport: RTCSrtpSdesTransport): Unit = js.native
  def setTransport(transport: RTCSrtpSdesTransport, rtcpTransport: RTCDtlsTransport): Unit = js.native
  def stop(): Unit = js.native
}

