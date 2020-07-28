package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedNodeMap extends /* index */ NumberDictionary[Attr] {
  val length: Double = js.native
  def getNamedItem(qualifiedName: java.lang.String): Attr | Null = js.native
  def getNamedItemNS(namespace: java.lang.String, localName: java.lang.String): Attr | Null = js.native
  def getNamedItemNS(namespace: Null, localName: java.lang.String): Attr | Null = js.native
  def item(index: Double): Attr | Null = js.native
  def removeNamedItem(qualifiedName: java.lang.String): Attr = js.native
  def removeNamedItemNS(namespace: java.lang.String, localName: java.lang.String): Attr = js.native
  def removeNamedItemNS(namespace: Null, localName: java.lang.String): Attr = js.native
  def setNamedItem(attr: Attr): Attr | Null = js.native
  def setNamedItemNS(attr: Attr): Attr | Null = js.native
}

