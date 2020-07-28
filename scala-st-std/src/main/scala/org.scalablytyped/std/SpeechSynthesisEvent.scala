package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechSynthesisEvent extends Event {
  val charIndex: Double = js.native
  val elapsedTime: Double = js.native
  val name: java.lang.String = js.native
  val utterance: SpeechSynthesisUtterance = js.native
}

