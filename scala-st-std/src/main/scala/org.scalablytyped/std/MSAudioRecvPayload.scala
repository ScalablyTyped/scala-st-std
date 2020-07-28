package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSAudioRecvPayload
  extends MSPayloadBase
     with MSInboundPayload {
  var burstLossLength1: js.UndefOr[Double] = js.undefined
  var burstLossLength2: js.UndefOr[Double] = js.undefined
  var burstLossLength3: js.UndefOr[Double] = js.undefined
  var burstLossLength4: js.UndefOr[Double] = js.undefined
  var burstLossLength5: js.UndefOr[Double] = js.undefined
  var burstLossLength6: js.UndefOr[Double] = js.undefined
  var burstLossLength7: js.UndefOr[Double] = js.undefined
  var burstLossLength8OrHigher: js.UndefOr[Double] = js.undefined
  var fecRecvDistance1: js.UndefOr[Double] = js.undefined
  var fecRecvDistance2: js.UndefOr[Double] = js.undefined
  var fecRecvDistance3: js.UndefOr[Double] = js.undefined
  var packetReorderDepthAvg: js.UndefOr[Double] = js.undefined
  var packetReorderDepthMax: js.UndefOr[Double] = js.undefined
  var packetReorderRatio: js.UndefOr[Double] = js.undefined
  var ratioCompressedSamplesAvg: js.UndefOr[Double] = js.undefined
  var ratioConcealedSamplesAvg: js.UndefOr[Double] = js.undefined
  var ratioStretchedSamplesAvg: js.UndefOr[Double] = js.undefined
  var samplingRate: js.UndefOr[Double] = js.undefined
  var signal: js.UndefOr[MSAudioRecvSignal] = js.undefined
}

object MSAudioRecvPayload {
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): MSAudioRecvPayload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSAudioRecvPayload]
  }
  @scala.inline
  implicit class MSAudioRecvPayloadOps[Self <: MSAudioRecvPayload] (val x: Self) extends AnyVal {
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
    def setBurstLossLength1(value: Double): Self = this.set("burstLossLength1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBurstLossLength1: Self = this.set("burstLossLength1", js.undefined)
    @scala.inline
    def setBurstLossLength2(value: Double): Self = this.set("burstLossLength2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBurstLossLength2: Self = this.set("burstLossLength2", js.undefined)
    @scala.inline
    def setBurstLossLength3(value: Double): Self = this.set("burstLossLength3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBurstLossLength3: Self = this.set("burstLossLength3", js.undefined)
    @scala.inline
    def setBurstLossLength4(value: Double): Self = this.set("burstLossLength4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBurstLossLength4: Self = this.set("burstLossLength4", js.undefined)
    @scala.inline
    def setBurstLossLength5(value: Double): Self = this.set("burstLossLength5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBurstLossLength5: Self = this.set("burstLossLength5", js.undefined)
    @scala.inline
    def setBurstLossLength6(value: Double): Self = this.set("burstLossLength6", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBurstLossLength6: Self = this.set("burstLossLength6", js.undefined)
    @scala.inline
    def setBurstLossLength7(value: Double): Self = this.set("burstLossLength7", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBurstLossLength7: Self = this.set("burstLossLength7", js.undefined)
    @scala.inline
    def setBurstLossLength8OrHigher(value: Double): Self = this.set("burstLossLength8OrHigher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBurstLossLength8OrHigher: Self = this.set("burstLossLength8OrHigher", js.undefined)
    @scala.inline
    def setFecRecvDistance1(value: Double): Self = this.set("fecRecvDistance1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFecRecvDistance1: Self = this.set("fecRecvDistance1", js.undefined)
    @scala.inline
    def setFecRecvDistance2(value: Double): Self = this.set("fecRecvDistance2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFecRecvDistance2: Self = this.set("fecRecvDistance2", js.undefined)
    @scala.inline
    def setFecRecvDistance3(value: Double): Self = this.set("fecRecvDistance3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFecRecvDistance3: Self = this.set("fecRecvDistance3", js.undefined)
    @scala.inline
    def setPacketReorderDepthAvg(value: Double): Self = this.set("packetReorderDepthAvg", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketReorderDepthAvg: Self = this.set("packetReorderDepthAvg", js.undefined)
    @scala.inline
    def setPacketReorderDepthMax(value: Double): Self = this.set("packetReorderDepthMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketReorderDepthMax: Self = this.set("packetReorderDepthMax", js.undefined)
    @scala.inline
    def setPacketReorderRatio(value: Double): Self = this.set("packetReorderRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketReorderRatio: Self = this.set("packetReorderRatio", js.undefined)
    @scala.inline
    def setRatioCompressedSamplesAvg(value: Double): Self = this.set("ratioCompressedSamplesAvg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatioCompressedSamplesAvg: Self = this.set("ratioCompressedSamplesAvg", js.undefined)
    @scala.inline
    def setRatioConcealedSamplesAvg(value: Double): Self = this.set("ratioConcealedSamplesAvg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatioConcealedSamplesAvg: Self = this.set("ratioConcealedSamplesAvg", js.undefined)
    @scala.inline
    def setRatioStretchedSamplesAvg(value: Double): Self = this.set("ratioStretchedSamplesAvg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatioStretchedSamplesAvg: Self = this.set("ratioStretchedSamplesAvg", js.undefined)
    @scala.inline
    def setSamplingRate(value: Double): Self = this.set("samplingRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingRate: Self = this.set("samplingRate", js.undefined)
    @scala.inline
    def setSignal(value: MSAudioRecvSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
  
}

