package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeSelector extends js.Object {
  def querySelector(selectors: java.lang.String): Element
  def querySelectorAll(selectors: java.lang.String): NodeListOf[Element]
}

object NodeSelector {
  @scala.inline
  def apply(
    querySelector: java.lang.String => Element,
    querySelectorAll: java.lang.String => NodeListOf[Element]
  ): NodeSelector = {
    val __obj = js.Dynamic.literal(querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll))
    __obj.asInstanceOf[NodeSelector]
  }
  @scala.inline
  implicit class NodeSelectorOps[Self <: NodeSelector] (val x: Self) extends AnyVal {
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
    def setQuerySelector(value: java.lang.String => Element): Self = this.set("querySelector", js.Any.fromFunction1(value))
    @scala.inline
    def setQuerySelectorAll(value: java.lang.String => NodeListOf[Element]): Self = this.set("querySelectorAll", js.Any.fromFunction1(value))
  }
  
}

