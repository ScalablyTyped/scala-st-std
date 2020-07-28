package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGStringList extends js.Object {
  val numberOfItems: Double
  def appendItem(newItem: java.lang.String): java.lang.String
  def clear(): Unit
  def getItem(index: Double): java.lang.String
  def initialize(newItem: java.lang.String): java.lang.String
  def insertItemBefore(newItem: java.lang.String, index: Double): java.lang.String
  def removeItem(index: Double): java.lang.String
  def replaceItem(newItem: java.lang.String, index: Double): java.lang.String
}

object SVGStringList {
  @scala.inline
  def apply(
    appendItem: java.lang.String => java.lang.String,
    clear: () => Unit,
    getItem: Double => java.lang.String,
    initialize: java.lang.String => java.lang.String,
    insertItemBefore: (java.lang.String, Double) => java.lang.String,
    numberOfItems: Double,
    removeItem: Double => java.lang.String,
    replaceItem: (java.lang.String, Double) => java.lang.String
  ): SVGStringList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[SVGStringList]
  }
  @scala.inline
  implicit class SVGStringListOps[Self <: SVGStringList] (val x: Self) extends AnyVal {
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
    def setAppendItem(value: java.lang.String => java.lang.String): Self = this.set("appendItem", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItem(value: Double => java.lang.String): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setInitialize(value: java.lang.String => java.lang.String): Self = this.set("initialize", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertItemBefore(value: (java.lang.String, Double) => java.lang.String): Self = this.set("insertItemBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setNumberOfItems(value: Double): Self = this.set("numberOfItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveItem(value: Double => java.lang.String): Self = this.set("removeItem", js.Any.fromFunction1(value))
    @scala.inline
    def setReplaceItem(value: (java.lang.String, Double) => java.lang.String): Self = this.set("replaceItem", js.Any.fromFunction2(value))
  }
  
}

