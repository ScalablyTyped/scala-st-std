package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenOrientationEventMap extends js.Object {
  var change: Event
}

object ScreenOrientationEventMap {
  @scala.inline
  def apply(change: Event): ScreenOrientationEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenOrientationEventMap]
  }
  @scala.inline
  implicit class ScreenOrientationEventMapOps[Self <: ScreenOrientationEventMap] (val x: Self) extends AnyVal {
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
    def setChange(value: Event): Self = this.set("change", value.asInstanceOf[js.Any])
  }
  
}

