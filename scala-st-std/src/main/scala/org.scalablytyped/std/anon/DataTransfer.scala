package org.scalablytyped.std.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTransfer extends js.Object {
  var dataTransfer: js.UndefOr[org.scalablytyped.std.DataTransfer] = js.undefined
}

object DataTransfer {
  @scala.inline
  def apply(): DataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTransfer]
  }
  @scala.inline
  implicit class DataTransferOps[Self <: DataTransfer] (val x: Self) extends AnyVal {
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
    def setDataTransfer(value: org.scalablytyped.std.DataTransfer): Self = this.set("dataTransfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTransfer: Self = this.set("dataTransfer", js.undefined)
  }
  
}

