package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSAudioSendPayload
  extends MSPayloadBase
     with MSOutboundPayload {
  var audioFECUsed: js.UndefOr[scala.Boolean] = js.undefined
  var samplingRate: js.UndefOr[Double] = js.undefined
  var sendMutePercent: js.UndefOr[Double] = js.undefined
  var signal: js.UndefOr[MSAudioSendSignal] = js.undefined
}

object MSAudioSendPayload {
  @scala.inline
  def apply(): MSAudioSendPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSAudioSendPayload]
  }
  @scala.inline
  implicit class MSAudioSendPayloadOps[Self <: MSAudioSendPayload] (val x: Self) extends AnyVal {
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
    def setAudioFECUsed(value: scala.Boolean): Self = this.set("audioFECUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioFECUsed: Self = this.set("audioFECUsed", js.undefined)
    @scala.inline
    def setSamplingRate(value: Double): Self = this.set("samplingRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingRate: Self = this.set("samplingRate", js.undefined)
    @scala.inline
    def setSendMutePercent(value: Double): Self = this.set("sendMutePercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendMutePercent: Self = this.set("sendMutePercent", js.undefined)
    @scala.inline
    def setSignal(value: MSAudioSendSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
  
}

