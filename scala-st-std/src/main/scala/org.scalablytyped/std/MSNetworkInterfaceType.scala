package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSNetworkInterfaceType extends js.Object {
  var interfaceTypeEthernet: js.UndefOr[scala.Boolean] = js.undefined
  var interfaceTypePPP: js.UndefOr[scala.Boolean] = js.undefined
  var interfaceTypeTunnel: js.UndefOr[scala.Boolean] = js.undefined
  var interfaceTypeWWAN: js.UndefOr[scala.Boolean] = js.undefined
  var interfaceTypeWireless: js.UndefOr[scala.Boolean] = js.undefined
}

object MSNetworkInterfaceType {
  @scala.inline
  def apply(): MSNetworkInterfaceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSNetworkInterfaceType]
  }
  @scala.inline
  implicit class MSNetworkInterfaceTypeOps[Self <: MSNetworkInterfaceType] (val x: Self) extends AnyVal {
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
    def setInterfaceTypeEthernet(value: scala.Boolean): Self = this.set("interfaceTypeEthernet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceTypeEthernet: Self = this.set("interfaceTypeEthernet", js.undefined)
    @scala.inline
    def setInterfaceTypePPP(value: scala.Boolean): Self = this.set("interfaceTypePPP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceTypePPP: Self = this.set("interfaceTypePPP", js.undefined)
    @scala.inline
    def setInterfaceTypeTunnel(value: scala.Boolean): Self = this.set("interfaceTypeTunnel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceTypeTunnel: Self = this.set("interfaceTypeTunnel", js.undefined)
    @scala.inline
    def setInterfaceTypeWWAN(value: scala.Boolean): Self = this.set("interfaceTypeWWAN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceTypeWWAN: Self = this.set("interfaceTypeWWAN", js.undefined)
    @scala.inline
    def setInterfaceTypeWireless(value: scala.Boolean): Self = this.set("interfaceTypeWireless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceTypeWireless: Self = this.set("interfaceTypeWireless", js.undefined)
  }
  
}

