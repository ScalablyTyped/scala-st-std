package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientData extends js.Object {
  var challenge: js.UndefOr[java.lang.String] = js.undefined
  var extensions: js.UndefOr[WebAuthnExtensions] = js.undefined
  var hashAlg: js.UndefOr[java.lang.String | Algorithm] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  var tokenBinding: js.UndefOr[java.lang.String] = js.undefined
}

object ClientData {
  @scala.inline
  def apply(): ClientData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientData]
  }
  @scala.inline
  implicit class ClientDataOps[Self <: ClientData] (val x: Self) extends AnyVal {
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
    def setChallenge(value: java.lang.String): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChallenge: Self = this.set("challenge", js.undefined)
    @scala.inline
    def setExtensions(value: WebAuthnExtensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setHashAlg(value: java.lang.String | Algorithm): Self = this.set("hashAlg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashAlg: Self = this.set("hashAlg", js.undefined)
    @scala.inline
    def setOrigin(value: java.lang.String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setRpId(value: java.lang.String): Self = this.set("rpId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRpId: Self = this.set("rpId", js.undefined)
    @scala.inline
    def setTokenBinding(value: java.lang.String): Self = this.set("tokenBinding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenBinding: Self = this.set("tokenBinding", js.undefined)
  }
  
}

