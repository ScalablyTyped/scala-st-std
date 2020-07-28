package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IDBKeyRange")
@js.native
class IDBKeyRange ()
  extends org.scalablytyped.std.IDBKeyRange {
  /* CompleteClass */
  override var lower: js.Any = js.native
  /* CompleteClass */
  override var lowerOpen: scala.Boolean = js.native
  /* CompleteClass */
  override var upper: js.Any = js.native
  /* CompleteClass */
  override var upperOpen: scala.Boolean = js.native
}

@JSGlobal("IDBKeyRange")
@js.native
object IDBKeyRange
  extends Instantiable0[org.scalablytyped.std.IDBKeyRange] {
  def bound(lower: js.Any, upper: js.Any): org.scalablytyped.std.IDBKeyRange = js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: js.UndefOr[scala.Nothing], upperOpen: scala.Boolean): org.scalablytyped.std.IDBKeyRange = js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean): org.scalablytyped.std.IDBKeyRange = js.native
  def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean, upperOpen: scala.Boolean): org.scalablytyped.std.IDBKeyRange = js.native
  def lowerBound(bound: js.Any): org.scalablytyped.std.IDBKeyRange = js.native
  def lowerBound(bound: js.Any, open: scala.Boolean): org.scalablytyped.std.IDBKeyRange = js.native
  def only(value: js.Any): org.scalablytyped.std.IDBKeyRange = js.native
  def upperBound(bound: js.Any): org.scalablytyped.std.IDBKeyRange = js.native
  def upperBound(bound: js.Any, open: scala.Boolean): org.scalablytyped.std.IDBKeyRange = js.native
}

