package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSheetList extends /* index */ NumberDictionary[StyleSheet] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[StyleSheet]] = js.native
  val length: Double = js.native
  def item(index: Double): StyleSheet | Null = js.native
}

