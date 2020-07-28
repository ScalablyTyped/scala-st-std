package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipboardEventInit extends EventInit {
  var clipboardData: js.UndefOr[DataTransfer | Null] = js.undefined
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
    def setClipboardData(value: DataTransfer): Self = this.set("clipboardData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipboardData: Self = this.set("clipboardData", js.undefined)
    @scala.inline
    def setClipboardDataNull: Self = this.set("clipboardData", null)
  }
  
}

