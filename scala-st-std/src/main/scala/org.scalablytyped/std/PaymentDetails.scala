package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentDetails extends js.Object {
  var displayItems: js.UndefOr[js.Array[PaymentItem]] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var modifiers: js.UndefOr[js.Array[PaymentDetailsModifier]] = js.undefined
  var shippingOptions: js.UndefOr[js.Array[PaymentShippingOption]] = js.undefined
  var total: js.UndefOr[PaymentItem] = js.undefined
}

object PaymentDetails {
  @scala.inline
  def apply(): PaymentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDetails]
  }
  @scala.inline
  implicit class PaymentDetailsOps[Self <: PaymentDetails] (val x: Self) extends AnyVal {
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
    def setDisplayItemsVarargs(value: PaymentItem*): Self = this.set("displayItems", js.Array(value :_*))
    @scala.inline
    def setDisplayItems(value: js.Array[PaymentItem]): Self = this.set("displayItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayItems: Self = this.set("displayItems", js.undefined)
    @scala.inline
    def setError(value: java.lang.String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setModifiersVarargs(value: PaymentDetailsModifier*): Self = this.set("modifiers", js.Array(value :_*))
    @scala.inline
    def setModifiers(value: js.Array[PaymentDetailsModifier]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    @scala.inline
    def setShippingOptionsVarargs(value: PaymentShippingOption*): Self = this.set("shippingOptions", js.Array(value :_*))
    @scala.inline
    def setShippingOptions(value: js.Array[PaymentShippingOption]): Self = this.set("shippingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingOptions: Self = this.set("shippingOptions", js.undefined)
    @scala.inline
    def setTotal(value: PaymentItem): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

