package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MimeTypeArray extends /* index */ NumberDictionary[Plugin] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Plugin]] = js.native
  val length: Double = js.native
  def item(index: Double): Plugin = js.native
  def namedItem(`type`: java.lang.String): Plugin = js.native
}

