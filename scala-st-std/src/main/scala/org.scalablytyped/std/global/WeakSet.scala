package org.scalablytyped.std.global

import org.scalablytyped.std.Iterable
import org.scalablytyped.std.WeakSetConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WeakSet")
@js.native
class WeakSet[T] ()
  extends org.scalablytyped.std.WeakSet[T] {
  def this(iterable: Iterable[T]) = this()
}

@JSGlobal("WeakSet")
@js.native
object WeakSet extends TopLevel[WeakSetConstructor]

