package org.scalablytyped.std.global

import org.scalablytyped.std.GamepadHand
import org.scalablytyped.std.GamepadMappingType
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Gamepad")
@js.native
class Gamepad ()
  extends org.scalablytyped.std.Gamepad {
  /* CompleteClass */
  override val axes: js.Array[Double] = js.native
  /* CompleteClass */
  override val buttons: js.Array[org.scalablytyped.std.GamepadButton] = js.native
  /* CompleteClass */
  override val connected: scala.Boolean = js.native
  /* CompleteClass */
  override val hand: GamepadHand = js.native
  /* CompleteClass */
  override val hapticActuators: js.Array[org.scalablytyped.std.GamepadHapticActuator] = js.native
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /* CompleteClass */
  override val index: Double = js.native
  /* CompleteClass */
  override val mapping: GamepadMappingType = js.native
  /* CompleteClass */
  override val pose: org.scalablytyped.std.GamepadPose | Null = js.native
  /* CompleteClass */
  override val timestamp: Double = js.native
}

@JSGlobal("Gamepad")
@js.native
object Gamepad
  extends Instantiable0[org.scalablytyped.std.Gamepad]

