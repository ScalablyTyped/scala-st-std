package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpEncodingParameters extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var codecPayloadType: js.UndefOr[Double] = js.undefined
  var dependencyEncodingIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var encodingId: js.UndefOr[java.lang.String] = js.undefined
  var fec: js.UndefOr[RTCRtpFecParameters] = js.undefined
  var framerateBias: js.UndefOr[Double] = js.undefined
  var framerateScale: js.UndefOr[Double] = js.undefined
  var maxBitrate: js.UndefOr[Double] = js.undefined
  var minQuality: js.UndefOr[Double] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var resolutionScale: js.UndefOr[Double] = js.undefined
  var rtx: js.UndefOr[RTCRtpRtxParameters] = js.undefined
  var ssrc: js.UndefOr[Double] = js.undefined
  var ssrcRange: js.UndefOr[RTCSsrcRange] = js.undefined
}

object RTCRtpEncodingParameters {
  @scala.inline
  def apply(): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
  @scala.inline
  implicit class RTCRtpEncodingParametersOps[Self <: RTCRtpEncodingParameters] (val x: Self) extends AnyVal {
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
    def setActive(value: scala.Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCodecPayloadType(value: Double): Self = this.set("codecPayloadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodecPayloadType: Self = this.set("codecPayloadType", js.undefined)
    @scala.inline
    def setDependencyEncodingIdsVarargs(value: java.lang.String*): Self = this.set("dependencyEncodingIds", js.Array(value :_*))
    @scala.inline
    def setDependencyEncodingIds(value: js.Array[java.lang.String]): Self = this.set("dependencyEncodingIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencyEncodingIds: Self = this.set("dependencyEncodingIds", js.undefined)
    @scala.inline
    def setEncodingId(value: java.lang.String): Self = this.set("encodingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodingId: Self = this.set("encodingId", js.undefined)
    @scala.inline
    def setFec(value: RTCRtpFecParameters): Self = this.set("fec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFec: Self = this.set("fec", js.undefined)
    @scala.inline
    def setFramerateBias(value: Double): Self = this.set("framerateBias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateBias: Self = this.set("framerateBias", js.undefined)
    @scala.inline
    def setFramerateScale(value: Double): Self = this.set("framerateScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateScale: Self = this.set("framerateScale", js.undefined)
    @scala.inline
    def setMaxBitrate(value: Double): Self = this.set("maxBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBitrate: Self = this.set("maxBitrate", js.undefined)
    @scala.inline
    def setMinQuality(value: Double): Self = this.set("minQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinQuality: Self = this.set("minQuality", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setResolutionScale(value: Double): Self = this.set("resolutionScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutionScale: Self = this.set("resolutionScale", js.undefined)
    @scala.inline
    def setRtx(value: RTCRtpRtxParameters): Self = this.set("rtx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtx: Self = this.set("rtx", js.undefined)
    @scala.inline
    def setSsrc(value: Double): Self = this.set("ssrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsrc: Self = this.set("ssrc", js.undefined)
    @scala.inline
    def setSsrcRange(value: RTCSsrcRange): Self = this.set("ssrcRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsrcRange: Self = this.set("ssrcRange", js.undefined)
  }
  
}

