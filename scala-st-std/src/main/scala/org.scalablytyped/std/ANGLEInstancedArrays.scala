package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ANGLEInstancedArrays extends js.Object {
  val VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum
  def drawArraysInstancedANGLE(mode: GLenum, first: GLint, count: GLsizei, primcount: GLsizei): Unit
  def drawElementsInstancedANGLE(mode: GLenum, count: GLsizei, `type`: GLenum, offset: GLintptr, primcount: GLsizei): Unit
  def vertexAttribDivisorANGLE(index: GLuint, divisor: GLuint): Unit
}

object ANGLEInstancedArrays {
  @scala.inline
  def apply(
    VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE: GLenum,
    drawArraysInstancedANGLE: (GLenum, GLint, GLsizei, GLsizei) => Unit,
    drawElementsInstancedANGLE: (GLenum, GLsizei, GLenum, GLintptr, GLsizei) => Unit,
    vertexAttribDivisorANGLE: (GLuint, GLuint) => Unit
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
    def setVERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE(value: GLenum): Self = this.set("VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawArraysInstancedANGLE(value: (GLenum, GLint, GLsizei, GLsizei) => Unit): Self = this.set("drawArraysInstancedANGLE", js.Any.fromFunction4(value))
    @scala.inline
    def setDrawElementsInstancedANGLE(value: (GLenum, GLsizei, GLenum, GLintptr, GLsizei) => Unit): Self = this.set("drawElementsInstancedANGLE", js.Any.fromFunction5(value))
    @scala.inline
    def setVertexAttribDivisorANGLE(value: (GLuint, GLuint) => Unit): Self = this.set("vertexAttribDivisorANGLE", js.Any.fromFunction2(value))
  }
  
}

