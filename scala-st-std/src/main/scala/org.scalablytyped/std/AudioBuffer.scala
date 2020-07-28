package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

