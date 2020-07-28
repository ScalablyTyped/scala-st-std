package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodData extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var supportedMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PaymentMethodData {
  @scala.inline
  def apply(): PaymentMethodData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentMethodData]
  }
  @scala.inline
  implicit class PaymentMethodDataOps[Self <: PaymentMethodData] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setSupportedMethodsVarargs(value: java.lang.String*): Self = this.set("supportedMethods", js.Array(value :_*))
    @scala.inline
    def setSupportedMethods(value: js.Array[java.lang.String]): Self = this.set("supportedMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedMethods: Self = this.set("supportedMethods", js.undefined)
  }
  
}

