package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioBuffer extends js.Object {
  var duration: Double
  var length: Double
  var numberOfChannels: Double
  var sampleRate: Double
  def getChannelData(channel: Double): Float32Array
}

object AudioBuffer {
  @scala.inline
  def apply(
    duration: Double,
    getChannelData: Double => Float32Array,
    length: Double,
    numberOfChannels: Double,
    sampleRate: Double
  ): AudioBuffer = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], getChannelData = js.Any.fromFunction1(getChannelData), length = length.asInstanceOf[js.Any], numberOfChannels = numberOfChannels.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBuffer]
  }
  @scala.inline
  implicit class AudioBufferOps[Self <: AudioBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetChannelData(value: Double => Float32Array): Self = this.set("getChannelData", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfChannels(value: Double): Self = this.set("numberOfChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
  }
  
}

