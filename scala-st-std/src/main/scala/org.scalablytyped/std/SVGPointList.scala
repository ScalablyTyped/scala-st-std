package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPointList extends js.Object {
  val numberOfItems: Double
  def appendItem(newItem: SVGPoint): SVGPoint
  def clear(): Unit
  def getItem(index: Double): SVGPoint
  def initialize(newItem: SVGPoint): SVGPoint
  def insertItemBefore(newItem: SVGPoint, index: Double): SVGPoint
  def removeItem(index: Double): SVGPoint
  def replaceItem(newItem: SVGPoint, index: Double): SVGPoint
}

object SVGPointList {
  @scala.inline
  def apply(
    appendItem: SVGPoint => SVGPoint,
    clear: () => Unit,
    getItem: Double => SVGPoint,
    initialize: SVGPoint => SVGPoint,
    insertItemBefore: (SVGPoint, Double) => SVGPoint,
    numberOfItems: Double,
    removeItem: Double => SVGPoint,
    replaceItem: (SVGPoint, Double) => SVGPoint
  ): SVGPointList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[SVGPointList]
  }
  @scala.inline
  implicit class SVGPointListOps[Self <: SVGPointList] (val x: Self) extends AnyVal {
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
    def setAppendItem(value: SVGPoint => SVGPoint): Self = this.set("appendItem", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItem(value: Double => SVGPoint): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setInitialize(value: SVGPoint => SVGPoint): Self = this.set("initialize", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertItemBefore(value: (SVGPoint, Double) => SVGPoint): Self = this.set("insertItemBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setNumberOfItems(value: Double): Self = this.set("numberOfItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveItem(value: Double => SVGPoint): Self = this.set("removeItem", js.Any.fromFunction1(value))
    @scala.inline
    def setReplaceItem(value: (SVGPoint, Double) => SVGPoint): Self = this.set("replaceItem", js.Any.fromFunction2(value))
  }
  
}

