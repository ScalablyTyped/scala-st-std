package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpCapabilities extends js.Object {
  var codecs: js.UndefOr[js.Array[RTCRtpCodecCapability]] = js.undefined
  var fecMechanisms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var headerExtensions: js.UndefOr[js.Array[RTCRtpHeaderExtension]] = js.undefined
}

object RTCRtpCapabilities {
  @scala.inline
  def apply(): RTCRtpCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpCapabilities]
  }
  @scala.inline
  implicit class RTCRtpCapabilitiesOps[Self <: RTCRtpCapabilities] (val x: Self) extends AnyVal {
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
    def setCodecsVarargs(value: RTCRtpCodecCapability*): Self = this.set("codecs", js.Array(value :_*))
    @scala.inline
    def setCodecs(value: js.Array[RTCRtpCodecCapability]): Self = this.set("codecs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodecs: Self = this.set("codecs", js.undefined)
    @scala.inline
    def setFecMechanismsVarargs(value: java.lang.String*): Self = this.set("fecMechanisms", js.Array(value :_*))
    @scala.inline
    def setFecMechanisms(value: js.Array[java.lang.String]): Self = this.set("fecMechanisms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFecMechanisms: Self = this.set("fecMechanisms", js.undefined)
    @scala.inline
    def setHeaderExtensionsVarargs(value: RTCRtpHeaderExtension*): Self = this.set("headerExtensions", js.Array(value :_*))
    @scala.inline
    def setHeaderExtensions(value: js.Array[RTCRtpHeaderExtension]): Self = this.set("headerExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderExtensions: Self = this.set("headerExtensions", js.undefined)
  }
  
}

