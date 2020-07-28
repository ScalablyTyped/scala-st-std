package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSNetwork extends RTCStats {
  var delay: js.UndefOr[MSDelay] = js.undefined
  var jitter: js.UndefOr[MSJitter] = js.undefined
  var packetLoss: js.UndefOr[MSPacketLoss] = js.undefined
  var utilization: js.UndefOr[MSUtilization] = js.undefined
}

object MSNetwork {
  @scala.inline
  def apply(): MSNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSNetwork]
  }
  @scala.inline
  implicit class MSNetworkOps[Self <: MSNetwork] (val x: Self) extends AnyVal {
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
    def setDelay(value: MSDelay): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setJitter(value: MSJitter): Self = this.set("jitter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJitter: Self = this.set("jitter", js.undefined)
    @scala.inline
    def setPacketLoss(value: MSPacketLoss): Self = this.set("packetLoss", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketLoss: Self = this.set("packetLoss", js.undefined)
    @scala.inline
    def setUtilization(value: MSUtilization): Self = this.set("utilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtilization: Self = this.set("utilization", js.undefined)
  }
  
}

