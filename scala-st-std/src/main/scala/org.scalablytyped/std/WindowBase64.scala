package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowBase64 extends js.Object {
  def atob(encodedString: java.lang.String): java.lang.String
  def btoa(rawString: java.lang.String): java.lang.String
}

object WindowBase64 {
  @scala.inline
  def apply(atob: java.lang.String => java.lang.String, btoa: java.lang.String => java.lang.String): WindowBase64 = {
    val __obj = js.Dynamic.literal(atob = js.Any.fromFunction1(atob), btoa = js.Any.fromFunction1(btoa))
    __obj.asInstanceOf[WindowBase64]
  }
  @scala.inline
  implicit class WindowBase64Ops[Self <: WindowBase64] (val x: Self) extends AnyVal {
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
    def setAtob(value: java.lang.String => java.lang.String): Self = this.set("atob", js.Any.fromFunction1(value))
    @scala.inline
    def setBtoa(value: java.lang.String => java.lang.String): Self = this.set("btoa", js.Any.fromFunction1(value))
  }
  
}

