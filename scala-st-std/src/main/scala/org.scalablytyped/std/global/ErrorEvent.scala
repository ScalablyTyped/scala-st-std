package org.scalablytyped.std.global

import org.scalablytyped.std.ErrorEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ErrorEvent")
@js.native
class ErrorEvent protected ()
  extends org.scalablytyped.std.ErrorEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: ErrorEventInit) = this()
}

@JSGlobal("ErrorEvent")
@js.native
object ErrorEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.ErrorEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ ErrorEventInit, 
      org.scalablytyped.std.ErrorEvent
    ]

