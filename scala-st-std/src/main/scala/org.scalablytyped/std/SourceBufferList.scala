package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceBufferList
  extends EventTarget
     with /* index */ NumberDictionary[SourceBuffer] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SourceBuffer]] = js.native
  val length: Double = js.native
  def item(index: Double): SourceBuffer = js.native
}

