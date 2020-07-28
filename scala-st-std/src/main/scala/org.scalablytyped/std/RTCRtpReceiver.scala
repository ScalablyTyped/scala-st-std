package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.msdecodercapacitychange
import org.scalablytyped.std.stdStrings.msdsh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpReceiver extends RTCStatsProvider {
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onmsdecodercapacitychange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onmsdsh: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val rtcpTransport: RTCDtlsTransport = js.native
  val track: MediaStreamTrack | Null = js.native
  val transport: RTCDtlsTransport | RTCSrtpSdesTransport = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_msdecodercapacitychange(
    `type`: msdecodercapacitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_msdecodercapacitychange(
    `type`: msdecodercapacitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_msdecodercapacitychange(
    `type`: msdecodercapacitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_msdsh(`type`: msdsh, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_msdsh(
    `type`: msdsh,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_msdsh(
    `type`: msdsh,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  def receive(parameters: RTCRtpParameters): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_msdecodercapacitychange(
    `type`: msdecodercapacitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_msdecodercapacitychange(
    `type`: msdecodercapacitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_msdecodercapacitychange(
    `type`: msdecodercapacitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_msdsh(`type`: msdsh, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_msdsh(
    `type`: msdsh,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_msdsh(
    `type`: msdsh,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def requestSendCSRC(csrc: Double): Unit = js.native
  def setTransport(transport: RTCDtlsTransport): Unit = js.native
  def setTransport(transport: RTCDtlsTransport, rtcpTransport: RTCDtlsTransport): Unit = js.native
  def setTransport(transport: RTCSrtpSdesTransport): Unit = js.native
  def setTransport(transport: RTCSrtpSdesTransport, rtcpTransport: RTCDtlsTransport): Unit = js.native
  def stop(): Unit = js.native
}

