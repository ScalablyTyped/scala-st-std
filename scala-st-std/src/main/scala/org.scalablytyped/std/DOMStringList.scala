package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMStringList
  extends /* index */ NumberDictionary[java.lang.String] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  /**
    * Returns the number of strings in strings.
    */
  val length: Double = js.native
  /**
    * Returns true if strings contains string, and false
    * otherwise.
    */
  def contains(string: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the string with index index from strings.
    */
  def item(index: Double): java.lang.String | Null = js.native
}

