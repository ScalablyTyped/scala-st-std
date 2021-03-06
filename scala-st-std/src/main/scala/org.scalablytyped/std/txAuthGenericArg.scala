package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait txAuthGenericArg extends js.Object {
  var content: ArrayBuffer
  var contentType: java.lang.String
}

object txAuthGenericArg {
  @scala.inline
  def apply(content: ArrayBuffer, contentType: java.lang.String): txAuthGenericArg = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[txAuthGenericArg]
  }
  @scala.inline
  implicit class txAuthGenericArgOps[Self <: txAuthGenericArg] (val x: Self) extends AnyVal {
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
    def setContent(value: ArrayBuffer): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: java.lang.String): Self = this.set("contentType", value.asInstanceOf[js.Any])
  }
  
}

