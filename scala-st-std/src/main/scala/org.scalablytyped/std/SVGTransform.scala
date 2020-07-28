package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTransform extends js.Object {
  var SVG_TRANSFORM_MATRIX: Double
  var SVG_TRANSFORM_ROTATE: Double
  var SVG_TRANSFORM_SCALE: Double
  var SVG_TRANSFORM_SKEWX: Double
  var SVG_TRANSFORM_SKEWY: Double
  var SVG_TRANSFORM_TRANSLATE: Double
  var SVG_TRANSFORM_UNKNOWN: Double
  var angle: Double
  var matrix: SVGMatrix
  var `type`: Double
  def setMatrix(matrix: SVGMatrix): Unit
  def setRotate(angle: Double, cx: Double, cy: Double): Unit
  def setScale(sx: Double, sy: Double): Unit
  def setSkewX(angle: Double): Unit
  def setSkewY(angle: Double): Unit
  def setTranslate(tx: Double, ty: Double): Unit
}

object SVGTransform {
  @scala.inline
  def apply(
    SVG_TRANSFORM_MATRIX: Double,
    SVG_TRANSFORM_ROTATE: Double,
    SVG_TRANSFORM_SCALE: Double,
    SVG_TRANSFORM_SKEWX: Double,
    SVG_TRANSFORM_SKEWY: Double,
    SVG_TRANSFORM_TRANSLATE: Double,
    SVG_TRANSFORM_UNKNOWN: Double,
    angle: Double,
    matrix: SVGMatrix,
    setMatrix: SVGMatrix => Unit,
    setRotate: (Double, Double, Double) => Unit,
    setScale: (Double, Double) => Unit,
    setSkewX: Double => Unit,
    setSkewY: Double => Unit,
    setTranslate: (Double, Double) => Unit,
    `type`: Double
  ): SVGTransform = {
    val __obj = js.Dynamic.literal(SVG_TRANSFORM_MATRIX = SVG_TRANSFORM_MATRIX.asInstanceOf[js.Any], SVG_TRANSFORM_ROTATE = SVG_TRANSFORM_ROTATE.asInstanceOf[js.Any], SVG_TRANSFORM_SCALE = SVG_TRANSFORM_SCALE.asInstanceOf[js.Any], SVG_TRANSFORM_SKEWX = SVG_TRANSFORM_SKEWX.asInstanceOf[js.Any], SVG_TRANSFORM_SKEWY = SVG_TRANSFORM_SKEWY.asInstanceOf[js.Any], SVG_TRANSFORM_TRANSLATE = SVG_TRANSFORM_TRANSLATE.asInstanceOf[js.Any], SVG_TRANSFORM_UNKNOWN = SVG_TRANSFORM_UNKNOWN.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], setMatrix = js.Any.fromFunction1(setMatrix), setRotate = js.Any.fromFunction3(setRotate), setScale = js.Any.fromFunction2(setScale), setSkewX = js.Any.fromFunction1(setSkewX), setSkewY = js.Any.fromFunction1(setSkewY), setTranslate = js.Any.fromFunction2(setTranslate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTransform]
  }
  @scala.inline
  implicit class SVGTransformOps[Self <: SVGTransform] (val x: Self) extends AnyVal {
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
    def setSVG_TRANSFORM_MATRIX(value: Double): Self = this.set("SVG_TRANSFORM_MATRIX", value.asInstanceOf[js.Any])
    @scala.inline
    def setSVG_TRANSFORM_ROTATE(value: Double): Self = this.set("SVG_TRANSFORM_ROTATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSVG_TRANSFORM_SCALE(value: Double): Self = this.set("SVG_TRANSFORM_SCALE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSVG_TRANSFORM_SKEWX(value: Double): Self = this.set("SVG_TRANSFORM_SKEWX", value.asInstanceOf[js.Any])
    @scala.inline
    def setSVG_TRANSFORM_SKEWY(value: Double): Self = this.set("SVG_TRANSFORM_SKEWY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSVG_TRANSFORM_TRANSLATE(value: Double): Self = this.set("SVG_TRANSFORM_TRANSLATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSVG_TRANSFORM_UNKNOWN(value: Double): Self = this.set("SVG_TRANSFORM_UNKNOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatrix(value: SVGMatrix): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetMatrix(value: SVGMatrix => Unit): Self = this.set("setMatrix", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRotate(value: (Double, Double, Double) => Unit): Self = this.set("setRotate", js.Any.fromFunction3(value))
    @scala.inline
    def setSetScale(value: (Double, Double) => Unit): Self = this.set("setScale", js.Any.fromFunction2(value))
    @scala.inline
    def setSetSkewX(value: Double => Unit): Self = this.set("setSkewX", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSkewY(value: Double => Unit): Self = this.set("setSkewY", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTranslate(value: (Double, Double) => Unit): Self = this.set("setTranslate", js.Any.fromFunction2(value))
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

