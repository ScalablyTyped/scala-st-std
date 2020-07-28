package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSRelayAddress extends js.Object {
  var port: js.UndefOr[Double] = js.undefined
  var relayAddress: js.UndefOr[java.lang.String] = js.undefined
}

object MSRelayAddress {
  @scala.inline
  def apply(): MSRelayAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSRelayAddress]
  }
  @scala.inline
  implicit class MSRelayAddressOps[Self <: MSRelayAddress] (val x: Self) extends AnyVal {
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setRelayAddress(value: java.lang.String): Self = this.set("relayAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelayAddress: Self = this.set("relayAddress", js.undefined)
  }
  
}

