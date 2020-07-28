package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSVideoSendPayload
  extends MSVideoPayload
     with MSOutboundPayload {
  var sendBitRateAverage: js.UndefOr[Double] = js.undefined
  var sendBitRateMaximum: js.UndefOr[Double] = js.undefined
  var sendFrameRateAverage: js.UndefOr[Double] = js.undefined
  var sendResolutionHeight: js.UndefOr[Double] = js.undefined
  var sendResolutionWidth: js.UndefOr[Double] = js.undefined
  var sendVideoStreamsMax: js.UndefOr[Double] = js.undefined
}

object MSVideoSendPayload {
  @scala.inline
  def apply(): MSVideoSendPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSVideoSendPayload]
  }
  @scala.inline
  implicit class MSVideoSendPayloadOps[Self <: MSVideoSendPayload] (val x: Self) extends AnyVal {
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
    def setSendBitRateAverage(value: Double): Self = this.set("sendBitRateAverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendBitRateAverage: Self = this.set("sendBitRateAverage", js.undefined)
    @scala.inline
    def setSendBitRateMaximum(value: Double): Self = this.set("sendBitRateMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendBitRateMaximum: Self = this.set("sendBitRateMaximum", js.undefined)
    @scala.inline
    def setSendFrameRateAverage(value: Double): Self = this.set("sendFrameRateAverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendFrameRateAverage: Self = this.set("sendFrameRateAverage", js.undefined)
    @scala.inline
    def setSendResolutionHeight(value: Double): Self = this.set("sendResolutionHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendResolutionHeight: Self = this.set("sendResolutionHeight", js.undefined)
    @scala.inline
    def setSendResolutionWidth(value: Double): Self = this.set("sendResolutionWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendResolutionWidth: Self = this.set("sendResolutionWidth", js.undefined)
    @scala.inline
    def setSendVideoStreamsMax(value: Double): Self = this.set("sendVideoStreamsMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendVideoStreamsMax: Self = this.set("sendVideoStreamsMax", js.undefined)
  }
  
}

