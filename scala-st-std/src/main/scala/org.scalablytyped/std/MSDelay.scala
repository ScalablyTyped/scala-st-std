package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSDelay extends js.Object {
  var roundTrip: js.UndefOr[Double] = js.undefined
  var roundTripMax: js.UndefOr[Double] = js.undefined
}

object MSDelay {
  @scala.inline
  def apply(): MSDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSDelay]
  }
  @scala.inline
  implicit class MSDelayOps[Self <: MSDelay] (val x: Self) extends AnyVal {
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
    def setRoundTrip(value: Double): Self = this.set("roundTrip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundTrip: Self = this.set("roundTrip", js.undefined)
    @scala.inline
    def setRoundTripMax(value: Double): Self = this.set("roundTripMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundTripMax: Self = this.set("roundTripMax", js.undefined)
  }
  
}

