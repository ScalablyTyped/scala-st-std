package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMImplementation extends js.Object {
  def createDocument(namespaceURI: java.lang.String, qualifiedName: java.lang.String, doctype: DocumentType): Document
  def createDocumentType(qualifiedName: java.lang.String, publicId: java.lang.String, systemId: java.lang.String): DocumentType
  def createHTMLDocument(title: java.lang.String): Document
  def hasFeature(feature: java.lang.String, version: java.lang.String): scala.Boolean
}

object DOMImplementation {
  @scala.inline
  def apply(
    createDocument: (java.lang.String, java.lang.String, DocumentType) => Document,
    createDocumentType: (java.lang.String, java.lang.String, java.lang.String) => DocumentType,
    createHTMLDocument: java.lang.String => Document,
    hasFeature: (java.lang.String, java.lang.String) => scala.Boolean
  ): DOMImplementation = {
    val __obj = js.Dynamic.literal(createDocument = js.Any.fromFunction3(createDocument), createDocumentType = js.Any.fromFunction3(createDocumentType), createHTMLDocument = js.Any.fromFunction1(createHTMLDocument), hasFeature = js.Any.fromFunction2(hasFeature))
    __obj.asInstanceOf[DOMImplementation]
  }
  @scala.inline
  implicit class DOMImplementationOps[Self <: DOMImplementation] (val x: Self) extends AnyVal {
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
    def setCreateDocument(value: (java.lang.String, java.lang.String, DocumentType) => Document): Self = this.set("createDocument", js.Any.fromFunction3(value))
    @scala.inline
    def setCreateDocumentType(value: (java.lang.String, java.lang.String, java.lang.String) => DocumentType): Self = this.set("createDocumentType", js.Any.fromFunction3(value))
    @scala.inline
    def setCreateHTMLDocument(value: java.lang.String => Document): Self = this.set("createHTMLDocument", js.Any.fromFunction1(value))
    @scala.inline
    def setHasFeature(value: (java.lang.String, java.lang.String) => scala.Boolean): Self = this.set("hasFeature", js.Any.fromFunction2(value))
  }
  
}

