package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLCollection extends /* index */ NumberDictionary[Element] {
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  val length: Double
  /**
    * Retrieves an object from various collections.
    */
  def item(index: Double): Element
  /**
    * Retrieves a select object or an object from an options collection.
    */
  def namedItem(name: java.lang.String): Element
}

object HTMLCollection {
  @scala.inline
  def apply(item: Double => Element, length: Double, namedItem: java.lang.String => Element): HTMLCollection = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], namedItem = js.Any.fromFunction1(namedItem))
    __obj.asInstanceOf[HTMLCollection]
  }
  @scala.inline
  implicit class HTMLCollectionOps[Self <: HTMLCollection] (val x: Self) extends AnyVal {
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
    def setItem(value: Double => Element): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamedItem(value: java.lang.String => Element): Self = this.set("namedItem", js.Any.fromFunction1(value))
  }
  
}

