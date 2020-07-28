package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioNode extends EventTarget {
  var channelCount: Double = js.native
  var channelCountMode: ChannelCountMode = js.native
  var channelInterpretation: ChannelInterpretation = js.native
  val context: AudioContext = js.native
  val numberOfInputs: Double = js.native
  val numberOfOutputs: Double = js.native
  def connect(destination: AudioNode): AudioNode = js.native
  def connect(destination: AudioNode, output: js.UndefOr[scala.Nothing], input: Double): AudioNode = js.native
  def connect(destination: AudioNode, output: Double): AudioNode = js.native
  def connect(destination: AudioNode, output: Double, input: Double): AudioNode = js.native
  def connect(destination: AudioParam): Unit = js.native
  def connect(destination: AudioParam, output: Double): Unit = js.native
  def disconnect(): Unit = js.native
  def disconnect(destination: AudioNode): Unit = js.native
  def disconnect(destination: AudioNode, output: Double): Unit = js.native
  def disconnect(destination: AudioNode, output: Double, input: Double): Unit = js.native
  def disconnect(destination: AudioParam): Unit = js.native
  def disconnect(destination: AudioParam, output: Double): Unit = js.native
  def disconnect(output: Double): Unit = js.native
}

