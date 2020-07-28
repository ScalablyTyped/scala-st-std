package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTransferItem extends js.Object {
  var kind: java.lang.String
  var `type`: java.lang.String
  def getAsFile(): File
  def getAsString(_callback: FunctionStringCallback): Unit
}

object DataTransferItem {
  @scala.inline
  def apply(
    getAsFile: () => File,
    getAsString: FunctionStringCallback => Unit,
    kind: java.lang.String,
    `type`: java.lang.String
  ): DataTransferItem = {
    val __obj = js.Dynamic.literal(getAsFile = js.Any.fromFunction0(getAsFile), getAsString = js.Any.fromFunction1(getAsString), kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransferItem]
  }
  @scala.inline
  implicit class DataTransferItemOps[Self <: DataTransferItem] (val x: Self) extends AnyVal {
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
    def setGetAsFile(value: () => File): Self = this.set("getAsFile", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAsString(value: FunctionStringCallback => Unit): Self = this.set("getAsString", js.Any.fromFunction1(value))
    @scala.inline
    def setKind(value: java.lang.String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

