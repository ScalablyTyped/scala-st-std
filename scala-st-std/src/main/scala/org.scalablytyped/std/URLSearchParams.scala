package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLSearchParams extends js.Object {
  /**
    * Appends a specified key/value pair as a new search parameter.
    */
  def append(name: java.lang.String, value: java.lang.String): Unit
  /**
    * Deletes the given search parameter, and its associated value, from the list of all search parameters.
    */
  def delete(name: java.lang.String): Unit
  /**
    * Returns the first value associated to the given search parameter.
    */
  def get(name: java.lang.String): java.lang.String | Null
  /**
    * Returns all the values association with a given search parameter.
    */
  def getAll(name: java.lang.String): js.Array[java.lang.String]
  /**
    * Returns a Boolean indicating if such a search parameter exists.
    */
  def has(name: java.lang.String): scala.Boolean
  /**
    * Sets the value associated to a given search parameter to the given value. If there were several values, delete the others.
    */
  def set(name: java.lang.String, value: java.lang.String): Unit
}

object URLSearchParams {
  @scala.inline
  def apply(
    append: (java.lang.String, java.lang.String) => Unit,
    delete: java.lang.String => Unit,
    get: java.lang.String => java.lang.String | Null,
    getAll: java.lang.String => js.Array[java.lang.String],
    has: java.lang.String => scala.Boolean,
    set: (java.lang.String, java.lang.String) => Unit
  ): URLSearchParams = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction1(getAll), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[URLSearchParams]
  }
  @scala.inline
  implicit class URLSearchParamsOps[Self <: URLSearchParams] (val x: Self) extends AnyVal {
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
    def setAppend(value: (java.lang.String, java.lang.String) => Unit): Self = this.set("append", js.Any.fromFunction2(value))
    @scala.inline
    def setDelete(value: java.lang.String => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: java.lang.String => java.lang.String | Null): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAll(value: java.lang.String => js.Array[java.lang.String]): Self = this.set("getAll", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: java.lang.String => scala.Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (java.lang.String, java.lang.String) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

