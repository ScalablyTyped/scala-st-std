package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPoint extends js.Object {
  var x: Double
  var y: Double
  def matrixTransform(matrix: SVGMatrix): SVGPoint
}

object SVGPoint {
  @scala.inline
  def apply(matrixTransform: SVGMatrix => SVGPoint, x: Double, y: Double): SVGPoint = {
    val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPoint]
  }
  @scala.inline
  implicit class SVGPointOps[Self <: SVGPoint] (val x: Self) extends AnyVal {
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
    def setMatrixTransform(value: SVGMatrix => SVGPoint): Self = this.set("matrixTransform", js.Any.fromFunction1(value))
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

