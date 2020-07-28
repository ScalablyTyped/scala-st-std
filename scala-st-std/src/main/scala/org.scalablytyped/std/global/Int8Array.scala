package org.scalablytyped.std.global

import org.scalablytyped.std.ArrayLike
import org.scalablytyped.std.Int8ArrayConstructor
import org.scalablytyped.std.Iterable
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Int8Array")
@js.native
class Int8Array protected ()
  extends org.scalablytyped.std.Int8Array {
  def this(array: ArrayLike[Double]) = this()
  def this(buffer: org.scalablytyped.std.ArrayBuffer) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: org.scalablytyped.std.ArrayBuffer, byteOffset: Double) = this()
  def this(buffer: org.scalablytyped.std.ArrayBuffer, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
  def this(buffer: org.scalablytyped.std.ArrayBuffer, byteOffset: Double, length: Double) = this()
}

@JSGlobal("Int8Array")
@js.native
object Int8Array extends TopLevel[Int8ArrayConstructor]

