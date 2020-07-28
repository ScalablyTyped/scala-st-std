package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OscillatorNode extends AudioScheduledSourceNode {
  val detune: AudioParam = js.native
  val frequency: AudioParam = js.native
  var `type`: OscillatorType = js.native
  def setPeriodicWave(periodicWave: PeriodicWave): Unit = js.native
}

