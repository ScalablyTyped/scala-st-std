package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedTimingProperties extends js.Object {
  var activeDuration: Double
  var currentIteration: Double | Null
  var endTime: Double
  var localTime: Double | Null
  var progress: Double | Null
}

object ComputedTimingProperties {
  @scala.inline
  def apply(activeDuration: Double, endTime: Double): ComputedTimingProperties = {
    val __obj = js.Dynamic.literal(activeDuration = activeDuration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedTimingProperties]
  }
  @scala.inline
  implicit class ComputedTimingPropertiesOps[Self <: ComputedTimingProperties] (val x: Self) extends AnyVal {
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
    def setActiveDuration(value: Double): Self = this.set("activeDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentIteration(value: Double): Self = this.set("currentIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentIterationNull: Self = this.set("currentIteration", null)
    @scala.inline
    def setLocalTime(value: Double): Self = this.set("localTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalTimeNull: Self = this.set("localTime", null)
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgressNull: Self = this.set("progress", null)
  }
  
}

