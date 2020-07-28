package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends EventTarget {
  var ATTRIBUTE_NODE: Double = js.native
  var CDATA_SECTION_NODE: Double = js.native
  var COMMENT_NODE: Double = js.native
  var DOCUMENT_FRAGMENT_NODE: Double = js.native
  var DOCUMENT_NODE: Double = js.native
  var DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
  var DOCUMENT_POSITION_CONTAINS: Double = js.native
  var DOCUMENT_POSITION_DISCONNECTED: Double = js.native
  var DOCUMENT_POSITION_FOLLOWING: Double = js.native
  var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
  var DOCUMENT_POSITION_PRECEDING: Double = js.native
  var DOCUMENT_TYPE_NODE: Double = js.native
  var ELEMENT_NODE: Double = js.native
  var ENTITY_NODE: Double = js.native
  var ENTITY_REFERENCE_NODE: Double = js.native
  var NOTATION_NODE: Double = js.native
  var PROCESSING_INSTRUCTION_NODE: Double = js.native
  var TEXT_NODE: Double = js.native
  var attributes: NamedNodeMap = js.native
  var baseURI: java.lang.String = js.native
  var childNodes: NodeList = js.native
  var firstChild: Node = js.native
  var lastChild: Node = js.native
  var localName: java.lang.String = js.native
  var namespaceURI: java.lang.String = js.native
  var nextSibling: Node = js.native
  var nodeName: java.lang.String = js.native
  var nodeType: Double = js.native
  var nodeValue: java.lang.String = js.native
  var ownerDocument: Document = js.native
  var parentElement: HTMLElement = js.native
  var parentNode: Node = js.native
  var prefix: java.lang.String = js.native
  var previousSibling: Node = js.native
  var textContent: java.lang.String = js.native
  def appendChild(newChild: Node): Node = js.native
  def cloneNode(): Node = js.native
  def cloneNode(deep: scala.Boolean): Node = js.native
  def compareDocumentPosition(other: Node): Double = js.native
  def contains(node: Node): scala.Boolean = js.native
  def hasAttributes(): scala.Boolean = js.native
  def hasChildNodes(): scala.Boolean = js.native
  def insertBefore(newChild: Node): Node = js.native
  def insertBefore(newChild: Node, refChild: Node): Node = js.native
  def isDefaultNamespace(namespaceURI: java.lang.String): scala.Boolean = js.native
  def isEqualNode(arg: Node): scala.Boolean = js.native
  def isSameNode(other: Node): scala.Boolean = js.native
  def lookupNamespaceURI(prefix: java.lang.String): java.lang.String = js.native
  def lookupPrefix(namespaceURI: java.lang.String): java.lang.String = js.native
  def normalize(): Unit = js.native
  def removeChild(oldChild: Node): Node = js.native
  def replaceChild(newChild: Node, oldChild: Node): Node = js.native
}

