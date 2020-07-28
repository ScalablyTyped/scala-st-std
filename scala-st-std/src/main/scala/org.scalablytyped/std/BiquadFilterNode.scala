package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BiquadFilterNode extends AudioNode {
  var Q: AudioParam = js.native
  var detune: AudioParam = js.native
  var frequency: AudioParam = js.native
  var gain: AudioParam = js.native
  var `type`: java.lang.String = js.native
  def getFrequencyResponse(frequencyHz: Float32Array, magResponse: Float32Array, phaseResponse: Float32Array): Unit = js.native
}

