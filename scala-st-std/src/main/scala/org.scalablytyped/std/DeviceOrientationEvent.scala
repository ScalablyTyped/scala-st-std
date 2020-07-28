package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOrientationEvent extends Event {
  var absolute: scala.Boolean
  var alpha: Double
  var beta: Double
  var gamma: Double
  def initDeviceOrientationEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    alpha: Double,
    beta: Double,
    gamma: Double,
    absolute: scala.Boolean
  ): Unit
}

object DeviceOrientationEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    absolute: scala.Boolean,
    alpha: Double,
    beta: Double,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: EventTarget,
    defaultPrevented: scala.Boolean,
    eventPhase: Double,
    gamma: Double,
    initDeviceOrientationEvent: (java.lang.String, scala.Boolean, scala.Boolean, Double, Double, Double, scala.Boolean) => Unit,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    isTrusted: scala.Boolean,
    preventDefault: () => Unit,
    returnValue: scala.Boolean,
    srcElement: Element,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String
  ): DeviceOrientationEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], absolute = absolute.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any], initDeviceOrientationEvent = js.Any.fromFunction7(initDeviceOrientationEvent), initEvent = js.Any.fromFunction3(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOrientationEvent]
  }
  @scala.inline
  implicit class DeviceOrientationEventOps[Self <: DeviceOrientationEvent] (val x: Self) extends AnyVal {
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
    def setAbsolute(value: scala.Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeta(value: Double): Self = this.set("beta", value.asInstanceOf[js.Any])
    @scala.inline
    def setGamma(value: Double): Self = this.set("gamma", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitDeviceOrientationEvent(
      value: (java.lang.String, scala.Boolean, scala.Boolean, Double, Double, Double, scala.Boolean) => Unit
    ): Self = this.set("initDeviceOrientationEvent", js.Any.fromFunction7(value))
  }
  
}

