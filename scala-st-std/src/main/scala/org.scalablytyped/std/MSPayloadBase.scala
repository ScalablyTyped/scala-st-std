package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSPayloadBase extends RTCStats {
  var payloadDescription: js.UndefOr[java.lang.String] = js.undefined
}

object MSPayloadBase {
  @scala.inline
  def apply(): MSPayloadBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSPayloadBase]
  }
  @scala.inline
  implicit class MSPayloadBaseOps[Self <: MSPayloadBase] (val x: Self) extends AnyVal {
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
    def setPayloadDescription(value: java.lang.String): Self = this.set("payloadDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloadDescription: Self = this.set("payloadDescription", js.undefined)
  }
  
}

