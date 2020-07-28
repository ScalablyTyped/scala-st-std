package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCOutboundRTPStreamStats extends RTCRTPStreamStats {
  var bytesSent: js.UndefOr[Double] = js.undefined
  var packetsSent: js.UndefOr[Double] = js.undefined
  var roundTripTime: js.UndefOr[Double] = js.undefined
  var targetBitrate: js.UndefOr[Double] = js.undefined
}

object RTCOutboundRTPStreamStats {
  @scala.inline
  def apply(): RTCOutboundRTPStreamStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOutboundRTPStreamStats]
  }
  @scala.inline
  implicit class RTCOutboundRTPStreamStatsOps[Self <: RTCOutboundRTPStreamStats] (val x: Self) extends AnyVal {
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
    def setBytesSent(value: Double): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesSent: Self = this.set("bytesSent", js.undefined)
    @scala.inline
    def setPacketsSent(value: Double): Self = this.set("packetsSent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketsSent: Self = this.set("packetsSent", js.undefined)
    @scala.inline
    def setRoundTripTime(value: Double): Self = this.set("roundTripTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundTripTime: Self = this.set("roundTripTime", js.undefined)
    @scala.inline
    def setTargetBitrate(value: Double): Self = this.set("targetBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetBitrate: Self = this.set("targetBitrate", js.undefined)
  }
  
}

