package org.scalablytyped.std.global

import org.scalablytyped.std.CompositionEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CompositionEvent")
@js.native
class CompositionEvent protected ()
  extends org.scalablytyped.std.CompositionEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: CompositionEventInit) = this()
}

@JSGlobal("CompositionEvent")
@js.native
object CompositionEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.CompositionEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ CompositionEventInit, 
      org.scalablytyped.std.CompositionEvent
    ]

