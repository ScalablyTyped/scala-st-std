package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSLocalClientEventBase
  extends RTCStats
     with MSLocalClientEvent {
  var networkBandwidthLowEventRatio: js.UndefOr[Double] = js.undefined
  var networkReceiveQualityEventRatio: js.UndefOr[Double] = js.undefined
}

object MSLocalClientEventBase {
  @scala.inline
  def apply(): MSLocalClientEventBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSLocalClientEventBase]
  }
  @scala.inline
  implicit class MSLocalClientEventBaseOps[Self <: MSLocalClientEventBase] (val x: Self) extends AnyVal {
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
    def setNetworkBandwidthLowEventRatio(value: Double): Self = this.set("networkBandwidthLowEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkBandwidthLowEventRatio: Self = this.set("networkBandwidthLowEventRatio", js.undefined)
    @scala.inline
    def setNetworkReceiveQualityEventRatio(value: Double): Self = this.set("networkReceiveQualityEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkReceiveQualityEventRatio: Self = this.set("networkReceiveQualityEventRatio", js.undefined)
  }
  
}

