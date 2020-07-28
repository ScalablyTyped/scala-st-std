package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSAccountInfo extends js.Object {
  var accountImageUri: js.UndefOr[java.lang.String] = js.undefined
  var accountName: js.UndefOr[java.lang.String] = js.undefined
  var rpDisplayName: js.UndefOr[java.lang.String] = js.undefined
  var userDisplayName: js.UndefOr[java.lang.String] = js.undefined
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object MSAccountInfo {
  @scala.inline
  def apply(): MSAccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSAccountInfo]
  }
  @scala.inline
  implicit class MSAccountInfoOps[Self <: MSAccountInfo] (val x: Self) extends AnyVal {
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
    def setAccountImageUri(value: java.lang.String): Self = this.set("accountImageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountImageUri: Self = this.set("accountImageUri", js.undefined)
    @scala.inline
    def setAccountName(value: java.lang.String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    @scala.inline
    def setRpDisplayName(value: java.lang.String): Self = this.set("rpDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRpDisplayName: Self = this.set("rpDisplayName", js.undefined)
    @scala.inline
    def setUserDisplayName(value: java.lang.String): Self = this.set("userDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDisplayName: Self = this.set("userDisplayName", js.undefined)
    @scala.inline
    def setUserId(value: java.lang.String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

