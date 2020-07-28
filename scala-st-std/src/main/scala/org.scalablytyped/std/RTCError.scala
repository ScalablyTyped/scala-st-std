package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCError extends Error {
  var errorDetail: java.lang.String
  var httpRequestStatusCode: Double
  var receivedAlert: Double | Null
  var sctpCauseCode: Double
  var sdpLineNumber: Double
  var sentAlert: Double | Null
}

object RTCError {
  @scala.inline
  def apply(
    errorDetail: java.lang.String,
    httpRequestStatusCode: Double,
    message: java.lang.String,
    name: java.lang.String,
    sctpCauseCode: Double,
    sdpLineNumber: Double
  ): RTCError = {
    val __obj = js.Dynamic.literal(errorDetail = errorDetail.asInstanceOf[js.Any], httpRequestStatusCode = httpRequestStatusCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sctpCauseCode = sctpCauseCode.asInstanceOf[js.Any], sdpLineNumber = sdpLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCError]
  }
  @scala.inline
  implicit class RTCErrorOps[Self <: RTCError] (val x: Self) extends AnyVal {
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
    def setErrorDetail(value: java.lang.String): Self = this.set("errorDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpRequestStatusCode(value: Double): Self = this.set("httpRequestStatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSctpCauseCode(value: Double): Self = this.set("sctpCauseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSdpLineNumber(value: Double): Self = this.set("sdpLineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceivedAlert(value: Double): Self = this.set("receivedAlert", value.asInstanceOf[js.Any])
    @scala.inline
    def setReceivedAlertNull: Self = this.set("receivedAlert", null)
    @scala.inline
    def setSentAlert(value: Double): Self = this.set("sentAlert", value.asInstanceOf[js.Any])
    @scala.inline
    def setSentAlertNull: Self = this.set("sentAlert", null)
  }
  
}

