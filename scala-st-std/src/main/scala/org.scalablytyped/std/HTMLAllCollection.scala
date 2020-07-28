package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAllCollection extends /* index */ NumberDictionary[Element] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Element]] = js.native
  /**
    * Returns the number of elements in the collection.
    */
  val length: Double = js.native
  /**
    * element = collection(index)
    */
  def item(): HTMLCollection | Element | Null = js.native
  def item(nameOrIndex: java.lang.String): HTMLCollection | Element | Null = js.native
  /**
    * element = collection(name)
    */
  def namedItem(name: java.lang.String): HTMLCollection | Element | Null = js.native
}

