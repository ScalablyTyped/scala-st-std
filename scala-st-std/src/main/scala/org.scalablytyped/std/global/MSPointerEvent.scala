package org.scalablytyped.std.global

import org.scalablytyped.std.PointerEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSPointerEvent")
@js.native
class MSPointerEvent protected ()
  extends org.scalablytyped.std.MSPointerEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: PointerEventInit) = this()
}

@JSGlobal("MSPointerEvent")
@js.native
object MSPointerEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.MSPointerEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ PointerEventInit, 
      org.scalablytyped.std.MSPointerEvent
    ]

