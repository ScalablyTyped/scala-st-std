package org.scalablytyped.std.global

import org.scalablytyped.std.ArrayConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Array")
@js.native
class Array[T] protected ()
  extends org.scalablytyped.std.Array[T] {
  def this(arrayLength: Double) = this()
  def this(items: T*) = this()
}

@JSGlobal("Array")
@js.native
object Array extends TopLevel[ArrayConstructor]

