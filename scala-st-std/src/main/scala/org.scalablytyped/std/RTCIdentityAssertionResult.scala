package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIdentityAssertionResult extends js.Object {
  var assertion: java.lang.String
  var idp: RTCIdentityProviderDetails
}

object RTCIdentityAssertionResult {
  @scala.inline
  def apply(assertion: java.lang.String, idp: RTCIdentityProviderDetails): RTCIdentityAssertionResult = {
    val __obj = js.Dynamic.literal(assertion = assertion.asInstanceOf[js.Any], idp = idp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIdentityAssertionResult]
  }
  @scala.inline
  implicit class RTCIdentityAssertionResultOps[Self <: RTCIdentityAssertionResult] (val x: Self) extends AnyVal {
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
    def setAssertion(value: java.lang.String): Self = this.set("assertion", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdp(value: RTCIdentityProviderDetails): Self = this.set("idp", value.asInstanceOf[js.Any])
  }
  
}

