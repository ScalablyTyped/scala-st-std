package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSUtilization extends js.Object {
  var bandwidthEstimation: js.UndefOr[Double] = js.undefined
  var bandwidthEstimationAvg: js.UndefOr[Double] = js.undefined
  var bandwidthEstimationMax: js.UndefOr[Double] = js.undefined
  var bandwidthEstimationMin: js.UndefOr[Double] = js.undefined
  var bandwidthEstimationStdDev: js.UndefOr[Double] = js.undefined
  var packets: js.UndefOr[Double] = js.undefined
}

object MSUtilization {
  @scala.inline
  def apply(): MSUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSUtilization]
  }
  @scala.inline
  implicit class MSUtilizationOps[Self <: MSUtilization] (val x: Self) extends AnyVal {
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
    def setBandwidthEstimation(value: Double): Self = this.set("bandwidthEstimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidthEstimation: Self = this.set("bandwidthEstimation", js.undefined)
    @scala.inline
    def setBandwidthEstimationAvg(value: Double): Self = this.set("bandwidthEstimationAvg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidthEstimationAvg: Self = this.set("bandwidthEstimationAvg", js.undefined)
    @scala.inline
    def setBandwidthEstimationMax(value: Double): Self = this.set("bandwidthEstimationMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidthEstimationMax: Self = this.set("bandwidthEstimationMax", js.undefined)
    @scala.inline
    def setBandwidthEstimationMin(value: Double): Self = this.set("bandwidthEstimationMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidthEstimationMin: Self = this.set("bandwidthEstimationMin", js.undefined)
    @scala.inline
    def setBandwidthEstimationStdDev(value: Double): Self = this.set("bandwidthEstimationStdDev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidthEstimationStdDev: Self = this.set("bandwidthEstimationStdDev", js.undefined)
    @scala.inline
    def setPackets(value: Double): Self = this.set("packets", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackets: Self = this.set("packets", js.undefined)
  }
  
}

