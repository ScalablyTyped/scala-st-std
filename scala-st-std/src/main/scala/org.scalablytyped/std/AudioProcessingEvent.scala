package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioProcessingEvent extends Event {
  val inputBuffer: AudioBuffer = js.native
  val outputBuffer: AudioBuffer = js.native
  val playbackTime: Double = js.native
}

