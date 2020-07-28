package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- `org.scalablytyped`.std.MSLocalClientEvent because Already inherited */ trait MSAudioLocalClientEvent extends MSLocalClientEventBase {
  var cpuInsufficientEventRatio: js.UndefOr[Double] = js.undefined
  var deviceCaptureNotFunctioningEventRatio: js.UndefOr[Double] = js.undefined
  var deviceClippingEventRatio: js.UndefOr[Double] = js.undefined
  var deviceEchoEventRatio: js.UndefOr[Double] = js.undefined
  var deviceGlitchesEventRatio: js.UndefOr[Double] = js.undefined
  var deviceHalfDuplexAECEventRatio: js.UndefOr[Double] = js.undefined
  var deviceHowlingEventCount: js.UndefOr[Double] = js.undefined
  var deviceLowSNREventRatio: js.UndefOr[Double] = js.undefined
  var deviceLowSpeechLevelEventRatio: js.UndefOr[Double] = js.undefined
  var deviceMultipleEndpointsEventCount: js.UndefOr[Double] = js.undefined
  var deviceNearEndToEchoRatioEventRatio: js.UndefOr[Double] = js.undefined
  var deviceRenderMuteEventRatio: js.UndefOr[Double] = js.undefined
  var deviceRenderNotFunctioningEventRatio: js.UndefOr[Double] = js.undefined
  var deviceRenderZeroVolumeEventRatio: js.UndefOr[Double] = js.undefined
  var networkDelayEventRatio: js.UndefOr[Double] = js.undefined
  var networkSendQualityEventRatio: js.UndefOr[Double] = js.undefined
}

object MSAudioLocalClientEvent {
  @scala.inline
  def apply(): MSAudioLocalClientEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSAudioLocalClientEvent]
  }
  @scala.inline
  implicit class MSAudioLocalClientEventOps[Self <: MSAudioLocalClientEvent] (val x: Self) extends AnyVal {
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
    def setCpuInsufficientEventRatio(value: Double): Self = this.set("cpuInsufficientEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuInsufficientEventRatio: Self = this.set("cpuInsufficientEventRatio", js.undefined)
    @scala.inline
    def setDeviceCaptureNotFunctioningEventRatio(value: Double): Self = this.set("deviceCaptureNotFunctioningEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCaptureNotFunctioningEventRatio: Self = this.set("deviceCaptureNotFunctioningEventRatio", js.undefined)
    @scala.inline
    def setDeviceClippingEventRatio(value: Double): Self = this.set("deviceClippingEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceClippingEventRatio: Self = this.set("deviceClippingEventRatio", js.undefined)
    @scala.inline
    def setDeviceEchoEventRatio(value: Double): Self = this.set("deviceEchoEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceEchoEventRatio: Self = this.set("deviceEchoEventRatio", js.undefined)
    @scala.inline
    def setDeviceGlitchesEventRatio(value: Double): Self = this.set("deviceGlitchesEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceGlitchesEventRatio: Self = this.set("deviceGlitchesEventRatio", js.undefined)
    @scala.inline
    def setDeviceHalfDuplexAECEventRatio(value: Double): Self = this.set("deviceHalfDuplexAECEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceHalfDuplexAECEventRatio: Self = this.set("deviceHalfDuplexAECEventRatio", js.undefined)
    @scala.inline
    def setDeviceHowlingEventCount(value: Double): Self = this.set("deviceHowlingEventCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceHowlingEventCount: Self = this.set("deviceHowlingEventCount", js.undefined)
    @scala.inline
    def setDeviceLowSNREventRatio(value: Double): Self = this.set("deviceLowSNREventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceLowSNREventRatio: Self = this.set("deviceLowSNREventRatio", js.undefined)
    @scala.inline
    def setDeviceLowSpeechLevelEventRatio(value: Double): Self = this.set("deviceLowSpeechLevelEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceLowSpeechLevelEventRatio: Self = this.set("deviceLowSpeechLevelEventRatio", js.undefined)
    @scala.inline
    def setDeviceMultipleEndpointsEventCount(value: Double): Self = this.set("deviceMultipleEndpointsEventCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceMultipleEndpointsEventCount: Self = this.set("deviceMultipleEndpointsEventCount", js.undefined)
    @scala.inline
    def setDeviceNearEndToEchoRatioEventRatio(value: Double): Self = this.set("deviceNearEndToEchoRatioEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceNearEndToEchoRatioEventRatio: Self = this.set("deviceNearEndToEchoRatioEventRatio", js.undefined)
    @scala.inline
    def setDeviceRenderMuteEventRatio(value: Double): Self = this.set("deviceRenderMuteEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceRenderMuteEventRatio: Self = this.set("deviceRenderMuteEventRatio", js.undefined)
    @scala.inline
    def setDeviceRenderNotFunctioningEventRatio(value: Double): Self = this.set("deviceRenderNotFunctioningEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceRenderNotFunctioningEventRatio: Self = this.set("deviceRenderNotFunctioningEventRatio", js.undefined)
    @scala.inline
    def setDeviceRenderZeroVolumeEventRatio(value: Double): Self = this.set("deviceRenderZeroVolumeEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceRenderZeroVolumeEventRatio: Self = this.set("deviceRenderZeroVolumeEventRatio", js.undefined)
    @scala.inline
    def setNetworkDelayEventRatio(value: Double): Self = this.set("networkDelayEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkDelayEventRatio: Self = this.set("networkDelayEventRatio", js.undefined)
    @scala.inline
    def setNetworkSendQualityEventRatio(value: Double): Self = this.set("networkSendQualityEventRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkSendQualityEventRatio: Self = this.set("networkSendQualityEventRatio", js.undefined)
  }
  
}

