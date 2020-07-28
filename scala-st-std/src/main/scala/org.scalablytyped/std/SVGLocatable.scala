package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGLocatable extends js.Object {
  var farthestViewportElement: SVGElement
  var nearestViewportElement: SVGElement
  def getBBox(): SVGRect
  def getCTM(): SVGMatrix
  def getScreenCTM(): SVGMatrix
  def getTransformToElement(element: SVGElement): SVGMatrix
}

object SVGLocatable {
  @scala.inline
  def apply(
    farthestViewportElement: SVGElement,
    getBBox: () => SVGRect,
    getCTM: () => SVGMatrix,
    getScreenCTM: () => SVGMatrix,
    getTransformToElement: SVGElement => SVGMatrix,
    nearestViewportElement: SVGElement
  ): SVGLocatable = {
    val __obj = js.Dynamic.literal(farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], getBBox = js.Any.fromFunction0(getBBox), getCTM = js.Any.fromFunction0(getCTM), getScreenCTM = js.Any.fromFunction0(getScreenCTM), getTransformToElement = js.Any.fromFunction1(getTransformToElement), nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLocatable]
  }
  @scala.inline
  implicit class SVGLocatableOps[Self <: SVGLocatable] (val x: Self) extends AnyVal {
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
    def setFarthestViewportElement(value: SVGElement): Self = this.set("farthestViewportElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBBox(value: () => SVGRect): Self = this.set("getBBox", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCTM(value: () => SVGMatrix): Self = this.set("getCTM", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScreenCTM(value: () => SVGMatrix): Self = this.set("getScreenCTM", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTransformToElement(value: SVGElement => SVGMatrix): Self = this.set("getTransformToElement", js.Any.fromFunction1(value))
    @scala.inline
    def setNearestViewportElement(value: SVGElement): Self = this.set("nearestViewportElement", value.asInstanceOf[js.Any])
  }
  
}

