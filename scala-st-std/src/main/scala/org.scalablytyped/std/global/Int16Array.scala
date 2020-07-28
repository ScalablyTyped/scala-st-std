package org.scalablytyped.std.global

import org.scalablytyped.std.ArrayBufferLike
import org.scalablytyped.std.ArrayLike
import org.scalablytyped.std.Int16ArrayConstructor
import org.scalablytyped.std.Iterable
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Int16Array")
@js.native
class Int16Array protected ()
  extends org.scalablytyped.std.Int16Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Int16Array")
@js.native
object Int16Array extends TopLevel[Int16ArrayConstructor]

