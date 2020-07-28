package org.scalablytyped.std.global

import org.scalablytyped.std.Iterable
import org.scalablytyped.std.MapConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Map")
@js.native
class Map[K, V] ()
  extends org.scalablytyped.std.Map[K, V] {
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}

@JSGlobal("Map")
@js.native
object Map extends TopLevel[MapConstructor]

