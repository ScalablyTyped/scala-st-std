package org.scalablytyped.std.global

import org.scalablytyped.std.KeyboardEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("KeyboardEvent")
@js.native
class KeyboardEvent protected ()
  extends org.scalablytyped.std.KeyboardEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: KeyboardEventInit) = this()
}

@JSGlobal("KeyboardEvent")
@js.native
object KeyboardEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.KeyboardEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ KeyboardEventInit, 
      org.scalablytyped.std.KeyboardEvent
    ] {
  val DOM_KEY_LOCATION_JOYSTICK: Double = js.native
  val DOM_KEY_LOCATION_LEFT: Double = js.native
  val DOM_KEY_LOCATION_MOBILE: Double = js.native
  val DOM_KEY_LOCATION_NUMPAD: Double = js.native
  val DOM_KEY_LOCATION_RIGHT: Double = js.native
  val DOM_KEY_LOCATION_STANDARD: Double = js.native
}

