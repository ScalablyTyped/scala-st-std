package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorAutomationInformation extends js.Object {
  val webdriver: scala.Boolean
}

object NavigatorAutomationInformation {
  @scala.inline
  def apply(webdriver: scala.Boolean): NavigatorAutomationInformation = {
    val __obj = js.Dynamic.literal(webdriver = webdriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorAutomationInformation]
  }
  @scala.inline
  implicit class NavigatorAutomationInformationOps[Self <: NavigatorAutomationInformation] (val x: Self) extends AnyVal {
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
    def setWebdriver(value: scala.Boolean): Self = this.set("webdriver", value.asInstanceOf[js.Any])
  }
  
}

