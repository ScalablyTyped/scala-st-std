package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasPathDrawingStyles extends js.Object {
  var lineCap: CanvasLineCap
  var lineDashOffset: Double
  var lineJoin: CanvasLineJoin
  var lineWidth: Double
  var miterLimit: Double
  def getLineDash(): js.Array[Double]
  def setLineDash(segments: js.Array[Double]): Unit
}

object CanvasPathDrawingStyles {
  @scala.inline
  def apply(
    getLineDash: () => js.Array[Double],
    lineCap: CanvasLineCap,
    lineDashOffset: Double,
    lineJoin: CanvasLineJoin,
    lineWidth: Double,
    miterLimit: Double,
    setLineDash: js.Array[Double] => Unit
  ): CanvasPathDrawingStyles = {
    val __obj = js.Dynamic.literal(getLineDash = js.Any.fromFunction0(getLineDash), lineCap = lineCap.asInstanceOf[js.Any], lineDashOffset = lineDashOffset.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], setLineDash = js.Any.fromFunction1(setLineDash))
    __obj.asInstanceOf[CanvasPathDrawingStyles]
  }
  @scala.inline
  implicit class CanvasPathDrawingStylesOps[Self <: CanvasPathDrawingStyles] (val x: Self) extends AnyVal {
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
    def setGetLineDash(value: () => js.Array[Double]): Self = this.set("getLineDash", js.Any.fromFunction0(value))
    @scala.inline
    def setLineCap(value: CanvasLineCap): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineDashOffset(value: Double): Self = this.set("lineDashOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineJoin(value: CanvasLineJoin): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiterLimit(value: Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetLineDash(value: js.Array[Double] => Unit): Self = this.set("setLineDash", js.Any.fromFunction1(value))
  }
  
}

