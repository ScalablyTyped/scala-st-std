package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileList extends /* index */ NumberDictionary[File] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[File]] = js.native
  val length: Double = js.native
  def item(index: Double): File | Null = js.native
}

