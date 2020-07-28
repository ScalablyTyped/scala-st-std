package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedNodeMap extends /* index */ NumberDictionary[Attr] {
  var length: Double
  def getNamedItem(name: java.lang.String): Attr
  def getNamedItemNS(namespaceURI: java.lang.String, localName: java.lang.String): Attr
  def item(index: Double): Attr
  def removeNamedItem(name: java.lang.String): Attr
  def removeNamedItemNS(namespaceURI: java.lang.String, localName: java.lang.String): Attr
  def setNamedItem(arg: Attr): Attr
  def setNamedItemNS(arg: Attr): Attr
}

object NamedNodeMap {
  @scala.inline
  def apply(
    getNamedItem: java.lang.String => Attr,
    getNamedItemNS: (java.lang.String, java.lang.String) => Attr,
    item: Double => Attr,
    length: Double,
    removeNamedItem: java.lang.String => Attr,
    removeNamedItemNS: (java.lang.String, java.lang.String) => Attr,
    setNamedItem: Attr => Attr,
    setNamedItemNS: Attr => Attr
  ): NamedNodeMap = {
    val __obj = js.Dynamic.literal(getNamedItem = js.Any.fromFunction1(getNamedItem), getNamedItemNS = js.Any.fromFunction2(getNamedItemNS), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], removeNamedItem = js.Any.fromFunction1(removeNamedItem), removeNamedItemNS = js.Any.fromFunction2(removeNamedItemNS), setNamedItem = js.Any.fromFunction1(setNamedItem), setNamedItemNS = js.Any.fromFunction1(setNamedItemNS))
    __obj.asInstanceOf[NamedNodeMap]
  }
  @scala.inline
  implicit class NamedNodeMapOps[Self <: NamedNodeMap] (val x: Self) extends AnyVal {
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
    def setGetNamedItem(value: java.lang.String => Attr): Self = this.set("getNamedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setGetNamedItemNS(value: (java.lang.String, java.lang.String) => Attr): Self = this.set("getNamedItemNS", js.Any.fromFunction2(value))
    @scala.inline
    def setItem(value: Double => Attr): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveNamedItem(value: java.lang.String => Attr): Self = this.set("removeNamedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveNamedItemNS(value: (java.lang.String, java.lang.String) => Attr): Self = this.set("removeNamedItemNS", js.Any.fromFunction2(value))
    @scala.inline
    def setSetNamedItem(value: Attr => Attr): Self = this.set("setNamedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setSetNamedItemNS(value: Attr => Attr): Self = this.set("setNamedItemNS", js.Any.fromFunction1(value))
  }
  
}

