package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLegendElement extends js.Object {
  val form: HTMLFormElement | Null
}

object HTMLegendElement {
  @scala.inline
  def apply(): HTMLegendElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLegendElement]
  }
  @scala.inline
  implicit class HTMLegendElementOps[Self <: HTMLegendElement] (val x: Self) extends AnyVal {
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
    def setForm(value: HTMLFormElement): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormNull: Self = this.set("form", null)
  }
  
}

