package org.scalablytyped.std.global

import org.scalablytyped.std.EventSourceInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("EventSource")
@js.native
class EventSource protected ()
  extends org.scalablytyped.std.EventSource {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, eventSourceInitDict: EventSourceInit) = this()
}

@JSGlobal("EventSource")
@js.native
object EventSource
  extends Instantiable1[/* url */ java.lang.String, org.scalablytyped.std.EventSource]
     with Instantiable2[
      /* url */ java.lang.String, 
      /* eventSourceInitDict */ EventSourceInit, 
      org.scalablytyped.std.EventSource
    ]

