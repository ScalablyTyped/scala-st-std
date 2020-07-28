package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyserNode extends AudioNode {
  var fftSize: Double = js.native
  var frequencyBinCount: Double = js.native
  var maxDecibels: Double = js.native
  var minDecibels: Double = js.native
  var smoothingTimeConstant: Double = js.native
  def getByteFrequencyData(array: Uint8Array): Unit = js.native
  def getByteTimeDomainData(array: Uint8Array): Unit = js.native
  def getFloatFrequencyData(array: Float32Array): Unit = js.native
  def getFloatTimeDomainData(array: Float32Array): Unit = js.native
}

