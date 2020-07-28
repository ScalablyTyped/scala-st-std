package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSubscriptionChangeInit extends EventInit {
  var newSubscription: js.UndefOr[PushSubscription] = js.undefined
  var oldSubscription: js.UndefOr[PushSubscription] = js.undefined
}

object PushSubscriptionChangeInit {
  @scala.inline
  def apply(): PushSubscriptionChangeInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSubscriptionChangeInit]
  }
  @scala.inline
  implicit class PushSubscriptionChangeInitOps[Self <: PushSubscriptionChangeInit] (val x: Self) extends AnyVal {
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
    def setNewSubscription(value: PushSubscription): Self = this.set("newSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewSubscription: Self = this.set("newSubscription", js.undefined)
    @scala.inline
    def setOldSubscription(value: PushSubscription): Self = this.set("oldSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldSubscription: Self = this.set("oldSubscription", js.undefined)
  }
  
}

