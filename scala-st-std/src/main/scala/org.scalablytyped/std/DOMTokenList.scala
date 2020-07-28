package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMTokenList
  extends /* index */ NumberDictionary[java.lang.String] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  val length: Double = js.native
  def add(tokens: java.lang.String*): Unit = js.native
  def contains(token: java.lang.String): scala.Boolean = js.native
  def item(index: Double): java.lang.String | Null = js.native
  def remove(tokens: java.lang.String*): Unit = js.native
  def replace(oldToken: java.lang.String, newToken: java.lang.String): Unit = js.native
  def toggle(token: java.lang.String): scala.Boolean = js.native
  def toggle(token: java.lang.String, force: scala.Boolean): scala.Boolean = js.native
}

