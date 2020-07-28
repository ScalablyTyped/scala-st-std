package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSAudioRecvSignal extends js.Object {
  var initialSignalLevelRMS: js.UndefOr[Double] = js.undefined
  var recvNoiseLevelCh1: js.UndefOr[Double] = js.undefined
  var recvSignalLevelCh1: js.UndefOr[Double] = js.undefined
  var renderLoopbackSignalLevel: js.UndefOr[Double] = js.undefined
  var renderNoiseLevel: js.UndefOr[Double] = js.undefined
  var renderSignalLevel: js.UndefOr[Double] = js.undefined
}

object MSAudioRecvSignal {
  @scala.inline
  def apply(): MSAudioRecvSignal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSAudioRecvSignal]
  }
  @scala.inline
  implicit class MSAudioRecvSignalOps[Self <: MSAudioRecvSignal] (val x: Self) extends AnyVal {
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
    def setInitialSignalLevelRMS(value: Double): Self = this.set("initialSignalLevelRMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSignalLevelRMS: Self = this.set("initialSignalLevelRMS", js.undefined)
    @scala.inline
    def setRecvNoiseLevelCh1(value: Double): Self = this.set("recvNoiseLevelCh1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvNoiseLevelCh1: Self = this.set("recvNoiseLevelCh1", js.undefined)
    @scala.inline
    def setRecvSignalLevelCh1(value: Double): Self = this.set("recvSignalLevelCh1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecvSignalLevelCh1: Self = this.set("recvSignalLevelCh1", js.undefined)
    @scala.inline
    def setRenderLoopbackSignalLevel(value: Double): Self = this.set("renderLoopbackSignalLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderLoopbackSignalLevel: Self = this.set("renderLoopbackSignalLevel", js.undefined)
    @scala.inline
    def setRenderNoiseLevel(value: Double): Self = this.set("renderNoiseLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderNoiseLevel: Self = this.set("renderNoiseLevel", js.undefined)
    @scala.inline
    def setRenderSignalLevel(value: Double): Self = this.set("renderSignalLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderSignalLevel: Self = this.set("renderSignalLevel", js.undefined)
  }
  
}

