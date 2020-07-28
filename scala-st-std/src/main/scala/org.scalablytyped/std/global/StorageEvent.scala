package org.scalablytyped.std.global

import org.scalablytyped.std.StorageEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StorageEvent")
@js.native
class StorageEvent protected ()
  extends org.scalablytyped.std.StorageEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: StorageEventInit) = this()
}

@JSGlobal("StorageEvent")
@js.native
object StorageEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.StorageEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ StorageEventInit, 
      org.scalablytyped.std.StorageEvent
    ]

