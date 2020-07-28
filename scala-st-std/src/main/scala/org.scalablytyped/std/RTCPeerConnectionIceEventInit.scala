package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCPeerConnectionIceEventInit extends EventInit {
  var candidate: js.UndefOr[RTCIceCandidate] = js.undefined
}

object RTCPeerConnectionIceEventInit {
  @scala.inline
  def apply(): RTCPeerConnectionIceEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCPeerConnectionIceEventInit]
  }
  @scala.inline
  implicit class RTCPeerConnectionIceEventInitOps[Self <: RTCPeerConnectionIceEventInit] (val x: Self) extends AnyVal {
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
    def setCandidate(value: RTCIceCandidate): Self = this.set("candidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandidate: Self = this.set("candidate", js.undefined)
  }
  
}

