package org.scalablytyped.std.global

import org.scalablytyped.std.ArrayBufferLike
import org.scalablytyped.std.DataViewConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DataView")
@js.native
class DataView protected ()
  extends org.scalablytyped.std.DataView {
  def this(buffer: ArrayBufferLike) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], byteLength: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, byteLength: Double) = this()
}

@JSGlobal("DataView")
@js.native
object DataView extends TopLevel[DataViewConstructor]

