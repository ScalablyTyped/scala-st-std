package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceTransportEventMap extends js.Object {
  var candidatepairchange: RTCIceCandidatePairChangedEvent
  var icestatechange: RTCIceTransportStateChangedEvent
}

object RTCIceTransportEventMap {
  @scala.inline
  def apply(
    candidatepairchange: RTCIceCandidatePairChangedEvent,
    icestatechange: RTCIceTransportStateChangedEvent
  ): RTCIceTransportEventMap = {
    val __obj = js.Dynamic.literal(candidatepairchange = candidatepairchange.asInstanceOf[js.Any], icestatechange = icestatechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceTransportEventMap]
  }
  @scala.inline
  implicit class RTCIceTransportEventMapOps[Self <: RTCIceTransportEventMap] (val x: Self) extends AnyVal {
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
    def setCandidatepairchange(value: RTCIceCandidatePairChangedEvent): Self = this.set("candidatepairchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcestatechange(value: RTCIceTransportStateChangedEvent): Self = this.set("icestatechange", value.asInstanceOf[js.Any])
  }
  
}

