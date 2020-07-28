package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSDescription extends RTCStats {
  var connectivity: js.UndefOr[MSConnectivity] = js.undefined
  var deviceDevName: js.UndefOr[java.lang.String] = js.undefined
  var localAddr: js.UndefOr[MSIPAddressInfo] = js.undefined
  var networkconnectivity: js.UndefOr[MSNetworkConnectivityInfo] = js.undefined
  var reflexiveLocalIPAddr: js.UndefOr[MSIPAddressInfo] = js.undefined
  var remoteAddr: js.UndefOr[MSIPAddressInfo] = js.undefined
  var transport: js.UndefOr[RTCIceProtocol] = js.undefined
}

object MSDescription {
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): MSDescription = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSDescription]
  }
  @scala.inline
  implicit class MSDescriptionOps[Self <: MSDescription] (val x: Self) extends AnyVal {
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
    def setConnectivity(value: MSConnectivity): Self = this.set("connectivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectivity: Self = this.set("connectivity", js.undefined)
    @scala.inline
    def setDeviceDevName(value: java.lang.String): Self = this.set("deviceDevName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceDevName: Self = this.set("deviceDevName", js.undefined)
    @scala.inline
    def setLocalAddr(value: MSIPAddressInfo): Self = this.set("localAddr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddr: Self = this.set("localAddr", js.undefined)
    @scala.inline
    def setNetworkconnectivity(value: MSNetworkConnectivityInfo): Self = this.set("networkconnectivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkconnectivity: Self = this.set("networkconnectivity", js.undefined)
    @scala.inline
    def setReflexiveLocalIPAddr(value: MSIPAddressInfo): Self = this.set("reflexiveLocalIPAddr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReflexiveLocalIPAddr: Self = this.set("reflexiveLocalIPAddr", js.undefined)
    @scala.inline
    def setRemoteAddr(value: MSIPAddressInfo): Self = this.set("remoteAddr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAddr: Self = this.set("remoteAddr", js.undefined)
    @scala.inline
    def setTransport(value: RTCIceProtocol): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
  
}

