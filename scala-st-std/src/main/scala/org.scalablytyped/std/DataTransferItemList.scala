package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTransferItemList extends /* index */ NumberDictionary[DataTransferItem] {
  val length: Double
  def add(data: File): DataTransferItem | Null
  def clear(): Unit
  def item(index: Double): DataTransferItem
  def remove(index: Double): Unit
}

object DataTransferItemList {
  @scala.inline
  def apply(
    add: File => DataTransferItem | Null,
    clear: () => Unit,
    item: Double => DataTransferItem,
    length: Double,
    remove: Double => Unit
  ): DataTransferItemList = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[DataTransferItemList]
  }
  @scala.inline
  implicit class DataTransferItemListOps[Self <: DataTransferItemList] (val x: Self) extends AnyVal {
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
    def setAdd(value: File => DataTransferItem | Null): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setItem(value: Double => DataTransferItem): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

