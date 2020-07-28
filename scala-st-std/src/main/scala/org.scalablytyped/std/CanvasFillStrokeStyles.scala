package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasFillStrokeStyles extends js.Object {
  var fillStyle: java.lang.String | CanvasGradient | CanvasPattern
  var strokeStyle: java.lang.String | CanvasGradient | CanvasPattern
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient
  def createPattern(image: CanvasImageSource, repetition: java.lang.String): CanvasPattern | Null
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient
}

object CanvasFillStrokeStyles {
  @scala.inline
  def apply(
    createLinearGradient: (Double, Double, Double, Double) => CanvasGradient,
    createPattern: (CanvasImageSource, java.lang.String) => CanvasPattern | Null,
    createRadialGradient: (Double, Double, Double, Double, Double, Double) => CanvasGradient,
    fillStyle: java.lang.String | CanvasGradient | CanvasPattern,
    strokeStyle: java.lang.String | CanvasGradient | CanvasPattern
  ): CanvasFillStrokeStyles = {
    val __obj = js.Dynamic.literal(createLinearGradient = js.Any.fromFunction4(createLinearGradient), createPattern = js.Any.fromFunction2(createPattern), createRadialGradient = js.Any.fromFunction6(createRadialGradient), fillStyle = fillStyle.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasFillStrokeStyles]
  }
  @scala.inline
  implicit class CanvasFillStrokeStylesOps[Self <: CanvasFillStrokeStyles] (val x: Self) extends AnyVal {
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
    def setCreateLinearGradient(value: (Double, Double, Double, Double) => CanvasGradient): Self = this.set("createLinearGradient", js.Any.fromFunction4(value))
    @scala.inline
    def setCreatePattern(value: (CanvasImageSource, java.lang.String) => CanvasPattern | Null): Self = this.set("createPattern", js.Any.fromFunction2(value))
    @scala.inline
    def setCreateRadialGradient(value: (Double, Double, Double, Double, Double, Double) => CanvasGradient): Self = this.set("createRadialGradient", js.Any.fromFunction6(value))
    @scala.inline
    def setFillStyle(value: java.lang.String | CanvasGradient | CanvasPattern): Self = this.set("fillStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeStyle(value: java.lang.String | CanvasGradient | CanvasPattern): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
  }
  
}

