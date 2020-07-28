package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MimeTypeArray extends /* index */ NumberDictionary[Plugin] {
  val length: Double
  def item(index: Double): Plugin
  def namedItem(`type`: java.lang.String): Plugin
}

object MimeTypeArray {
  @scala.inline
  def apply(item: Double => Plugin, length: Double, namedItem: java.lang.String => Plugin): MimeTypeArray = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], namedItem = js.Any.fromFunction1(namedItem))
    __obj.asInstanceOf[MimeTypeArray]
  }
  @scala.inline
  implicit class MimeTypeArrayOps[Self <: MimeTypeArray] (val x: Self) extends AnyVal {
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
    def setItem(value: Double => Plugin): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamedItem(value: java.lang.String => Plugin): Self = this.set("namedItem", js.Any.fromFunction1(value))
  }
  
}

