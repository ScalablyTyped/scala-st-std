package org.scalablytyped.std.global

import org.scalablytyped.std.TransitionEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TransitionEvent")
@js.native
class TransitionEvent protected ()
  extends org.scalablytyped.std.TransitionEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: TransitionEventInit) = this()
}

@JSGlobal("TransitionEvent")
@js.native
object TransitionEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.TransitionEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ TransitionEventInit, 
      org.scalablytyped.std.TransitionEvent
    ]

