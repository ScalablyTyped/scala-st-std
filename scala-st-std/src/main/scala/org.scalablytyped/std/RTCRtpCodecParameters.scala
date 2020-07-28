package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpCodecParameters extends js.Object {
  var clockRate: js.UndefOr[Double] = js.undefined
  var maxptime: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var numChannels: js.UndefOr[Double] = js.undefined
  var parameters: js.UndefOr[js.Any] = js.undefined
  var payloadType: js.UndefOr[js.Any] = js.undefined
  var ptime: js.UndefOr[Double] = js.undefined
  var rtcpFeedback: js.UndefOr[js.Array[RTCRtcpFeedback]] = js.undefined
}

object RTCRtpCodecParameters {
  @scala.inline
  def apply(): RTCRtpCodecParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpCodecParameters]
  }
  @scala.inline
  implicit class RTCRtpCodecParametersOps[Self <: RTCRtpCodecParameters] (val x: Self) extends AnyVal {
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
    def setClockRate(value: Double): Self = this.set("clockRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockRate: Self = this.set("clockRate", js.undefined)
    @scala.inline
    def setMaxptime(value: Double): Self = this.set("maxptime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxptime: Self = this.set("maxptime", js.undefined)
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNumChannels(value: Double): Self = this.set("numChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumChannels: Self = this.set("numChannels", js.undefined)
    @scala.inline
    def setParameters(value: js.Any): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setPayloadType(value: js.Any): Self = this.set("payloadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloadType: Self = this.set("payloadType", js.undefined)
    @scala.inline
    def setPtime(value: Double): Self = this.set("ptime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePtime: Self = this.set("ptime", js.undefined)
    @scala.inline
    def setRtcpFeedbackVarargs(value: RTCRtcpFeedback*): Self = this.set("rtcpFeedback", js.Array(value :_*))
    @scala.inline
    def setRtcpFeedback(value: js.Array[RTCRtcpFeedback]): Self = this.set("rtcpFeedback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtcpFeedback: Self = this.set("rtcpFeedback", js.undefined)
  }
  
}

