package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLCollectionOf[T /* <: Element */] extends /* n */ NumberDictionary[T] {
  def item(index: Double): T
  def namedItem(name: java.lang.String): T
}

object HTMLCollectionOf {
  @scala.inline
  def apply[/* <: `org.scalablytyped`.std.Element */ T](item: Double => T, namedItem: java.lang.String => T): HTMLCollectionOf[T] = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), namedItem = js.Any.fromFunction1(namedItem))
    __obj.asInstanceOf[HTMLCollectionOf[T]]
  }
  @scala.inline
  implicit class HTMLCollectionOfOps[Self <: HTMLCollectionOf[_], /* <: `org.scalablytyped`.std.Element */ T] (val x: Self with HTMLCollectionOf[T]) extends AnyVal {
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
    def setItem(value: Double => T): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setNamedItem(value: java.lang.String => T): Self = this.set("namedItem", js.Any.fromFunction1(value))
  }
  
}

