package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  def append(name: java.lang.String, value: java.lang.String): Unit
  def delete(name: java.lang.String): Unit
  def forEach(callback: ForEachCallback): Unit
  def get(name: java.lang.String): java.lang.String | Null
  def has(name: java.lang.String): scala.Boolean
  def set(name: java.lang.String, value: java.lang.String): Unit
}

object Headers {
  @scala.inline
  def apply(
    append: (java.lang.String, java.lang.String) => Unit,
    delete: java.lang.String => Unit,
    forEach: ForEachCallback => Unit,
    get: java.lang.String => java.lang.String | Null,
    has: java.lang.String => scala.Boolean,
    set: (java.lang.String, java.lang.String) => Unit
  ): Headers = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), delete = js.Any.fromFunction1(delete), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
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
    def setForEach(value: ForEachCallback => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: java.lang.String => java.lang.String | Null): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: java.lang.String => scala.Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (java.lang.String, java.lang.String) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

