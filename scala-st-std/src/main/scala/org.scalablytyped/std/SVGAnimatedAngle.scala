package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedAngle extends js.Object {
  var animVal: SVGAngle
  var baseVal: SVGAngle
}

object SVGAnimatedAngle {
  @scala.inline
  def apply(animVal: SVGAngle, baseVal: SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
  @scala.inline
  implicit class SVGAnimatedAngleOps[Self <: SVGAnimatedAngle] (val x: Self) extends AnyVal {
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
    def setAnimVal(value: SVGAngle): Self = this.set("animVal", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseVal(value: SVGAngle): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
  
}

