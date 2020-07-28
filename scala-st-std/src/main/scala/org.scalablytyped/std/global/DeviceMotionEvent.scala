package org.scalablytyped.std.global

import org.scalablytyped.std.DeviceMotionEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DeviceMotionEvent")
@js.native
class DeviceMotionEvent protected ()
  extends org.scalablytyped.std.DeviceMotionEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DeviceMotionEventInit) = this()
}

@JSGlobal("DeviceMotionEvent")
@js.native
object DeviceMotionEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.DeviceMotionEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ DeviceMotionEventInit, 
      org.scalablytyped.std.DeviceMotionEvent
    ]

