package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchList extends /* index */ NumberDictionary[Touch] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Touch]] = js.native
  val length: Double = js.native
  def item(index: Double): Touch | Null = js.native
}

