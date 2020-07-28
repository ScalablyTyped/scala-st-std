package org.scalablytyped.std.global

import org.scalablytyped.std.anon.HighWaterMark
import org.scalablytyped.std.stdNumbers.`1`
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CountQueuingStrategy")
@js.native
class CountQueuingStrategy protected ()
  extends org.scalablytyped.std.CountQueuingStrategy {
  def this(options: HighWaterMark) = this()
  /* CompleteClass */
  @JSName("highWaterMark")
  override var highWaterMark_CountQueuingStrategy: Double = js.native
  /* CompleteClass */
  @JSName("size")
  override def size_MCountQueuingStrategy(chunk: js.Any): `1` = js.native
}

@JSGlobal("CountQueuingStrategy")
@js.native
object CountQueuingStrategy
  extends Instantiable1[/* options */ HighWaterMark, org.scalablytyped.std.CountQueuingStrategy]

