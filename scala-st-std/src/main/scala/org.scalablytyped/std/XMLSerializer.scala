package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLSerializer extends js.Object {
  def serializeToString(target: Node): java.lang.String
}

object XMLSerializer {
  @scala.inline
  def apply(serializeToString: Node => java.lang.String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.asInstanceOf[XMLSerializer]
  }
  @scala.inline
  implicit class XMLSerializerOps[Self <: XMLSerializer] (val x: Self) extends AnyVal {
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
    def setSerializeToString(value: Node => java.lang.String): Self = this.set("serializeToString", js.Any.fromFunction1(value))
  }
  
}

