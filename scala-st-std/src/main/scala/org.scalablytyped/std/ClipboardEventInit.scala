package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipboardEventInit extends EventInit {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var dataType: js.UndefOr[java.lang.String] = js.undefined
}

object ClipboardEventInit {
  @scala.inline
  def apply(): ClipboardEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipboardEventInit]
  }
  @scala.inline
  implicit class ClipboardEventInitOps[Self <: ClipboardEventInit] (val x: Self) extends AnyVal {
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
    def setData(value: java.lang.String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataType(value: java.lang.String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
  }
  
}

