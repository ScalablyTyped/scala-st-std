package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSRuleList extends /* index */ NumberDictionary[CSSRule] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSRule]] = js.native
  val length: Double = js.native
  def item(index: Double): CSSRule | Null = js.native
}

