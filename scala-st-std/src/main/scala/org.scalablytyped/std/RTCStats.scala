package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCStats extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var msType: js.UndefOr[MSStatsType] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[RTCStatsType] = js.undefined
}

object RTCStats {
  @scala.inline
  def apply(): RTCStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCStats]
  }
  @scala.inline
  implicit class RTCStatsOps[Self <: RTCStats] (val x: Self) extends AnyVal {
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
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMsType(value: MSStatsType): Self = this.set("msType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsType: Self = this.set("msType", js.undefined)
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setType(value: RTCStatsType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

