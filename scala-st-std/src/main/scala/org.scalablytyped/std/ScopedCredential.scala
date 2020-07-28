package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredential extends js.Object {
  val id: ArrayBuffer
  val `type`: ScopedCredentialType
}

object ScopedCredential {
  @scala.inline
  def apply(id: ArrayBuffer, `type`: ScopedCredentialType): ScopedCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredential]
  }
  @scala.inline
  implicit class ScopedCredentialOps[Self <: ScopedCredential] (val x: Self) extends AnyVal {
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
    def setId(value: ArrayBuffer): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ScopedCredentialType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

