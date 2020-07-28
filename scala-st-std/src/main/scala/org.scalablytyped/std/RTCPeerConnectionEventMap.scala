package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCPeerConnectionEventMap extends js.Object {
  var addstream: MediaStreamEvent
  var icecandidate: RTCPeerConnectionIceEvent
  var iceconnectionstatechange: Event
  var icegatheringstatechange: Event
  var negotiationneeded: Event
  var removestream: MediaStreamEvent
  var signalingstatechange: Event
}

object RTCPeerConnectionEventMap {
  @scala.inline
  def apply(
    addstream: MediaStreamEvent,
    icecandidate: RTCPeerConnectionIceEvent,
    iceconnectionstatechange: Event,
    icegatheringstatechange: Event,
    negotiationneeded: Event,
    removestream: MediaStreamEvent,
    signalingstatechange: Event
  ): RTCPeerConnectionEventMap = {
    val __obj = js.Dynamic.literal(addstream = addstream.asInstanceOf[js.Any], icecandidate = icecandidate.asInstanceOf[js.Any], iceconnectionstatechange = iceconnectionstatechange.asInstanceOf[js.Any], icegatheringstatechange = icegatheringstatechange.asInstanceOf[js.Any], negotiationneeded = negotiationneeded.asInstanceOf[js.Any], removestream = removestream.asInstanceOf[js.Any], signalingstatechange = signalingstatechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionEventMap]
  }
  @scala.inline
  implicit class RTCPeerConnectionEventMapOps[Self <: RTCPeerConnectionEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddstream(value: MediaStreamEvent): Self = this.set("addstream", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcecandidate(value: RTCPeerConnectionIceEvent): Self = this.set("icecandidate", value.asInstanceOf[js.Any])
    @scala.inline
    def setIceconnectionstatechange(value: Event): Self = this.set("iceconnectionstatechange", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcegatheringstatechange(value: Event): Self = this.set("icegatheringstatechange", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegotiationneeded(value: Event): Self = this.set("negotiationneeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovestream(value: MediaStreamEvent): Self = this.set("removestream", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignalingstatechange(value: Event): Self = this.set("signalingstatechange", value.asInstanceOf[js.Any])
  }
  
}

