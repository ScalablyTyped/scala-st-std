package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSVideoRecvPayload
  extends MSVideoPayload
     with MSInboundPayload {
  var lowBitRateCallPercent: js.UndefOr[Double] = js.undefined
  var lowFrameRateCallPercent: js.UndefOr[Double] = js.undefined
  var recvBitRateAverage: js.UndefOr[Double] = js.undefined
  var recvBitRateMaximum: js.UndefOr[Double] = js.undefined
  var recvCodecType: js.UndefOr[java.lang.String] = js.undefined
  var recvFpsHarmonicAverage: js.UndefOr[Double] = js.undefined
  var recvFrameRateAverage: js.UndefOr[Double] = js.undefined
  var recvNumResSwitches: js.UndefOr[Double] = js.undefined
  var recvReorderBufferMaxSuccessfullyOrderedExtent: js.UndefOr[Double] = js.undefined
  var recvReorderBufferMaxSuccessfullyOrderedLateTime: js.UndefOr[Double] = js.undefined
  var recvReorderBufferPacketsDroppedDueToBufferExhaustion: js.UndefOr[Double] = js.undefined
  var recvReorderBufferPacketsDroppedDueToTimeout: js.UndefOr[Double] = js.undefined
  var recvReorderBufferReorderedPackets: js.UndefOr[Double] = js.undefined
  var recvResolutionHeight: js.UndefOr[Double] = js.undefined
  var recvResolutionWidth: js.UndefOr[Double] = js.undefined
  var recvVideoStreamsMax: js.UndefOr[Double] = js.undefined
  var recvVideoStreamsMin: js.UndefOr[Double] = js.undefined
  var recvVideoStreamsMode: js.UndefOr[Double] = js.undefined
  var reorderBufferTotalPackets: js.UndefOr[Double] = js.undefined
  var videoFrameLossRate: js.UndefOr[Double] = js.undefined
  var videoPostFECPLR: js.UndefOr[Double] = js.undefined
  var videoResolutions: js.UndefOr[MSVideoResolutionDistribution] = js.undefined
}

object MSVideoRecvPayload {
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): MSVideoRecvPayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSVideoRecvPayload]
  }
  @scala.inline
  implicit class MSVideoRecvPayloadOps[Self <: MSVideoRecvPayload] (val x: Self) extends AnyVal {
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
    def setLowBitRateCallPercent(value: Double): Self = this.set("lowBitRateCallPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowBitRateCallPercent: Self = this.set("lowBitRateCallPercent", js.undefined)
    @scala.inline
    def setLowFrameRateCallPercent(value: Double): Self = this.set("lowFrameRateCallPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowFrameRateCallPercent: Self = this.set("lowFrameRateCallPercent", js.undefined)
    @scala.inline
    def setRecvBitRateAverage(value: Double): Self = this.set("recvBitRateAverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvBitRateAverage: Self = this.set("recvBitRateAverage", js.undefined)
    @scala.inline
    def setRecvBitRateMaximum(value: Double): Self = this.set("recvBitRateMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvBitRateMaximum: Self = this.set("recvBitRateMaximum", js.undefined)
    @scala.inline
    def setRecvCodecType(value: java.lang.String): Self = this.set("recvCodecType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvCodecType: Self = this.set("recvCodecType", js.undefined)
    @scala.inline
    def setRecvFpsHarmonicAverage(value: Double): Self = this.set("recvFpsHarmonicAverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvFpsHarmonicAverage: Self = this.set("recvFpsHarmonicAverage", js.undefined)
    @scala.inline
    def setRecvFrameRateAverage(value: Double): Self = this.set("recvFrameRateAverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvFrameRateAverage: Self = this.set("recvFrameRateAverage", js.undefined)
    @scala.inline
    def setRecvNumResSwitches(value: Double): Self = this.set("recvNumResSwitches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvNumResSwitches: Self = this.set("recvNumResSwitches", js.undefined)
    @scala.inline
    def setRecvReorderBufferMaxSuccessfullyOrderedExtent(value: Double): Self = this.set("recvReorderBufferMaxSuccessfullyOrderedExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvReorderBufferMaxSuccessfullyOrderedExtent: Self = this.set("recvReorderBufferMaxSuccessfullyOrderedExtent", js.undefined)
    @scala.inline
    def setRecvReorderBufferMaxSuccessfullyOrderedLateTime(value: Double): Self = this.set("recvReorderBufferMaxSuccessfullyOrderedLateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvReorderBufferMaxSuccessfullyOrderedLateTime: Self = this.set("recvReorderBufferMaxSuccessfullyOrderedLateTime", js.undefined)
    @scala.inline
    def setRecvReorderBufferPacketsDroppedDueToBufferExhaustion(value: Double): Self = this.set("recvReorderBufferPacketsDroppedDueToBufferExhaustion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvReorderBufferPacketsDroppedDueToBufferExhaustion: Self = this.set("recvReorderBufferPacketsDroppedDueToBufferExhaustion", js.undefined)
    @scala.inline
    def setRecvReorderBufferPacketsDroppedDueToTimeout(value: Double): Self = this.set("recvReorderBufferPacketsDroppedDueToTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvReorderBufferPacketsDroppedDueToTimeout: Self = this.set("recvReorderBufferPacketsDroppedDueToTimeout", js.undefined)
    @scala.inline
    def setRecvReorderBufferReorderedPackets(value: Double): Self = this.set("recvReorderBufferReorderedPackets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvReorderBufferReorderedPackets: Self = this.set("recvReorderBufferReorderedPackets", js.undefined)
    @scala.inline
    def setRecvResolutionHeight(value: Double): Self = this.set("recvResolutionHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvResolutionHeight: Self = this.set("recvResolutionHeight", js.undefined)
    @scala.inline
    def setRecvResolutionWidth(value: Double): Self = this.set("recvResolutionWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvResolutionWidth: Self = this.set("recvResolutionWidth", js.undefined)
    @scala.inline
    def setRecvVideoStreamsMax(value: Double): Self = this.set("recvVideoStreamsMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvVideoStreamsMax: Self = this.set("recvVideoStreamsMax", js.undefined)
    @scala.inline
    def setRecvVideoStreamsMin(value: Double): Self = this.set("recvVideoStreamsMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvVideoStreamsMin: Self = this.set("recvVideoStreamsMin", js.undefined)
    @scala.inline
    def setRecvVideoStreamsMode(value: Double): Self = this.set("recvVideoStreamsMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvVideoStreamsMode: Self = this.set("recvVideoStreamsMode", js.undefined)
    @scala.inline
    def setReorderBufferTotalPackets(value: Double): Self = this.set("reorderBufferTotalPackets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReorderBufferTotalPackets: Self = this.set("reorderBufferTotalPackets", js.undefined)
    @scala.inline
    def setVideoFrameLossRate(value: Double): Self = this.set("videoFrameLossRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoFrameLossRate: Self = this.set("videoFrameLossRate", js.undefined)
    @scala.inline
    def setVideoPostFECPLR(value: Double): Self = this.set("videoPostFECPLR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoPostFECPLR: Self = this.set("videoPostFECPLR", js.undefined)
    @scala.inline
    def setVideoResolutions(value: MSVideoResolutionDistribution): Self = this.set("videoResolutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoResolutions: Self = this.set("videoResolutions", js.undefined)
  }
  
}

