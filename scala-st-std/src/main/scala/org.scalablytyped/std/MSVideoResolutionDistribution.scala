package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSVideoResolutionDistribution extends js.Object {
  var cifQuality: js.UndefOr[Double] = js.undefined
  var h1080Quality: js.UndefOr[Double] = js.undefined
  var h1440Quality: js.UndefOr[Double] = js.undefined
  var h2160Quality: js.UndefOr[Double] = js.undefined
  var h720Quality: js.UndefOr[Double] = js.undefined
  var vgaQuality: js.UndefOr[Double] = js.undefined
}

object MSVideoResolutionDistribution {
  @scala.inline
  def apply(): MSVideoResolutionDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSVideoResolutionDistribution]
  }
  @scala.inline
  implicit class MSVideoResolutionDistributionOps[Self <: MSVideoResolutionDistribution] (val x: Self) extends AnyVal {
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
    def setCifQuality(value: Double): Self = this.set("cifQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCifQuality: Self = this.set("cifQuality", js.undefined)
    @scala.inline
    def setH1080Quality(value: Double): Self = this.set("h1080Quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH1080Quality: Self = this.set("h1080Quality", js.undefined)
    @scala.inline
    def setH1440Quality(value: Double): Self = this.set("h1440Quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH1440Quality: Self = this.set("h1440Quality", js.undefined)
    @scala.inline
    def setH2160Quality(value: Double): Self = this.set("h2160Quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH2160Quality: Self = this.set("h2160Quality", js.undefined)
    @scala.inline
    def setH720Quality(value: Double): Self = this.set("h720Quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH720Quality: Self = this.set("h720Quality", js.undefined)
    @scala.inline
    def setVgaQuality(value: Double): Self = this.set("vgaQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVgaQuality: Self = this.set("vgaQuality", js.undefined)
  }
  
}

