package org.scalablytyped.std.global

import org.scalablytyped.std.ClipboardEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipboardEvent")
@js.native
class ClipboardEvent protected ()
  extends org.scalablytyped.std.ClipboardEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ClipboardEventInit) = this()
}

@JSGlobal("ClipboardEvent")
@js.native
object ClipboardEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.ClipboardEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ ClipboardEventInit, 
      org.scalablytyped.std.ClipboardEvent
    ]

