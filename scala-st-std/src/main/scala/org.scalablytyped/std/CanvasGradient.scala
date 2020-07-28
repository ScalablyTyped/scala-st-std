package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasGradient extends js.Object {
  def addColorStop(offset: Double, color: java.lang.String): Unit
}

object CanvasGradient {
  @scala.inline
  def apply(addColorStop: (Double, java.lang.String) => Unit): CanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.asInstanceOf[CanvasGradient]
  }
  @scala.inline
  implicit class CanvasGradientOps[Self <: CanvasGradient] (val x: Self) extends AnyVal {
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
    def setAddColorStop(value: (Double, java.lang.String) => Unit): Self = this.set("addColorStop", js.Any.fromFunction2(value))
  }
  
}

