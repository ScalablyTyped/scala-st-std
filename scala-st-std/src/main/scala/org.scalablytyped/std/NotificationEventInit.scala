package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventInit extends EventInit {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var notification: Notification
}

object NotificationEventInit {
  @scala.inline
  def apply(notification: Notification): NotificationEventInit = {
    val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventInit]
  }
  @scala.inline
  implicit class NotificationEventInitOps[Self <: NotificationEventInit] (val x: Self) extends AnyVal {
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
    def setNotification(value: Notification): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: java.lang.String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
  }
  
}

