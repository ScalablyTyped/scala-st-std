package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSVGDocument extends js.Object {
  def getSVGDocument(): Document
}

object GetSVGDocument {
  @scala.inline
  def apply(getSVGDocument: () => Document): GetSVGDocument = {
    val __obj = js.Dynamic.literal(getSVGDocument = js.Any.fromFunction0(getSVGDocument))
    __obj.asInstanceOf[GetSVGDocument]
  }
  @scala.inline
  implicit class GetSVGDocumentOps[Self <: GetSVGDocument] (val x: Self) extends AnyVal {
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
    def setGetSVGDocument(value: () => Document): Self = this.set("getSVGDocument", js.Any.fromFunction0(value))
  }
  
}

