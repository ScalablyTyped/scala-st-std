package org.scalablytyped.std.global

import org.scalablytyped.std.ArrayBufferLike
import org.scalablytyped.std.ArrayLike
import org.scalablytyped.std.Iterable
import org.scalablytyped.std.Uint32ArrayConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Uint32Array")
@js.native
class Uint32Array protected ()
  extends org.scalablytyped.std.Uint32Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Uint32Array")
@js.native
object Uint32Array extends TopLevel[Uint32ArrayConstructor]

