package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpParameters extends js.Object {
  var codecs: js.UndefOr[js.Array[RTCRtpCodecParameters]] = js.undefined
  var degradationPreference: js.UndefOr[RTCDegradationPreference] = js.undefined
  var encodings: js.UndefOr[js.Array[RTCRtpEncodingParameters]] = js.undefined
  var headerExtensions: js.UndefOr[js.Array[RTCRtpHeaderExtensionParameters]] = js.undefined
  var muxId: js.UndefOr[java.lang.String] = js.undefined
  var rtcp: js.UndefOr[RTCRtcpParameters] = js.undefined
}

object RTCRtpParameters {
  @scala.inline
  def apply(): RTCRtpParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpParameters]
  }
  @scala.inline
  implicit class RTCRtpParametersOps[Self <: RTCRtpParameters] (val x: Self) extends AnyVal {
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
    def setCodecsVarargs(value: RTCRtpCodecParameters*): Self = this.set("codecs", js.Array(value :_*))
    @scala.inline
    def setCodecs(value: js.Array[RTCRtpCodecParameters]): Self = this.set("codecs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodecs: Self = this.set("codecs", js.undefined)
    @scala.inline
    def setDegradationPreference(value: RTCDegradationPreference): Self = this.set("degradationPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDegradationPreference: Self = this.set("degradationPreference", js.undefined)
    @scala.inline
    def setEncodingsVarargs(value: RTCRtpEncodingParameters*): Self = this.set("encodings", js.Array(value :_*))
    @scala.inline
    def setEncodings(value: js.Array[RTCRtpEncodingParameters]): Self = this.set("encodings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodings: Self = this.set("encodings", js.undefined)
    @scala.inline
    def setHeaderExtensionsVarargs(value: RTCRtpHeaderExtensionParameters*): Self = this.set("headerExtensions", js.Array(value :_*))
    @scala.inline
    def setHeaderExtensions(value: js.Array[RTCRtpHeaderExtensionParameters]): Self = this.set("headerExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderExtensions: Self = this.set("headerExtensions", js.undefined)
    @scala.inline
    def setMuxId(value: java.lang.String): Self = this.set("muxId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuxId: Self = this.set("muxId", js.undefined)
    @scala.inline
    def setRtcp(value: RTCRtcpParameters): Self = this.set("rtcp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtcp: Self = this.set("rtcp", js.undefined)
  }
  
}

