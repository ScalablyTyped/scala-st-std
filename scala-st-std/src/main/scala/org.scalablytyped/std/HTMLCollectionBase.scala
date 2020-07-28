package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCollectionBase extends /* index */ NumberDictionary[Element] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Element]] = js.native
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  val length: Double = js.native
  /**
    * Retrieves an object from various collections.
    */
  def item(index: Double): Element = js.native
}

