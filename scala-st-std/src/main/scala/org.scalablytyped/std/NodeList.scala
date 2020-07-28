package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeList extends /* index */ NumberDictionary[Node] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Node]] = js.native
  var length: Double = js.native
  def item(index: Double): Node = js.native
}

