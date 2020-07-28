package org.scalablytyped.std.global

import org.scalablytyped.std.SpeechSynthesisEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SpeechSynthesisEvent")
@js.native
class SpeechSynthesisEvent protected ()
  extends org.scalablytyped.std.SpeechSynthesisEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: SpeechSynthesisEventInit) = this()
}

@JSGlobal("SpeechSynthesisEvent")
@js.native
object SpeechSynthesisEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.SpeechSynthesisEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ SpeechSynthesisEventInit, 
      org.scalablytyped.std.SpeechSynthesisEvent
    ]

