package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDataChannelEventMap extends js.Object {
  var bufferedamountlow: Event
  var close: Event
  var error: RTCErrorEvent
  var message: MessageEvent
  var open: Event
}

object RTCDataChannelEventMap {
  @scala.inline
  def apply(bufferedamountlow: Event, close: Event, error: RTCErrorEvent, message: MessageEvent, open: Event): RTCDataChannelEventMap = {
    val __obj = js.Dynamic.literal(bufferedamountlow = bufferedamountlow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEventMap]
  }
  @scala.inline
  implicit class RTCDataChannelEventMapOps[Self <: RTCDataChannelEventMap] (val x: Self) extends AnyVal {
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
    def setBufferedamountlow(value: Event): Self = this.set("bufferedamountlow", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: Event): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: RTCErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: MessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Event): Self = this.set("open", value.asInstanceOf[js.Any])
  }
  
}

