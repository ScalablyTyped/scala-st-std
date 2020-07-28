package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGNumberList extends js.Object {
  var numberOfItems: Double
  def appendItem(newItem: SVGNumber): SVGNumber
  def clear(): Unit
  def getItem(index: Double): SVGNumber
  def initialize(newItem: SVGNumber): SVGNumber
  def insertItemBefore(newItem: SVGNumber, index: Double): SVGNumber
  def removeItem(index: Double): SVGNumber
  def replaceItem(newItem: SVGNumber, index: Double): SVGNumber
}

object SVGNumberList {
  @scala.inline
  def apply(
    appendItem: SVGNumber => SVGNumber,
    clear: () => Unit,
    getItem: Double => SVGNumber,
    initialize: SVGNumber => SVGNumber,
    insertItemBefore: (SVGNumber, Double) => SVGNumber,
    numberOfItems: Double,
    removeItem: Double => SVGNumber,
    replaceItem: (SVGNumber, Double) => SVGNumber
  ): SVGNumberList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[SVGNumberList]
  }
  @scala.inline
  implicit class SVGNumberListOps[Self <: SVGNumberList] (val x: Self) extends AnyVal {
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
    def setAppendItem(value: SVGNumber => SVGNumber): Self = this.set("appendItem", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItem(value: Double => SVGNumber): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setInitialize(value: SVGNumber => SVGNumber): Self = this.set("initialize", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertItemBefore(value: (SVGNumber, Double) => SVGNumber): Self = this.set("insertItemBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setNumberOfItems(value: Double): Self = this.set("numberOfItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveItem(value: Double => SVGNumber): Self = this.set("removeItem", js.Any.fromFunction1(value))
    @scala.inline
    def setReplaceItem(value: (SVGNumber, Double) => SVGNumber): Self = this.set("replaceItem", js.Any.fromFunction2(value))
  }
  
}

