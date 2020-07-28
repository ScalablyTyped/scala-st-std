package org.scalablytyped.std.global

import org.scalablytyped.std.QueuingStrategy
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CountQueuingStrategy")
@js.native
class CountQueuingStrategy protected ()
  extends org.scalablytyped.std.CountQueuingStrategy {
  def this(strategy: QueuingStrategy) = this()
  /* CompleteClass */
  override var highWaterMark: Double = js.native
  /* CompleteClass */
  override def size(): Double = js.native
}

@JSGlobal("CountQueuingStrategy")
@js.native
object CountQueuingStrategy
  extends Instantiable1[/* strategy */ QueuingStrategy, org.scalablytyped.std.CountQueuingStrategy]

