package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSSignatureParameters extends js.Object {
  var userPrompt: js.UndefOr[java.lang.String] = js.undefined
}

object MSSignatureParameters {
  @scala.inline
  def apply(): MSSignatureParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSSignatureParameters]
  }
  @scala.inline
  implicit class MSSignatureParametersOps[Self <: MSSignatureParameters] (val x: Self) extends AnyVal {
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
    def setUserPrompt(value: java.lang.String): Self = this.set("userPrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPrompt: Self = this.set("userPrompt", js.undefined)
  }
  
}

