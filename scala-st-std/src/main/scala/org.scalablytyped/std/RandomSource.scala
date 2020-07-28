package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomSource extends js.Object {
  def getRandomValues(array: ArrayBufferView): ArrayBufferView
}

object RandomSource {
  @scala.inline
  def apply(getRandomValues: ArrayBufferView => ArrayBufferView): RandomSource = {
    val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues))
    __obj.asInstanceOf[RandomSource]
  }
  @scala.inline
  implicit class RandomSourceOps[Self <: RandomSource] (val x: Self) extends AnyVal {
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
    def setGetRandomValues(value: ArrayBufferView => ArrayBufferView): Self = this.set("getRandomValues", js.Any.fromFunction1(value))
  }
  
}

