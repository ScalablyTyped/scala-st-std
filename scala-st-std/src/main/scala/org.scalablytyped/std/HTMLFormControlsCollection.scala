package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLFormControlsCollection extends HTMLCollectionBase {
  def namedItem(name: java.lang.String): HTMLCollection | Element | Null
}

object HTMLFormControlsCollection {
  @scala.inline
  def apply(
    item: Double => Element,
    length: Double,
    namedItem: java.lang.String => HTMLCollection | Element | Null
  ): HTMLFormControlsCollection = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], namedItem = js.Any.fromFunction1(namedItem))
    __obj.asInstanceOf[HTMLFormControlsCollection]
  }
  @scala.inline
  implicit class HTMLFormControlsCollectionOps[Self <: HTMLFormControlsCollection] (val x: Self) extends AnyVal {
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
    def setNamedItem(value: java.lang.String => HTMLCollection | Element | Null): Self = this.set("namedItem", js.Any.fromFunction1(value))
  }
  
}

