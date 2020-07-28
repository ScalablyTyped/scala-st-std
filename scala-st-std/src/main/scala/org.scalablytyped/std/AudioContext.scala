package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioContext extends EventTarget {
  var currentTime: Double = js.native
  var destination: AudioDestinationNode = js.native
  var listener: AudioListener = js.native
  var sampleRate: Double = js.native
  var state: java.lang.String = js.native
  def createAnalyser(): AnalyserNode = js.native
  def createBiquadFilter(): BiquadFilterNode = js.native
  def createBuffer(numberOfChannels: Double, length: Double, sampleRate: Double): AudioBuffer = js.native
  def createBufferSource(): AudioBufferSourceNode = js.native
  def createChannelMerger(): ChannelMergerNode = js.native
  def createChannelMerger(numberOfInputs: Double): ChannelMergerNode = js.native
  def createChannelSplitter(): ChannelSplitterNode = js.native
  def createChannelSplitter(numberOfOutputs: Double): ChannelSplitterNode = js.native
  def createConvolver(): ConvolverNode = js.native
  def createDelay(): DelayNode = js.native
  def createDelay(maxDelayTime: Double): DelayNode = js.native
  def createDynamicsCompressor(): DynamicsCompressorNode = js.native
  def createGain(): GainNode = js.native
  def createMediaElementSource(mediaElement: HTMLMediaElement): MediaElementAudioSourceNode = js.native
  def createOscillator(): OscillatorNode = js.native
  def createPanner(): PannerNode = js.native
  def createPeriodicWave(real: Float32Array, imag: Float32Array): PeriodicWave = js.native
  def createScriptProcessor(): ScriptProcessorNode = js.native
  def createScriptProcessor(
    bufferSize: js.UndefOr[scala.Nothing],
    numberOfInputChannels: js.UndefOr[scala.Nothing],
    numberOfOutputChannels: Double
  ): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: js.UndefOr[scala.Nothing], numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(
    bufferSize: js.UndefOr[scala.Nothing],
    numberOfInputChannels: Double,
    numberOfOutputChannels: Double
  ): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(
    bufferSize: Double,
    numberOfInputChannels: js.UndefOr[scala.Nothing],
    numberOfOutputChannels: Double
  ): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createStereoPanner(): StereoPannerNode = js.native
  def createWaveShaper(): WaveShaperNode = js.native
  def decodeAudioData(audioData: ArrayBuffer, successCallback: DecodeSuccessCallback): Unit = js.native
  def decodeAudioData(audioData: ArrayBuffer, successCallback: DecodeSuccessCallback, errorCallback: DecodeErrorCallback): Unit = js.native
}

