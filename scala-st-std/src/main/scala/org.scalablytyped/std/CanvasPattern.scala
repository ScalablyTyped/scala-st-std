package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasPattern extends js.Object {
  def setTransform(matrix: SVGMatrix): Unit
}

object CanvasPattern {
  @scala.inline
  def apply(setTransform: SVGMatrix => Unit): CanvasPattern = {
    val __obj = js.Dynamic.literal(setTransform = js.Any.fromFunction1(setTransform))
    __obj.asInstanceOf[CanvasPattern]
  }
  @scala.inline
  implicit class CanvasPatternOps[Self <: CanvasPattern] (val x: Self) extends AnyVal {
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
    def setSetTransform(value: SVGMatrix => Unit): Self = this.set("setTransform", js.Any.fromFunction1(value))
  }
  
}

