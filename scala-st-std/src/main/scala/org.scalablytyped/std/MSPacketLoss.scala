package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSPacketLoss extends js.Object {
  var lossRate: js.UndefOr[Double] = js.undefined
  var lossRateMax: js.UndefOr[Double] = js.undefined
}

object MSPacketLoss {
  @scala.inline
  def apply(): MSPacketLoss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSPacketLoss]
  }
  @scala.inline
  implicit class MSPacketLossOps[Self <: MSPacketLoss] (val x: Self) extends AnyVal {
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
    def setLossRate(value: Double): Self = this.set("lossRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLossRate: Self = this.set("lossRate", js.undefined)
    @scala.inline
    def setLossRateMax(value: Double): Self = this.set("lossRateMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLossRateMax: Self = this.set("lossRateMax", js.undefined)
  }
  
}

