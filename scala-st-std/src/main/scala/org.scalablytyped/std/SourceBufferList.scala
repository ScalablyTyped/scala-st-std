package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceBufferList
  extends EventTarget
     with /* index */ NumberDictionary[SourceBuffer] {
  var length: Double = js.native
  def item(index: Double): SourceBuffer = js.native
}

