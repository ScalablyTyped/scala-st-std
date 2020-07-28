package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentNode extends js.Object {
  val childElementCount: Double
  val children: HTMLCollection
  val firstElementChild: Element | Null
  val lastElementChild: Element | Null
}

object ParentNode {
  @scala.inline
  def apply(childElementCount: Double, children: HTMLCollection): ParentNode = {
    val __obj = js.Dynamic.literal(childElementCount = childElementCount.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentNode]
  }
  @scala.inline
  implicit class ParentNodeOps[Self <: ParentNode] (val x: Self) extends AnyVal {
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
    def setChildren(value: HTMLCollection): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstElementChild(value: Element): Self = this.set("firstElementChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstElementChildNull: Self = this.set("firstElementChild", null)
    @scala.inline
    def setLastElementChild(value: Element): Self = this.set("lastElementChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastElementChildNull: Self = this.set("lastElementChild", null)
  }
  
}

