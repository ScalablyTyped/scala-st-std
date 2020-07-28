package org.scalablytyped.std.global

import org.scalablytyped.std.Document
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMImplementation")
@js.native
class DOMImplementation ()
  extends org.scalablytyped.std.DOMImplementation {
  /* CompleteClass */
  override def createDocument(
    namespaceURI: java.lang.String,
    qualifiedName: java.lang.String,
    doctype: org.scalablytyped.std.DocumentType
  ): Document = js.native
  /* CompleteClass */
  override def createDocumentType(qualifiedName: java.lang.String, publicId: java.lang.String, systemId: java.lang.String): org.scalablytyped.std.DocumentType = js.native
  /* CompleteClass */
  override def createHTMLDocument(title: java.lang.String): Document = js.native
  /* CompleteClass */
  override def hasFeature(feature: java.lang.String, version: java.lang.String): scala.Boolean = js.native
}

@JSGlobal("DOMImplementation")
@js.native
object DOMImplementation
  extends Instantiable0[org.scalablytyped.std.DOMImplementation]

