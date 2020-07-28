package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandEventInit extends EventInit {
  var commandName: js.UndefOr[java.lang.String] = js.undefined
  var detail: js.UndefOr[java.lang.String] = js.undefined
}

object CommandEventInit {
  @scala.inline
  def apply(): CommandEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandEventInit]
  }
  @scala.inline
  implicit class CommandEventInitOps[Self <: CommandEventInit] (val x: Self) extends AnyVal {
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
    def setCommandName(value: java.lang.String): Self = this.set("commandName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandName: Self = this.set("commandName", js.undefined)
    @scala.inline
    def setDetail(value: java.lang.String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
  }
  
}

