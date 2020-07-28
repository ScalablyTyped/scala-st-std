package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSFIDOCredentialParameters extends MSCredentialParameters {
  var algorithm: js.UndefOr[java.lang.String | Algorithm] = js.undefined
  var authenticators: js.UndefOr[js.Array[AAGUID]] = js.undefined
}

object MSFIDOCredentialParameters {
  @scala.inline
  def apply(): MSFIDOCredentialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSFIDOCredentialParameters]
  }
  @scala.inline
  implicit class MSFIDOCredentialParametersOps[Self <: MSFIDOCredentialParameters] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: java.lang.String | Algorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setAuthenticatorsVarargs(value: AAGUID*): Self = this.set("authenticators", js.Array(value :_*))
    @scala.inline
    def setAuthenticators(value: js.Array[AAGUID]): Self = this.set("authenticators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticators: Self = this.set("authenticators", js.undefined)
  }
  
}

