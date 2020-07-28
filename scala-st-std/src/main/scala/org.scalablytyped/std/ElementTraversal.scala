package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementTraversal extends js.Object {
  val childElementCount: Double
  val firstElementChild: Element | Null
  val lastElementChild: Element | Null
  val nextElementSibling: Element | Null
  val previousElementSibling: Element | Null
}

object ElementTraversal {
  @scala.inline
  def apply(childElementCount: Double): ElementTraversal = {
    val __obj = js.Dynamic.literal(childElementCount = childElementCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementTraversal]
  }
  @scala.inline
  implicit class ElementTraversalOps[Self <: ElementTraversal] (val x: Self) extends AnyVal {
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
    def setChildElementCount(value: Double): Self = this.set("childElementCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstElementChild(value: Element): Self = this.set("firstElementChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstElementChildNull: Self = this.set("firstElementChild", null)
    @scala.inline
    def setLastElementChild(value: Element): Self = this.set("lastElementChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastElementChildNull: Self = this.set("lastElementChild", null)
    @scala.inline
    def setNextElementSibling(value: Element): Self = this.set("nextElementSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextElementSiblingNull: Self = this.set("nextElementSibling", null)
    @scala.inline
    def setPreviousElementSibling(value: Element): Self = this.set("previousElementSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousElementSiblingNull: Self = this.set("previousElementSibling", null)
  }
  
}

