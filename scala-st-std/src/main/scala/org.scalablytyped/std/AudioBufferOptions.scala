package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioBufferOptions extends js.Object {
  var length: Double
  var numberOfChannels: js.UndefOr[Double] = js.undefined
  var sampleRate: Double
}

object AudioBufferOptions {
  @scala.inline
  def apply(length: Double, sampleRate: Double): AudioBufferOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBufferOptions]
  }
  @scala.inline
  implicit class AudioBufferOptionsOps[Self <: AudioBufferOptions] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfChannels(value: Double): Self = this.set("numberOfChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfChannels: Self = this.set("numberOfChannels", js.undefined)
  }
  
}

