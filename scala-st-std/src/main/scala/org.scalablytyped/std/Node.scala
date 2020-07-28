package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends EventTarget {
  val ATTRIBUTE_NODE: Double = js.native
  val CDATA_SECTION_NODE: Double = js.native
  val COMMENT_NODE: Double = js.native
  val DOCUMENT_FRAGMENT_NODE: Double = js.native
  val DOCUMENT_NODE: Double = js.native
  val DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
  val DOCUMENT_POSITION_CONTAINS: Double = js.native
  val DOCUMENT_POSITION_DISCONNECTED: Double = js.native
  val DOCUMENT_POSITION_FOLLOWING: Double = js.native
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
  val DOCUMENT_POSITION_PRECEDING: Double = js.native
  val DOCUMENT_TYPE_NODE: Double = js.native
  val ELEMENT_NODE: Double = js.native
  val ENTITY_NODE: Double = js.native
  val ENTITY_REFERENCE_NODE: Double = js.native
  val NOTATION_NODE: Double = js.native
  val PROCESSING_INSTRUCTION_NODE: Double = js.native
  val TEXT_NODE: Double = js.native
  val attributes: NamedNodeMap = js.native
  val baseURI: java.lang.String | Null = js.native
  val childNodes: NodeList = js.native
  val firstChild: Node | Null = js.native
  val lastChild: Node | Null = js.native
  val localName: java.lang.String | Null = js.native
  val namespaceURI: java.lang.String | Null = js.native
  val nextSibling: Node | Null = js.native
  val nodeName: java.lang.String = js.native
  val nodeType: Double = js.native
  var nodeValue: java.lang.String | Null = js.native
  val ownerDocument: Document = js.native
  val parentElement: HTMLElement | Null = js.native
  val parentNode: Node | Null = js.native
  val previousSibling: Node | Null = js.native
  var textContent: java.lang.String | Null = js.native
  def appendChild[T /* <: Node */](newChild: T): T = js.native
  def cloneNode(): Node = js.native
  def cloneNode(deep: scala.Boolean): Node = js.native
  def compareDocumentPosition(other: Node): Double = js.native
  def contains(child: Node): scala.Boolean = js.native
  def hasAttributes(): scala.Boolean = js.native
  def hasChildNodes(): scala.Boolean = js.native
  def insertBefore[T /* <: Node */](newChild: T): T = js.native
  def insertBefore[T /* <: Node */](newChild: T, refChild: Node): T = js.native
  def isDefaultNamespace(): scala.Boolean = js.native
  def isDefaultNamespace(namespaceURI: java.lang.String): scala.Boolean = js.native
  def isEqualNode(arg: Node): scala.Boolean = js.native
  def isSameNode(other: Node): scala.Boolean = js.native
  def lookupNamespaceURI(): java.lang.String | Null = js.native
  def lookupNamespaceURI(prefix: java.lang.String): java.lang.String | Null = js.native
  def lookupPrefix(): java.lang.String | Null = js.native
  def lookupPrefix(namespaceURI: java.lang.String): java.lang.String | Null = js.native
  def normalize(): Unit = js.native
  def removeChild[T /* <: Node */](oldChild: T): T = js.native
  def replaceChild[T /* <: Node */](newChild: Node, oldChild: T): T = js.native
}

