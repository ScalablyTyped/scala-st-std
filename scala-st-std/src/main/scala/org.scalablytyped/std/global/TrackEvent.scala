package org.scalablytyped.std.global

import org.scalablytyped.std.TrackEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TrackEvent")
@js.native
class TrackEvent protected ()
  extends org.scalablytyped.std.TrackEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: TrackEventInit) = this()
}

@JSGlobal("TrackEvent")
@js.native
object TrackEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.TrackEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ TrackEventInit, 
      org.scalablytyped.std.TrackEvent
    ]

