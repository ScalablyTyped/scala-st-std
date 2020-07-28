package org.scalablytyped.std.global

import org.scalablytyped.std.Iterable
import org.scalablytyped.std.WeakMapConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WeakMap")
@js.native
class WeakMap[K, V] ()
  extends org.scalablytyped.std.WeakMap[K, V] {
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}

@JSGlobal("WeakMap")
@js.native
object WeakMap extends TopLevel[WeakMapConstructor]

