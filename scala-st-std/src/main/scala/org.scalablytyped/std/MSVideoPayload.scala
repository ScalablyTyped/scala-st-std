package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSVideoPayload extends MSPayloadBase {
  var durationSeconds: js.UndefOr[Double] = js.undefined
  var resoluton: js.UndefOr[java.lang.String] = js.undefined
  var videoBitRateAvg: js.UndefOr[Double] = js.undefined
  var videoBitRateMax: js.UndefOr[Double] = js.undefined
  var videoFrameRateAvg: js.UndefOr[Double] = js.undefined
  var videoPacketLossRate: js.UndefOr[Double] = js.undefined
}

object MSVideoPayload {
  @scala.inline
  def apply(): MSVideoPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSVideoPayload]
  }
  @scala.inline
  implicit class MSVideoPayloadOps[Self <: MSVideoPayload] (val x: Self) extends AnyVal {
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
    def setDurationSeconds(value: Double): Self = this.set("durationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationSeconds: Self = this.set("durationSeconds", js.undefined)
    @scala.inline
    def setResoluton(value: java.lang.String): Self = this.set("resoluton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResoluton: Self = this.set("resoluton", js.undefined)
    @scala.inline
    def setVideoBitRateAvg(value: Double): Self = this.set("videoBitRateAvg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoBitRateAvg: Self = this.set("videoBitRateAvg", js.undefined)
    @scala.inline
    def setVideoBitRateMax(value: Double): Self = this.set("videoBitRateMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoBitRateMax: Self = this.set("videoBitRateMax", js.undefined)
    @scala.inline
    def setVideoFrameRateAvg(value: Double): Self = this.set("videoFrameRateAvg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoFrameRateAvg: Self = this.set("videoFrameRateAvg", js.undefined)
    @scala.inline
    def setVideoPacketLossRate(value: Double): Self = this.set("videoPacketLossRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoPacketLossRate: Self = this.set("videoPacketLossRate", js.undefined)
  }
  
}

