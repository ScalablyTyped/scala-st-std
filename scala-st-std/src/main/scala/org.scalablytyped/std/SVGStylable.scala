package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGStylable extends js.Object {
  var className: js.Any
  val style: CSSStyleDeclaration
}

object SVGStylable {
  @scala.inline
  def apply(className: js.Any, style: CSSStyleDeclaration): SVGStylable = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGStylable]
  }
  @scala.inline
  implicit class SVGStylableOps[Self <: SVGStylable] (val x: Self) extends AnyVal {
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
    def setClassName(value: js.Any): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSStyleDeclaration): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

