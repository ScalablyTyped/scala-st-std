package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Objects of these types are designed to hold small audio snippets, typically less than 45 s. For longer sounds, objects implementing the MediaElementAudioSourceNode are more suitable. The buffer contains data in the following format:  non-interleaved IEEE754 32-bit linear PCM with a nominal range between -1 and +1, that is, 32bits floating point buffer, with each samples between -1.0 and 1.0. If the AudioBuffer has multiple channels, they are stored in separate buffer. */
@js.native
trait AudioBuffer extends js.Object {
  val duration: Double = js.native
  val length: Double = js.native
  val numberOfChannels: Double = js.native
  val sampleRate: Double = js.native
  def copyFromChannel(destination: Float32Array, channelNumber: Double): Unit = js.native
  def copyFromChannel(destination: Float32Array, channelNumber: Double, startInChannel: Double): Unit = js.native
  def copyToChannel(source: Float32Array, channelNumber: Double): Unit = js.native
  def copyToChannel(source: Float32Array, channelNumber: Double, startInChannel: Double): Unit = js.native
  def getChannelData(channel: Double): Float32Array = js.native
}

