package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastChannelEventMap extends js.Object {
  var message: MessageEvent
  var messageerror: MessageEvent
}

object BroadcastChannelEventMap {
  @scala.inline
  def apply(message: MessageEvent, messageerror: MessageEvent): BroadcastChannelEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastChannelEventMap]
  }
  @scala.inline
  implicit class BroadcastChannelEventMapOps[Self <: BroadcastChannelEventMap] (val x: Self) extends AnyVal {
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
    def setMessage(value: MessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageerror(value: MessageEvent): Self = this.set("messageerror", value.asInstanceOf[js.Any])
  }
  
}

