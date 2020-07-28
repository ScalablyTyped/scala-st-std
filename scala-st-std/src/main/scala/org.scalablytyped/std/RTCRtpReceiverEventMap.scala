package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpReceiverEventMap extends js.Object {
  var error: Event
  var msdecodercapacitychange: Event
  var msdsh: Event
}

object RTCRtpReceiverEventMap {
  @scala.inline
  def apply(error: Event, msdecodercapacitychange: Event, msdsh: Event): RTCRtpReceiverEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], msdecodercapacitychange = msdecodercapacitychange.asInstanceOf[js.Any], msdsh = msdsh.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpReceiverEventMap]
  }
  @scala.inline
  implicit class RTCRtpReceiverEventMapOps[Self <: RTCRtpReceiverEventMap] (val x: Self) extends AnyVal {
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
    def setMsdecodercapacitychange(value: Event): Self = this.set("msdecodercapacitychange", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsdsh(value: Event): Self = this.set("msdsh", value.asInstanceOf[js.Any])
  }
  
}

