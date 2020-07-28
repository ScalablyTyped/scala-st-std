package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OESVertexArrayObject extends js.Object {
  val VERTEX_ARRAY_BINDING_OES: Double
  def bindVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit
  def createVertexArrayOES(): WebGLVertexArrayObjectOES
  def deleteVertexArrayOES(arrayObject: WebGLVertexArrayObjectOES): Unit
  def isVertexArrayOES(value: js.Any): /* is std.WebGLVertexArrayObjectOES */ scala.Boolean
}

object OESVertexArrayObject {
  @scala.inline
  def apply(
    VERTEX_ARRAY_BINDING_OES: Double,
    bindVertexArrayOES: WebGLVertexArrayObjectOES => Unit,
    createVertexArrayOES: () => WebGLVertexArrayObjectOES,
    deleteVertexArrayOES: WebGLVertexArrayObjectOES => Unit,
    isVertexArrayOES: js.Any => /* is std.WebGLVertexArrayObjectOES */ scala.Boolean
  ): OESVertexArrayObject = {
    val __obj = js.Dynamic.literal(VERTEX_ARRAY_BINDING_OES = VERTEX_ARRAY_BINDING_OES.asInstanceOf[js.Any], bindVertexArrayOES = js.Any.fromFunction1(bindVertexArrayOES), createVertexArrayOES = js.Any.fromFunction0(createVertexArrayOES), deleteVertexArrayOES = js.Any.fromFunction1(deleteVertexArrayOES), isVertexArrayOES = js.Any.fromFunction1(isVertexArrayOES))
    __obj.asInstanceOf[OESVertexArrayObject]
  }
  @scala.inline
  implicit class OESVertexArrayObjectOps[Self <: OESVertexArrayObject] (val x: Self) extends AnyVal {
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
    def setVERTEX_ARRAY_BINDING_OES(value: Double): Self = this.set("VERTEX_ARRAY_BINDING_OES", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindVertexArrayOES(value: WebGLVertexArrayObjectOES => Unit): Self = this.set("bindVertexArrayOES", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateVertexArrayOES(value: () => WebGLVertexArrayObjectOES): Self = this.set("createVertexArrayOES", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteVertexArrayOES(value: WebGLVertexArrayObjectOES => Unit): Self = this.set("deleteVertexArrayOES", js.Any.fromFunction1(value))
    @scala.inline
    def setIsVertexArrayOES(value: js.Any => /* is std.WebGLVertexArrayObjectOES */ scala.Boolean): Self = this.set("isVertexArrayOES", js.Any.fromFunction1(value))
  }
  
}

