package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIdentityValidationResult extends js.Object {
  var contents: java.lang.String
  var identity: java.lang.String
}

object RTCIdentityValidationResult {
  @scala.inline
  def apply(contents: java.lang.String, identity: java.lang.String): RTCIdentityValidationResult = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIdentityValidationResult]
  }
  @scala.inline
  implicit class RTCIdentityValidationResultOps[Self <: RTCIdentityValidationResult] (val x: Self) extends AnyVal {
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
    def setContents(value: java.lang.String): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: java.lang.String): Self = this.set("identity", value.asInstanceOf[js.Any])
  }
  
}

