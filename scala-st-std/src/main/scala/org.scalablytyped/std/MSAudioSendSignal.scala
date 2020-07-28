package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSAudioSendSignal extends js.Object {
  var noiseLevel: js.UndefOr[Double] = js.undefined
  var sendNoiseLevelCh1: js.UndefOr[Double] = js.undefined
  var sendSignalLevelCh1: js.UndefOr[Double] = js.undefined
}

object MSAudioSendSignal {
  @scala.inline
  def apply(): MSAudioSendSignal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSAudioSendSignal]
  }
  @scala.inline
  implicit class MSAudioSendSignalOps[Self <: MSAudioSendSignal] (val x: Self) extends AnyVal {
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
    def setNoiseLevel(value: Double): Self = this.set("noiseLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoiseLevel: Self = this.set("noiseLevel", js.undefined)
    @scala.inline
    def setSendNoiseLevelCh1(value: Double): Self = this.set("sendNoiseLevelCh1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendNoiseLevelCh1: Self = this.set("sendNoiseLevelCh1", js.undefined)
    @scala.inline
    def setSendSignalLevelCh1(value: Double): Self = this.set("sendSignalLevelCh1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendSignalLevelCh1: Self = this.set("sendSignalLevelCh1", js.undefined)
  }
  
}

