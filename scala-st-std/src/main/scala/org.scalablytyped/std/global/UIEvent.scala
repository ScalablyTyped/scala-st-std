package org.scalablytyped.std.global

import org.scalablytyped.std.UIEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("UIEvent")
@js.native
class UIEvent protected ()
  extends org.scalablytyped.std.UIEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: UIEventInit) = this()
}

@JSGlobal("UIEvent")
@js.native
object UIEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.UIEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ UIEventInit, 
      org.scalablytyped.std.UIEvent
    ]

