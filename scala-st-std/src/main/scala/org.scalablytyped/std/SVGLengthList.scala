package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGLengthList extends js.Object {
  val numberOfItems: Double
  def appendItem(newItem: SVGLength): SVGLength
  def clear(): Unit
  def getItem(index: Double): SVGLength
  def initialize(newItem: SVGLength): SVGLength
  def insertItemBefore(newItem: SVGLength, index: Double): SVGLength
  def removeItem(index: Double): SVGLength
  def replaceItem(newItem: SVGLength, index: Double): SVGLength
}

object SVGLengthList {
  @scala.inline
  def apply(
    appendItem: SVGLength => SVGLength,
    clear: () => Unit,
    getItem: Double => SVGLength,
    initialize: SVGLength => SVGLength,
    insertItemBefore: (SVGLength, Double) => SVGLength,
    numberOfItems: Double,
    removeItem: Double => SVGLength,
    replaceItem: (SVGLength, Double) => SVGLength
  ): SVGLengthList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[SVGLengthList]
  }
  @scala.inline
  implicit class SVGLengthListOps[Self <: SVGLengthList] (val x: Self) extends AnyVal {
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
    def setAppendItem(value: SVGLength => SVGLength): Self = this.set("appendItem", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItem(value: Double => SVGLength): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setInitialize(value: SVGLength => SVGLength): Self = this.set("initialize", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertItemBefore(value: (SVGLength, Double) => SVGLength): Self = this.set("insertItemBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setNumberOfItems(value: Double): Self = this.set("numberOfItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveItem(value: Double => SVGLength): Self = this.set("removeItem", js.Any.fromFunction1(value))
    @scala.inline
    def setReplaceItem(value: (SVGLength, Double) => SVGLength): Self = this.set("replaceItem", js.Any.fromFunction2(value))
  }
  
}

