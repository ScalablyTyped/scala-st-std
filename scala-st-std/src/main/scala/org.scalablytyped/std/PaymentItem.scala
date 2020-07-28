package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentItem extends js.Object {
  var amount: js.UndefOr[PaymentCurrencyAmount] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var pending: js.UndefOr[scala.Boolean] = js.undefined
}

object PaymentItem {
  @scala.inline
  def apply(): PaymentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentItem]
  }
  @scala.inline
  implicit class PaymentItemOps[Self <: PaymentItem] (val x: Self) extends AnyVal {
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
    def setAmount(value: PaymentCurrencyAmount): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setLabel(value: java.lang.String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setPending(value: scala.Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
  }
  
}

