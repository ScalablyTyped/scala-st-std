package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCTransportStats extends RTCStats {
  var activeConnection: js.UndefOr[scala.Boolean] = js.undefined
  var bytesReceived: js.UndefOr[Double] = js.undefined
  var bytesSent: js.UndefOr[Double] = js.undefined
  var localCertificateId: js.UndefOr[java.lang.String] = js.undefined
  var remoteCertificateId: js.UndefOr[java.lang.String] = js.undefined
  var rtcpTransportStatsId: js.UndefOr[java.lang.String] = js.undefined
  var selectedCandidatePairId: js.UndefOr[java.lang.String] = js.undefined
}

object RTCTransportStats {
  @scala.inline
  def apply(): RTCTransportStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCTransportStats]
  }
  @scala.inline
  implicit class RTCTransportStatsOps[Self <: RTCTransportStats] (val x: Self) extends AnyVal {
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
    def setActiveConnection(value: scala.Boolean): Self = this.set("activeConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveConnection: Self = this.set("activeConnection", js.undefined)
    @scala.inline
    def setBytesReceived(value: Double): Self = this.set("bytesReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesReceived: Self = this.set("bytesReceived", js.undefined)
    @scala.inline
    def setBytesSent(value: Double): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesSent: Self = this.set("bytesSent", js.undefined)
    @scala.inline
    def setLocalCertificateId(value: java.lang.String): Self = this.set("localCertificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalCertificateId: Self = this.set("localCertificateId", js.undefined)
    @scala.inline
    def setRemoteCertificateId(value: java.lang.String): Self = this.set("remoteCertificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteCertificateId: Self = this.set("remoteCertificateId", js.undefined)
    @scala.inline
    def setRtcpTransportStatsId(value: java.lang.String): Self = this.set("rtcpTransportStatsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtcpTransportStatsId: Self = this.set("rtcpTransportStatsId", js.undefined)
    @scala.inline
    def setSelectedCandidatePairId(value: java.lang.String): Self = this.set("selectedCandidatePairId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedCandidatePairId: Self = this.set("selectedCandidatePairId", js.undefined)
  }
  
}

