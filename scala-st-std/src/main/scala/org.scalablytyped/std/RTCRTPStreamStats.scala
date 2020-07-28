package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRTPStreamStats extends RTCStats {
  var associateStatsId: js.UndefOr[java.lang.String] = js.undefined
  var codecId: js.UndefOr[java.lang.String] = js.undefined
  var firCount: js.UndefOr[Double] = js.undefined
  var isRemote: js.UndefOr[scala.Boolean] = js.undefined
  var mediaTrackId: js.UndefOr[java.lang.String] = js.undefined
  var nackCount: js.UndefOr[Double] = js.undefined
  var pliCount: js.UndefOr[Double] = js.undefined
  var sliCount: js.UndefOr[Double] = js.undefined
  var ssrc: js.UndefOr[java.lang.String] = js.undefined
  var transportId: js.UndefOr[java.lang.String] = js.undefined
}

object RTCRTPStreamStats {
  @scala.inline
  def apply(): RTCRTPStreamStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRTPStreamStats]
  }
  @scala.inline
  implicit class RTCRTPStreamStatsOps[Self <: RTCRTPStreamStats] (val x: Self) extends AnyVal {
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
    def setAssociateStatsId(value: java.lang.String): Self = this.set("associateStatsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociateStatsId: Self = this.set("associateStatsId", js.undefined)
    @scala.inline
    def setCodecId(value: java.lang.String): Self = this.set("codecId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodecId: Self = this.set("codecId", js.undefined)
    @scala.inline
    def setFirCount(value: Double): Self = this.set("firCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirCount: Self = this.set("firCount", js.undefined)
    @scala.inline
    def setIsRemote(value: scala.Boolean): Self = this.set("isRemote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRemote: Self = this.set("isRemote", js.undefined)
    @scala.inline
    def setMediaTrackId(value: java.lang.String): Self = this.set("mediaTrackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaTrackId: Self = this.set("mediaTrackId", js.undefined)
    @scala.inline
    def setNackCount(value: Double): Self = this.set("nackCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNackCount: Self = this.set("nackCount", js.undefined)
    @scala.inline
    def setPliCount(value: Double): Self = this.set("pliCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePliCount: Self = this.set("pliCount", js.undefined)
    @scala.inline
    def setSliCount(value: Double): Self = this.set("sliCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliCount: Self = this.set("sliCount", js.undefined)
    @scala.inline
    def setSsrc(value: java.lang.String): Self = this.set("ssrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsrc: Self = this.set("ssrc", js.undefined)
    @scala.inline
    def setTransportId(value: java.lang.String): Self = this.set("transportId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportId: Self = this.set("transportId", js.undefined)
  }
  
}

