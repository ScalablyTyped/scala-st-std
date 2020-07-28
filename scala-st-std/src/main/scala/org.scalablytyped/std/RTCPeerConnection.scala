package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.addstream
import org.scalablytyped.std.stdStrings.icecandidate
import org.scalablytyped.std.stdStrings.iceconnectionstatechange
import org.scalablytyped.std.stdStrings.icegatheringstatechange
import org.scalablytyped.std.stdStrings.negotiationneeded
import org.scalablytyped.std.stdStrings.removestream
import org.scalablytyped.std.stdStrings.signalingstatechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnection extends EventTarget {
  val canTrickleIceCandidates: scala.Boolean | Null = js.native
  val iceConnectionState: RTCIceConnectionState = js.native
  val iceGatheringState: RTCIceGatheringState = js.native
  val localDescription: RTCSessionDescription | Null = js.native
  var onaddstream: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _]) | Null = js.native
  var onicecandidate: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _]) | Null = js.native
  var oniceconnectionstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onicegatheringstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onnegotiationneeded: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onremovestream: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _]) | Null = js.native
  var onsignalingstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val remoteDescription: RTCSessionDescription | Null = js.native
  val signalingState: RTCSignalingState = js.native
  @JSName("addEventListener")
  def addEventListener_addstream(`type`: addstream, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addstream(
    `type`: addstream,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addstream(
    `type`: addstream,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(`type`: negotiationneeded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removestream(
    `type`: removestream,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removestream(
    `type`: removestream,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removestream(
    `type`: removestream,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(`type`: signalingstatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def addIceCandidate(candidate: RTCIceCandidate): js.Promise[Unit] = js.native
  def addIceCandidate(candidate: RTCIceCandidateInit): js.Promise[Unit] = js.native
  def addStream(stream: MediaStream): Unit = js.native
  def close(): Unit = js.native
  def createAnswer(): js.Promise[RTCSessionDescriptionInit] = js.native
  def createAnswer(options: RTCOfferOptions): js.Promise[RTCSessionDescriptionInit] = js.native
  def createOffer(): js.Promise[RTCSessionDescriptionInit] = js.native
  def createOffer(options: RTCOfferOptions): js.Promise[RTCSessionDescriptionInit] = js.native
  def getConfiguration(): RTCConfiguration = js.native
  def getLocalStreams(): js.Array[MediaStream] = js.native
  def getRemoteStreams(): js.Array[MediaStream] = js.native
  def getStats(): js.Promise[RTCStatsReport] = js.native
  def getStats(selector: MediaStreamTrack): js.Promise[RTCStatsReport] = js.native
  def getStats(
    selector: MediaStreamTrack,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[RTCStatsReport] = js.native
  def getStats(selector: MediaStreamTrack, successCallback: RTCStatsCallback): js.Promise[RTCStatsReport] = js.native
  def getStats(
    selector: MediaStreamTrack,
    successCallback: RTCStatsCallback,
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[RTCStatsReport] = js.native
  def getStats(
    selector: Null,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[RTCStatsReport] = js.native
  def getStats(selector: Null, successCallback: RTCStatsCallback): js.Promise[RTCStatsReport] = js.native
  def getStats(selector: Null, successCallback: RTCStatsCallback, failureCallback: RTCPeerConnectionErrorCallback): js.Promise[RTCStatsReport] = js.native
  def getStreamById(streamId: java.lang.String): MediaStream | Null = js.native
  @JSName("removeEventListener")
  def removeEventListener_addstream(`type`: addstream, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addstream(
    `type`: addstream,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addstream(
    `type`: addstream,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(`type`: negotiationneeded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removestream(
    `type`: removestream,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removestream(
    `type`: removestream,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removestream(
    `type`: removestream,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(`type`: signalingstatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def removeStream(stream: MediaStream): Unit = js.native
  def setLocalDescription(description: RTCSessionDescriptionInit): js.Promise[Unit] = js.native
  def setRemoteDescription(description: RTCSessionDescriptionInit): js.Promise[Unit] = js.native
}

