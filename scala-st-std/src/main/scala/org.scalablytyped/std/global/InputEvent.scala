package org.scalablytyped.std.global

import org.scalablytyped.std.InputEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InputEvent")
@js.native
class InputEvent protected ()
  extends org.scalablytyped.std.InputEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: InputEventInit) = this()
}

@JSGlobal("InputEvent")
@js.native
object InputEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.InputEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ InputEventInit, 
      org.scalablytyped.std.InputEvent
    ]

