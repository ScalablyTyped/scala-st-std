package org.scalablytyped.std.global

import org.scalablytyped.std.PointerEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PointerEvent")
@js.native
class PointerEvent protected ()
  extends org.scalablytyped.std.PointerEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: PointerEventInit) = this()
}

@JSGlobal("PointerEvent")
@js.native
object PointerEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.PointerEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ PointerEventInit, 
      org.scalablytyped.std.PointerEvent
    ]

