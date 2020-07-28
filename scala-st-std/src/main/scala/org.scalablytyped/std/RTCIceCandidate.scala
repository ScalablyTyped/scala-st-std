package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceCandidate extends js.Object {
  var candidate: java.lang.String | Null
  var sdpMLineIndex: Double | Null
  var sdpMid: java.lang.String | Null
  def toJSON(): js.Any
}

object RTCIceCandidate {
  @scala.inline
  def apply(toJSON: () => js.Any): RTCIceCandidate = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[RTCIceCandidate]
  }
  @scala.inline
  implicit class RTCIceCandidateOps[Self <: RTCIceCandidate] (val x: Self) extends AnyVal {
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
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setCandidate(value: java.lang.String): Self = this.set("candidate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCandidateNull: Self = this.set("candidate", null)
    @scala.inline
    def setSdpMLineIndex(value: Double): Self = this.set("sdpMLineIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSdpMLineIndexNull: Self = this.set("sdpMLineIndex", null)
    @scala.inline
    def setSdpMid(value: java.lang.String): Self = this.set("sdpMid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSdpMidNull: Self = this.set("sdpMid", null)
  }
  
}

