package org.scalablytyped.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalDescriptor extends js.Object {
  var mutable: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object GlobalDescriptor {
  @scala.inline
  def apply(value: String): GlobalDescriptor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalDescriptor]
  }
  @scala.inline
  implicit class GlobalDescriptorOps[Self <: GlobalDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutable(value: Boolean): Self = this.set("mutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutable: Self = this.set("mutable", js.undefined)
  }
  
}

