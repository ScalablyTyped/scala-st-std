package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.candidatepairchange
import org.scalablytyped.std.stdStrings.icestatechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceTransport extends RTCStatsProvider {
  val component: java.lang.String = js.native
  val iceGatherer: RTCIceGatherer | Null = js.native
  var oncandidatepairchange: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceCandidatePairChangedEvent, _]) | Null = js.native
  var onicestatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceTransportStateChangedEvent, _]) | Null = js.native
  val role: java.lang.String = js.native
  val state: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_candidatepairchange(
    `type`: candidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceCandidatePairChangedEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_candidatepairchange(
    `type`: candidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceCandidatePairChangedEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icestatechange(
    `type`: icestatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceTransportStateChangedEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icestatechange(
    `type`: icestatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceTransportStateChangedEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def addRemoteCandidate(remoteCandidate: RTCIceCandidate): Unit = js.native
  def addRemoteCandidate(remoteCandidate: RTCIceCandidateComplete): Unit = js.native
  def createAssociatedTransport(): RTCIceTransport = js.native
  def getNominatedCandidatePair(): RTCIceCandidatePair | Null = js.native
  def getRemoteCandidates(): js.Array[RTCIceCandidate] = js.native
  def getRemoteParameters(): RTCIceParameters | Null = js.native
  def setRemoteCandidates(remoteCandidates: js.Array[RTCIceCandidate]): Unit = js.native
  def start(gatherer: RTCIceGatherer, remoteParameters: RTCIceParameters): Unit = js.native
  def start(gatherer: RTCIceGatherer, remoteParameters: RTCIceParameters, role: java.lang.String): Unit = js.native
  def stop(): Unit = js.native
}

