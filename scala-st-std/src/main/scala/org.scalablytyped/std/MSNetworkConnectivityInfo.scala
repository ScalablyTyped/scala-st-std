package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSNetworkConnectivityInfo extends js.Object {
  var linkspeed: js.UndefOr[Double] = js.undefined
  var networkConnectionDetails: js.UndefOr[java.lang.String] = js.undefined
  var vpn: js.UndefOr[scala.Boolean] = js.undefined
}

object MSNetworkConnectivityInfo {
  @scala.inline
  def apply(): MSNetworkConnectivityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSNetworkConnectivityInfo]
  }
  @scala.inline
  implicit class MSNetworkConnectivityInfoOps[Self <: MSNetworkConnectivityInfo] (val x: Self) extends AnyVal {
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
    def setLinkspeed(value: Double): Self = this.set("linkspeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkspeed: Self = this.set("linkspeed", js.undefined)
    @scala.inline
    def setNetworkConnectionDetails(value: java.lang.String): Self = this.set("networkConnectionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkConnectionDetails: Self = this.set("networkConnectionDetails", js.undefined)
    @scala.inline
    def setVpn(value: scala.Boolean): Self = this.set("vpn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpn: Self = this.set("vpn", js.undefined)
  }
  
}

