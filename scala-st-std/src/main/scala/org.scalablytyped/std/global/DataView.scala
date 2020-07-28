package org.scalablytyped.std.global

import org.scalablytyped.std.DataViewConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DataView")
@js.native
class DataView protected ()
  extends org.scalablytyped.std.DataView {
  def this(buffer: org.scalablytyped.std.ArrayBuffer) = this()
  def this(buffer: org.scalablytyped.std.ArrayBuffer, byteOffset: Double) = this()
  def this(
    buffer: org.scalablytyped.std.ArrayBuffer,
    byteOffset: js.UndefOr[scala.Nothing],
    byteLength: Double
  ) = this()
  def this(buffer: org.scalablytyped.std.ArrayBuffer, byteOffset: Double, byteLength: Double) = this()
}

@JSGlobal("DataView")
@js.native
object DataView extends TopLevel[DataViewConstructor]

