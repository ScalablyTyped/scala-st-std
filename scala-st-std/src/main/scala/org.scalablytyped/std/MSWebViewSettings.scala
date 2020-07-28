package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSWebViewSettings extends js.Object {
  var isIndexedDBEnabled: scala.Boolean
  var isJavaScriptEnabled: scala.Boolean
}

object MSWebViewSettings {
  @scala.inline
  def apply(isIndexedDBEnabled: scala.Boolean, isJavaScriptEnabled: scala.Boolean): MSWebViewSettings = {
    val __obj = js.Dynamic.literal(isIndexedDBEnabled = isIndexedDBEnabled.asInstanceOf[js.Any], isJavaScriptEnabled = isJavaScriptEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSWebViewSettings]
  }
  @scala.inline
  implicit class MSWebViewSettingsOps[Self <: MSWebViewSettings] (val x: Self) extends AnyVal {
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
    def setIsIndexedDBEnabled(value: scala.Boolean): Self = this.set("isIndexedDBEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsJavaScriptEnabled(value: scala.Boolean): Self = this.set("isJavaScriptEnabled", value.asInstanceOf[js.Any])
  }
  
}

