package org.scalablytyped.std.global

import org.scalablytyped.std.HashChangeEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HashChangeEvent")
@js.native
class HashChangeEvent protected ()
  extends org.scalablytyped.std.HashChangeEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: HashChangeEventInit) = this()
}

@JSGlobal("HashChangeEvent")
@js.native
object HashChangeEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.HashChangeEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ HashChangeEventInit, 
      org.scalablytyped.std.HashChangeEvent
    ]

