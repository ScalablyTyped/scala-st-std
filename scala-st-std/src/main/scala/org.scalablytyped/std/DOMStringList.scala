package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMStringList
  extends /* index */ NumberDictionary[java.lang.String] {
  val length: Double
  def contains(str: java.lang.String): scala.Boolean
  def item(index: Double): java.lang.String | Null
}

object DOMStringList {
  @scala.inline
  def apply(
    contains: java.lang.String => scala.Boolean,
    item: Double => java.lang.String | Null,
    length: Double
  ): DOMStringList = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMStringList]
  }
  @scala.inline
  implicit class DOMStringListOps[Self <: DOMStringList] (val x: Self) extends AnyVal {
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
    def setContains(value: java.lang.String => scala.Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: Double => java.lang.String | Null): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

