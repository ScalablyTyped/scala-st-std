package org.scalablytyped.std.global

import org.scalablytyped.std.VBArrayConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBArray")
@js.native
class VBArray[T] protected ()
  extends org.scalablytyped.std.VBArray[T] {
  def this(safeArray: org.scalablytyped.std.SafeArray[T]) = this()
}

@JSGlobal("VBArray")
@js.native
object VBArray extends TopLevel[VBArrayConstructor]

