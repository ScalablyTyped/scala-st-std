package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpHeaderExtensionParameters extends js.Object {
  var encrypt: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object RTCRtpHeaderExtensionParameters {
  @scala.inline
  def apply(): RTCRtpHeaderExtensionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpHeaderExtensionParameters]
  }
  @scala.inline
  implicit class RTCRtpHeaderExtensionParametersOps[Self <: RTCRtpHeaderExtensionParameters] (val x: Self) extends AnyVal {
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
    def setEncrypt(value: scala.Boolean): Self = this.set("encrypt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypt: Self = this.set("encrypt", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setUri(value: java.lang.String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

