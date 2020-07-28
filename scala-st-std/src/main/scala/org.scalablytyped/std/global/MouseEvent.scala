package org.scalablytyped.std.global

import org.scalablytyped.std.MouseEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MouseEvent")
@js.native
class MouseEvent protected ()
  extends org.scalablytyped.std.MouseEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: MouseEventInit) = this()
}

@JSGlobal("MouseEvent")
@js.native
object MouseEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.MouseEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ MouseEventInit, 
      org.scalablytyped.std.MouseEvent
    ]

