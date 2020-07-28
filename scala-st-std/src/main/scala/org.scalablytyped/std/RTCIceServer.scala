package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceServer extends js.Object {
  var credential: js.UndefOr[java.lang.String | Null] = js.undefined
  var urls: js.UndefOr[js.Any] = js.undefined
  var username: js.UndefOr[java.lang.String | Null] = js.undefined
}

object RTCIceServer {
  @scala.inline
  def apply(): RTCIceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceServer]
  }
  @scala.inline
  implicit class RTCIceServerOps[Self <: RTCIceServer] (val x: Self) extends AnyVal {
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
    def setCredential(value: java.lang.String): Self = this.set("credential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredential: Self = this.set("credential", js.undefined)
    @scala.inline
    def setCredentialNull: Self = this.set("credential", null)
    @scala.inline
    def setUrls(value: js.Any): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
    @scala.inline
    def setUsername(value: java.lang.String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    @scala.inline
    def setUsernameNull: Self = this.set("username", null)
  }
  
}

