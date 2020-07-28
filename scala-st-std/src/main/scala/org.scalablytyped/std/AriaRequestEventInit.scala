package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AriaRequestEventInit extends EventInit {
  var attributeName: js.UndefOr[java.lang.String] = js.undefined
  var attributeValue: js.UndefOr[java.lang.String] = js.undefined
}

object AriaRequestEventInit {
  @scala.inline
  def apply(): AriaRequestEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaRequestEventInit]
  }
  @scala.inline
  implicit class AriaRequestEventInitOps[Self <: AriaRequestEventInit] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: java.lang.String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    @scala.inline
    def setAttributeValue(value: java.lang.String): Self = this.set("attributeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeValue: Self = this.set("attributeValue", js.undefined)
  }
  
}

