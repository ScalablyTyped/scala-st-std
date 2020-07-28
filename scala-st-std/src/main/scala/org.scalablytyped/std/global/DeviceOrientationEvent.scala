package org.scalablytyped.std.global

import org.scalablytyped.std.DeviceOrientationEventInit
import org.scalablytyped.std.PermissionState
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DeviceOrientationEvent")
@js.native
class DeviceOrientationEvent protected ()
  extends org.scalablytyped.std.DeviceOrientationEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DeviceOrientationEventInit) = this()
}

@JSGlobal("DeviceOrientationEvent")
@js.native
object DeviceOrientationEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.DeviceOrientationEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ DeviceOrientationEventInit, 
      org.scalablytyped.std.DeviceOrientationEvent
    ] {
  def requestPermission(): js.Promise[PermissionState] = js.native
}

