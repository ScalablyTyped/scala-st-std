package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.`alternate-reverse`
import org.scalablytyped.std.stdStrings.alternate
import org.scalablytyped.std.stdStrings.auto
import org.scalablytyped.std.stdStrings.backwards
import org.scalablytyped.std.stdStrings.both
import org.scalablytyped.std.stdStrings.forwards
import org.scalablytyped.std.stdStrings.none
import org.scalablytyped.std.stdStrings.normal
import org.scalablytyped.std.stdStrings.reverse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[normal | reverse | alternate | `alternate-reverse`] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var endDelay: js.UndefOr[Double] = js.undefined
  var fill: js.UndefOr[none | forwards | backwards | both | auto] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var iterationStart: js.UndefOr[Double] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  @scala.inline
  implicit class AnimationOptionsOps[Self <: AnimationOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDirection(value: normal | reverse | alternate | `alternate-reverse`): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: java.lang.String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEndDelay(value: Double): Self = this.set("endDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDelay: Self = this.set("endDelay", js.undefined)
    @scala.inline
    def setFill(value: none | forwards | backwards | both | auto): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIterationStart(value: Double): Self = this.set("iterationStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterationStart: Self = this.set("iterationStart", js.undefined)
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
  }
  
}

