package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceCandidate extends RTCIceGatherCandidate {
  var foundation: js.UndefOr[java.lang.String] = js.undefined
  var ip: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var relatedAddress: js.UndefOr[java.lang.String] = js.undefined
  var relatedPort: js.UndefOr[Double] = js.undefined
  var tcpType: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object RTCIceCandidate {
  @scala.inline
  def apply(): RTCIceCandidate = {
    val __obj = js.Dynamic.literal()
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
    def setFoundation(value: java.lang.String): Self = this.set("foundation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoundation: Self = this.set("foundation", js.undefined)
    @scala.inline
    def setIp(value: java.lang.String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setProtocol(value: java.lang.String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setRelatedAddress(value: java.lang.String): Self = this.set("relatedAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedAddress: Self = this.set("relatedAddress", js.undefined)
    @scala.inline
    def setRelatedPort(value: Double): Self = this.set("relatedPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedPort: Self = this.set("relatedPort", js.undefined)
    @scala.inline
    def setTcpType(value: java.lang.String): Self = this.set("tcpType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpType: Self = this.set("tcpType", js.undefined)
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

