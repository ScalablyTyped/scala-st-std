package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelEventInit extends MouseEventInit {
  var deltaMode: js.UndefOr[Double] = js.undefined
  var deltaX: js.UndefOr[Double] = js.undefined
  var deltaY: js.UndefOr[Double] = js.undefined
  var deltaZ: js.UndefOr[Double] = js.undefined
}

object WheelEventInit {
  @scala.inline
  def apply(): WheelEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WheelEventInit]
  }
  @scala.inline
  implicit class WheelEventInitOps[Self <: WheelEventInit] (val x: Self) extends AnyVal {
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
    def setDeltaMode(value: Double): Self = this.set("deltaMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaMode: Self = this.set("deltaMode", js.undefined)
    @scala.inline
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaX: Self = this.set("deltaX", js.undefined)
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaY: Self = this.set("deltaY", js.undefined)
    @scala.inline
    def setDeltaZ(value: Double): Self = this.set("deltaZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeltaZ: Self = this.set("deltaZ", js.undefined)
  }
  
}

