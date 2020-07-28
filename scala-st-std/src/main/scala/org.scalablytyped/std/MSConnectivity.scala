package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSConnectivity extends js.Object {
  var iceType: js.UndefOr[java.lang.String] = js.undefined
  var iceWarningFlags: js.UndefOr[MSIceWarningFlags] = js.undefined
  var relayAddress: js.UndefOr[MSRelayAddress] = js.undefined
}

object MSConnectivity {
  @scala.inline
  def apply(): MSConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSConnectivity]
  }
  @scala.inline
  implicit class MSConnectivityOps[Self <: MSConnectivity] (val x: Self) extends AnyVal {
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
    def setIceType(value: java.lang.String): Self = this.set("iceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceType: Self = this.set("iceType", js.undefined)
    @scala.inline
    def setIceWarningFlags(value: MSIceWarningFlags): Self = this.set("iceWarningFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceWarningFlags: Self = this.set("iceWarningFlags", js.undefined)
    @scala.inline
    def setRelayAddress(value: MSRelayAddress): Self = this.set("relayAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelayAddress: Self = this.set("relayAddress", js.undefined)
  }
  
}

