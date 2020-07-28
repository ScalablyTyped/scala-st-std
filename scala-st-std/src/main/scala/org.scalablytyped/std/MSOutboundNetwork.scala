package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSOutboundNetwork extends MSNetwork {
  var appliedBandwidthLimit: js.UndefOr[Double] = js.undefined
}

object MSOutboundNetwork {
  @scala.inline
  def apply(): MSOutboundNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSOutboundNetwork]
  }
  @scala.inline
  implicit class MSOutboundNetworkOps[Self <: MSOutboundNetwork] (val x: Self) extends AnyVal {
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
    def setAppliedBandwidthLimit(value: Double): Self = this.set("appliedBandwidthLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliedBandwidthLimit: Self = this.set("appliedBandwidthLimit", js.undefined)
  }
  
}

