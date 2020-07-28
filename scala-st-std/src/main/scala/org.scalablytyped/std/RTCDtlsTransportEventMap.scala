package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDtlsTransportEventMap extends js.Object {
  var dtlsstatechange: RTCDtlsTransportStateChangedEvent
  var error: Event
}

object RTCDtlsTransportEventMap {
  @scala.inline
  def apply(dtlsstatechange: RTCDtlsTransportStateChangedEvent, error: Event): RTCDtlsTransportEventMap = {
    val __obj = js.Dynamic.literal(dtlsstatechange = dtlsstatechange.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsTransportEventMap]
  }
  @scala.inline
  implicit class RTCDtlsTransportEventMapOps[Self <: RTCDtlsTransportEventMap] (val x: Self) extends AnyVal {
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
    def setDtlsstatechange(value: RTCDtlsTransportStateChangedEvent): Self = this.set("dtlsstatechange", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Event): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

