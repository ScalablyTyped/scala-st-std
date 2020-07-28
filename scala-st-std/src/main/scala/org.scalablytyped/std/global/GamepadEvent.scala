package org.scalablytyped.std.global

import org.scalablytyped.std.GamepadEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GamepadEvent")
@js.native
class GamepadEvent protected ()
  extends org.scalablytyped.std.GamepadEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: GamepadEventInit) = this()
}

@JSGlobal("GamepadEvent")
@js.native
object GamepadEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.GamepadEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ GamepadEventInit, 
      org.scalablytyped.std.GamepadEvent
    ]

