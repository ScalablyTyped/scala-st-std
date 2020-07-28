package org.scalablytyped.std.global

import org.scalablytyped.std.GamepadHapticActuatorType
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GamepadHapticActuator")
@js.native
class GamepadHapticActuator ()
  extends org.scalablytyped.std.GamepadHapticActuator {
  /* CompleteClass */
  override val `type`: GamepadHapticActuatorType = js.native
  /* CompleteClass */
  override def pulse(value: Double, duration: Double): js.Promise[scala.Boolean] = js.native
}

@JSGlobal("GamepadHapticActuator")
@js.native
object GamepadHapticActuator
  extends Instantiable0[org.scalablytyped.std.GamepadHapticActuator]

