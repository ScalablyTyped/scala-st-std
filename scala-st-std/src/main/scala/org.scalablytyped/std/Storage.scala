package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  /**
    * Returns the number of key/value pairs currently present in the list associated with the
    * object.
    */
  val length: Double
  /**
    * Empties the list associated with the object of all key/value pairs, if there are any.
    */
  def clear(): Unit
  /**
    * value = storage[key]
    */
  def getItem(key: java.lang.String): java.lang.String | Null
  /**
    * Returns the name of the nth key in the list, or null if n is greater
    * than or equal to the number of key/value pairs in the object.
    */
  def key(index: Double): java.lang.String | Null
  /**
    * delete storage[key]
    */
  def removeItem(key: java.lang.String): Unit
  /**
    * storage[key] = value
    */
  def setItem(key: java.lang.String, value: java.lang.String): Unit
}

object Storage {
  @scala.inline
  def apply(
    clear: () => Unit,
    getItem: java.lang.String => java.lang.String | Null,
    key: Double => java.lang.String | Null,
    length: Double,
    removeItem: java.lang.String => Unit,
    setItem: (java.lang.String, java.lang.String) => Unit
  ): Storage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[Storage]
  }
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItem(value: java.lang.String => java.lang.String | Null): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setKey(value: Double => java.lang.String | Null): Self = this.set("key", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveItem(value: java.lang.String => Unit): Self = this.set("removeItem", js.Any.fromFunction1(value))
    @scala.inline
    def setSetItem(value: (java.lang.String, java.lang.String) => Unit): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
  
}

