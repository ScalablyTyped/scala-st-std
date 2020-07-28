package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSTransportDiagnosticsStats extends RTCStats {
  var allocationTimeInMs: js.UndefOr[Double] = js.undefined
  var baseAddress: js.UndefOr[java.lang.String] = js.undefined
  var baseInterface: js.UndefOr[MSNetworkInterfaceType] = js.undefined
  var iceRole: js.UndefOr[RTCIceRole] = js.undefined
  var iceWarningFlags: js.UndefOr[MSIceWarningFlags] = js.undefined
  var interfaces: js.UndefOr[MSNetworkInterfaceType] = js.undefined
  var localAddrType: js.UndefOr[MSIceAddrType] = js.undefined
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var localInterface: js.UndefOr[MSNetworkInterfaceType] = js.undefined
  var localMR: js.UndefOr[java.lang.String] = js.undefined
  var localMRTCPPort: js.UndefOr[Double] = js.undefined
  var localSite: js.UndefOr[java.lang.String] = js.undefined
  var msRtcEngineVersion: js.UndefOr[java.lang.String] = js.undefined
  var networkName: js.UndefOr[java.lang.String] = js.undefined
  var numConsentReqReceived: js.UndefOr[Double] = js.undefined
  var numConsentReqSent: js.UndefOr[Double] = js.undefined
  var numConsentRespReceived: js.UndefOr[Double] = js.undefined
  var numConsentRespSent: js.UndefOr[Double] = js.undefined
  var portRangeMax: js.UndefOr[Double] = js.undefined
  var portRangeMin: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[RTCIceProtocol] = js.undefined
  var remoteAddrType: js.UndefOr[MSIceAddrType] = js.undefined
  var remoteAddress: js.UndefOr[java.lang.String] = js.undefined
  var remoteMR: js.UndefOr[java.lang.String] = js.undefined
  var remoteMRTCPPort: js.UndefOr[Double] = js.undefined
  var remoteSite: js.UndefOr[java.lang.String] = js.undefined
  var rtpRtcpMux: js.UndefOr[scala.Boolean] = js.undefined
  var stunVer: js.UndefOr[Double] = js.undefined
}

object MSTransportDiagnosticsStats {
  @scala.inline
  def apply(): MSTransportDiagnosticsStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSTransportDiagnosticsStats]
  }
  @scala.inline
  implicit class MSTransportDiagnosticsStatsOps[Self <: MSTransportDiagnosticsStats] (val x: Self) extends AnyVal {
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
    def setAllocationTimeInMs(value: Double): Self = this.set("allocationTimeInMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationTimeInMs: Self = this.set("allocationTimeInMs", js.undefined)
    @scala.inline
    def setBaseAddress(value: java.lang.String): Self = this.set("baseAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseAddress: Self = this.set("baseAddress", js.undefined)
    @scala.inline
    def setBaseInterface(value: MSNetworkInterfaceType): Self = this.set("baseInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseInterface: Self = this.set("baseInterface", js.undefined)
    @scala.inline
    def setIceRole(value: RTCIceRole): Self = this.set("iceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceRole: Self = this.set("iceRole", js.undefined)
    @scala.inline
    def setIceWarningFlags(value: MSIceWarningFlags): Self = this.set("iceWarningFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceWarningFlags: Self = this.set("iceWarningFlags", js.undefined)
    @scala.inline
    def setInterfaces(value: MSNetworkInterfaceType): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaces: Self = this.set("interfaces", js.undefined)
    @scala.inline
    def setLocalAddrType(value: MSIceAddrType): Self = this.set("localAddrType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddrType: Self = this.set("localAddrType", js.undefined)
    @scala.inline
    def setLocalAddress(value: java.lang.String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    @scala.inline
    def setLocalInterface(value: MSNetworkInterfaceType): Self = this.set("localInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalInterface: Self = this.set("localInterface", js.undefined)
    @scala.inline
    def setLocalMR(value: java.lang.String): Self = this.set("localMR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalMR: Self = this.set("localMR", js.undefined)
    @scala.inline
    def setLocalMRTCPPort(value: Double): Self = this.set("localMRTCPPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalMRTCPPort: Self = this.set("localMRTCPPort", js.undefined)
    @scala.inline
    def setLocalSite(value: java.lang.String): Self = this.set("localSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalSite: Self = this.set("localSite", js.undefined)
    @scala.inline
    def setMsRtcEngineVersion(value: java.lang.String): Self = this.set("msRtcEngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsRtcEngineVersion: Self = this.set("msRtcEngineVersion", js.undefined)
    @scala.inline
    def setNetworkName(value: java.lang.String): Self = this.set("networkName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkName: Self = this.set("networkName", js.undefined)
    @scala.inline
    def setNumConsentReqReceived(value: Double): Self = this.set("numConsentReqReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumConsentReqReceived: Self = this.set("numConsentReqReceived", js.undefined)
    @scala.inline
    def setNumConsentReqSent(value: Double): Self = this.set("numConsentReqSent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumConsentReqSent: Self = this.set("numConsentReqSent", js.undefined)
    @scala.inline
    def setNumConsentRespReceived(value: Double): Self = this.set("numConsentRespReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumConsentRespReceived: Self = this.set("numConsentRespReceived", js.undefined)
    @scala.inline
    def setNumConsentRespSent(value: Double): Self = this.set("numConsentRespSent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumConsentRespSent: Self = this.set("numConsentRespSent", js.undefined)
    @scala.inline
    def setPortRangeMax(value: Double): Self = this.set("portRangeMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortRangeMax: Self = this.set("portRangeMax", js.undefined)
    @scala.inline
    def setPortRangeMin(value: Double): Self = this.set("portRangeMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortRangeMin: Self = this.set("portRangeMin", js.undefined)
    @scala.inline
    def setProtocol(value: RTCIceProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setRemoteAddrType(value: MSIceAddrType): Self = this.set("remoteAddrType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAddrType: Self = this.set("remoteAddrType", js.undefined)
    @scala.inline
    def setRemoteAddress(value: java.lang.String): Self = this.set("remoteAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAddress: Self = this.set("remoteAddress", js.undefined)
    @scala.inline
    def setRemoteMR(value: java.lang.String): Self = this.set("remoteMR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteMR: Self = this.set("remoteMR", js.undefined)
    @scala.inline
    def setRemoteMRTCPPort(value: Double): Self = this.set("remoteMRTCPPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteMRTCPPort: Self = this.set("remoteMRTCPPort", js.undefined)
    @scala.inline
    def setRemoteSite(value: java.lang.String): Self = this.set("remoteSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteSite: Self = this.set("remoteSite", js.undefined)
    @scala.inline
    def setRtpRtcpMux(value: scala.Boolean): Self = this.set("rtpRtcpMux", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtpRtcpMux: Self = this.set("rtpRtcpMux", js.undefined)
    @scala.inline
    def setStunVer(value: Double): Self = this.set("stunVer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStunVer: Self = this.set("stunVer", js.undefined)
  }
  
}

