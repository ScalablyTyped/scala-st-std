package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementDefinitionOptions extends js.Object {
  var `extends`: java.lang.String
}

object ElementDefinitionOptions {
  @scala.inline
  def apply(`extends`: java.lang.String): ElementDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionOptions]
  }
  @scala.inline
  implicit class ElementDefinitionOptionsOps[Self <: ElementDefinitionOptions] (val x: Self) extends AnyVal {
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
    def setExtends(value: java.lang.String): Self = this.set("extends", value.asInstanceOf[js.Any])
  }
  
}

