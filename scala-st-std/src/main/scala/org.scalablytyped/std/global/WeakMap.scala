package org.scalablytyped.std.global

import org.scalablytyped.std.WeakMapConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends org.scalablytyped.std.WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
}

@JSGlobal("WeakMap")
@js.native
object WeakMap extends TopLevel[WeakMapConstructor]

