package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SpeechSynthesisEvent interface of the Web Speech API contains information about the current state of SpeechSynthesisUtterance objects that have been processed in the speech service. */
@js.native
trait SpeechSynthesisEvent extends Event {
  val charIndex: Double = js.native
  val elapsedTime: Double = js.native
  val name: java.lang.String = js.native
  val utterance: SpeechSynthesisUtterance = js.native
}

