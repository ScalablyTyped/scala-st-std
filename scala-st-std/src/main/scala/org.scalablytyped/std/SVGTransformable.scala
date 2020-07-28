package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTransformable extends SVGLocatable {
  var transform: SVGAnimatedTransformList
}

object SVGTransformable {
  @scala.inline
  def apply(
    farthestViewportElement: SVGElement,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getScreenCTM: () => SVGMatrix,
    getTransformToElement: SVGElement => SVGMatrix,
    nearestViewportElement: SVGElement,
    transform: SVGAnimatedTransformList
  ): SVGTransformable = {
    val __obj = js.Dynamic.literal(farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTransformable]
  }
  @scala.inline
  implicit class SVGTransformableOps[Self <: SVGTransformable] (val x: Self) extends AnyVal {
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
    def setTransform(value: SVGAnimatedTransformList): Self = this.set("transform", value.asInstanceOf[js.Any])
  }
  
}

