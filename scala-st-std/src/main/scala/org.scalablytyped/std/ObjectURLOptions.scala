package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectURLOptions extends js.Object {
  var oneTimeOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object ObjectURLOptions {
  @scala.inline
  def apply(): ObjectURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectURLOptions]
  }
  @scala.inline
  implicit class ObjectURLOptionsOps[Self <: ObjectURLOptions] (val x: Self) extends AnyVal {
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
    def setOneTimeOnly(value: scala.Boolean): Self = this.set("oneTimeOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneTimeOnly: Self = this.set("oneTimeOnly", js.undefined)
  }
  
}

