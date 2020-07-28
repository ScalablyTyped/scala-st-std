package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSJitter extends js.Object {
  var interArrival: js.UndefOr[Double] = js.undefined
  var interArrivalMax: js.UndefOr[Double] = js.undefined
  var interArrivalSD: js.UndefOr[Double] = js.undefined
}

object MSJitter {
  @scala.inline
  def apply(): MSJitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSJitter]
  }
  @scala.inline
  implicit class MSJitterOps[Self <: MSJitter] (val x: Self) extends AnyVal {
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
    def setInterArrival(value: Double): Self = this.set("interArrival", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterArrival: Self = this.set("interArrival", js.undefined)
    @scala.inline
    def setInterArrivalMax(value: Double): Self = this.set("interArrivalMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterArrivalMax: Self = this.set("interArrivalMax", js.undefined)
    @scala.inline
    def setInterArrivalSD(value: Double): Self = this.set("interArrivalSD", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterArrivalSD: Self = this.set("interArrivalSD", js.undefined)
  }
  
}

