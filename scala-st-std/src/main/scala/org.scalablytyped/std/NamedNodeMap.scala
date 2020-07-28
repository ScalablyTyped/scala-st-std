package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedNodeMap extends /* index */ NumberDictionary[Attr] {
  val length: Double = js.native
  def getNamedItem(name: java.lang.String): Attr = js.native
  def getNamedItemNS(): Attr = js.native
  def getNamedItemNS(namespaceURI: java.lang.String): Attr = js.native
  def getNamedItemNS(namespaceURI: java.lang.String, localName: java.lang.String): Attr = js.native
  def getNamedItemNS(namespaceURI: Null, localName: java.lang.String): Attr = js.native
  def item(index: Double): Attr = js.native
  def removeNamedItem(name: java.lang.String): Attr = js.native
  def removeNamedItemNS(): Attr = js.native
  def removeNamedItemNS(namespaceURI: java.lang.String): Attr = js.native
  def removeNamedItemNS(namespaceURI: java.lang.String, localName: java.lang.String): Attr = js.native
  def removeNamedItemNS(namespaceURI: Null, localName: java.lang.String): Attr = js.native
  def setNamedItem(arg: Attr): Attr = js.native
  def setNamedItemNS(arg: Attr): Attr = js.native
}

