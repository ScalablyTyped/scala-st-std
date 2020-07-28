package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ANGLEInstancedArrays extends js.Object {
  var VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: Double
  def drawArraysInstancedANGLE(mode: Double, first: Double, count: Double, primcount: Double): Unit
  def drawElementsInstancedANGLE(mode: Double, count: Double, `type`: Double, offset: Double, primcount: Double): Unit
  def vertexAttribDivisorANGLE(index: Double, divisor: Double): Unit
}

object ANGLEInstancedArrays {
  @scala.inline
  def apply(
    VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: Double,
    drawArraysInstancedANGLE: (Double, Double, Double, Double) => Unit,
    drawElementsInstancedANGLE: (Double, Double, Double, Double, Double) => Unit,
    vertexAttribDivisorANGLE: (Double, Double) => Unit
  ): ANGLEInstancedArrays = {
    val __obj = js.Dynamic.literal(VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE = VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE.asInstanceOf[js.Any], drawArraysInstancedANGLE = js.Any.fromFunction4(drawArraysInstancedANGLE), drawElementsInstancedANGLE = js.Any.fromFunction5(drawElementsInstancedANGLE), vertexAttribDivisorANGLE = js.Any.fromFunction2(vertexAttribDivisorANGLE))
    __obj.asInstanceOf[ANGLEInstancedArrays]
  }
  @scala.inline
  implicit class ANGLEInstancedArraysOps[Self <: ANGLEInstancedArrays] (val x: Self) extends AnyVal {
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
    def setVERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE(value: Double): Self = this.set("VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawArraysInstancedANGLE(value: (Double, Double, Double, Double) => Unit): Self = this.set("drawArraysInstancedANGLE", js.Any.fromFunction4(value))
    @scala.inline
    def setDrawElementsInstancedANGLE(value: (Double, Double, Double, Double, Double) => Unit): Self = this.set("drawElementsInstancedANGLE", js.Any.fromFunction5(value))
    @scala.inline
    def setVertexAttribDivisorANGLE(value: (Double, Double) => Unit): Self = this.set("vertexAttribDivisorANGLE", js.Any.fromFunction2(value))
  }
  
}

