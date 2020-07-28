package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpSenderEventMap extends js.Object {
  var error: Event
  var ssrcconflict: RTCSsrcConflictEvent
}

object RTCRtpSenderEventMap {
  @scala.inline
  def apply(error: Event, ssrcconflict: RTCSsrcConflictEvent): RTCRtpSenderEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ssrcconflict = ssrcconflict.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpSenderEventMap]
  }
  @scala.inline
  implicit class RTCRtpSenderEventMapOps[Self <: RTCRtpSenderEventMap] (val x: Self) extends AnyVal {
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
    def setError(value: Event): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setSsrcconflict(value: RTCSsrcConflictEvent): Self = this.set("ssrcconflict", value.asInstanceOf[js.Any])
  }
  
}

