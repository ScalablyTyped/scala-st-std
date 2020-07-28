package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGLangSpace extends js.Object {
  var xmllang: java.lang.String
  var xmlspace: java.lang.String
}

object SVGLangSpace {
  @scala.inline
  def apply(xmllang: java.lang.String, xmlspace: java.lang.String): SVGLangSpace = {
    val __obj = js.Dynamic.literal(xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLangSpace]
  }
  @scala.inline
  implicit class SVGLangSpaceOps[Self <: SVGLangSpace] (val x: Self) extends AnyVal {
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
    def setXmllang(value: java.lang.String): Self = this.set("xmllang", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlspace(value: java.lang.String): Self = this.set("xmlspace", value.asInstanceOf[js.Any])
  }
  
}

