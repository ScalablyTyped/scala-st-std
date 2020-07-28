package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredentialDescriptor extends js.Object {
  var id: js.UndefOr[js.Any] = js.undefined
  var transports: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ScopedCredentialDescriptor {
  @scala.inline
  def apply(): ScopedCredentialDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopedCredentialDescriptor]
  }
  @scala.inline
  implicit class ScopedCredentialDescriptorOps[Self <: ScopedCredentialDescriptor] (val x: Self) extends AnyVal {
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
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setTransportsVarargs(value: java.lang.String*): Self = this.set("transports", js.Array(value :_*))
    @scala.inline
    def setTransports(value: js.Array[java.lang.String]): Self = this.set("transports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

