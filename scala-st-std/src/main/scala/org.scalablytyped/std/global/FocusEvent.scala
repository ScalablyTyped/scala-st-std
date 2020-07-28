package org.scalablytyped.std.global

import org.scalablytyped.std.FocusEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FocusEvent")
@js.native
class FocusEvent protected ()
  extends org.scalablytyped.std.FocusEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: FocusEventInit) = this()
}

@JSGlobal("FocusEvent")
@js.native
object FocusEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.FocusEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ FocusEventInit, 
      org.scalablytyped.std.FocusEvent
    ]

