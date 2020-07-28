package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BiquadFilterNode extends AudioNode {
  val Q: AudioParam = js.native
  val detune: AudioParam = js.native
  val frequency: AudioParam = js.native
  val gain: AudioParam = js.native
  var `type`: java.lang.String = js.native
  def getFrequencyResponse(frequencyHz: Float32Array, magResponse: Float32Array, phaseResponse: Float32Array): Unit = js.native
}

