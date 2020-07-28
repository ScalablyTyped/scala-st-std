package org.scalablytyped.std.global

import org.scalablytyped.std.DragEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DragEvent")
@js.native
class DragEvent protected ()
  extends org.scalablytyped.std.DragEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DragEventInit) = this()
}

@JSGlobal("DragEvent")
@js.native
object DragEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.DragEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ DragEventInit, 
      org.scalablytyped.std.DragEvent
    ]

