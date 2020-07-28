package org.scalablytyped.std.global

import org.scalablytyped.std.TouchEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TouchEvent")
@js.native
class TouchEvent protected ()
  extends org.scalablytyped.std.TouchEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: TouchEventInit) = this()
}

@JSGlobal("TouchEvent")
@js.native
object TouchEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.TouchEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ TouchEventInit, 
      org.scalablytyped.std.TouchEvent
    ]

