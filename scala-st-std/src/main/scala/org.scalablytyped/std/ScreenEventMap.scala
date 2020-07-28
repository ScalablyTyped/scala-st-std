package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenEventMap extends js.Object {
  var MSOrientationChange: Event
}

object ScreenEventMap {
  @scala.inline
  def apply(MSOrientationChange: Event): ScreenEventMap = {
    val __obj = js.Dynamic.literal(MSOrientationChange = MSOrientationChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenEventMap]
  }
  @scala.inline
  implicit class ScreenEventMapOps[Self <: ScreenEventMap] (val x: Self) extends AnyVal {
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
    def setMSOrientationChange(value: Event): Self = this.set("MSOrientationChange", value.asInstanceOf[js.Any])
  }
  
}

