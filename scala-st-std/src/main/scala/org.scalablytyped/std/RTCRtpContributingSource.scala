package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpContributingSource extends js.Object {
  var audioLevel: js.UndefOr[Double] = js.undefined
  var csrc: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
}

object RTCRtpContributingSource {
  @scala.inline
  def apply(): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
  @scala.inline
  implicit class RTCRtpContributingSourceOps[Self <: RTCRtpContributingSource] (val x: Self) extends AnyVal {
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
    def setAudioLevel(value: Double): Self = this.set("audioLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioLevel: Self = this.set("audioLevel", js.undefined)
    @scala.inline
    def setCsrc(value: Double): Self = this.set("csrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsrc: Self = this.set("csrc", js.undefined)
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

