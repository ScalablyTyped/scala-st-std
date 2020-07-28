package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AudioParam")
@js.native
class AudioParam ()
  extends org.scalablytyped.std.AudioParam {
  /* CompleteClass */
  override var defaultValue: Double = js.native
  /* CompleteClass */
  override var value: Double = js.native
  /* CompleteClass */
  override def cancelScheduledValues(startTime: Double): Unit = js.native
  /* CompleteClass */
  override def exponentialRampToValueAtTime(value: Double, endTime: Double): Unit = js.native
  /* CompleteClass */
  override def linearRampToValueAtTime(value: Double, endTime: Double): Unit = js.native
  /* CompleteClass */
  override def setTargetAtTime(target: Double, startTime: Double, timeConstant: Double): Unit = js.native
  /* CompleteClass */
  override def setValueAtTime(value: Double, startTime: Double): Unit = js.native
  /* CompleteClass */
  override def setValueCurveAtTime(values: org.scalablytyped.std.Float32Array, startTime: Double, duration: Double): Unit = js.native
}

@JSGlobal("AudioParam")
@js.native
object AudioParam
  extends Instantiable0[org.scalablytyped.std.AudioParam]

