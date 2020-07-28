package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMotionEvent extends Event {
  var acceleration: DeviceAcceleration
  var accelerationIncludingGravity: DeviceAcceleration
  var interval: Double
  var rotationRate: DeviceRotationRate
  def initDeviceMotionEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    acceleration: DeviceAccelerationDict,
    accelerationIncludingGravity: DeviceAccelerationDict,
    rotationRate: DeviceRotationRateDict,
    interval: Double
  ): Unit
}

object DeviceMotionEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    acceleration: DeviceAcceleration,
    accelerationIncludingGravity: DeviceAcceleration,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: EventTarget,
    defaultPrevented: scala.Boolean,
    eventPhase: Double,
    initDeviceMotionEvent: (java.lang.String, scala.Boolean, scala.Boolean, DeviceAccelerationDict, DeviceAccelerationDict, DeviceRotationRateDict, Double) => Unit,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    interval: Double,
    isTrusted: scala.Boolean,
    preventDefault: () => Unit,
    returnValue: scala.Boolean,
    rotationRate: DeviceRotationRate,
    srcElement: Element,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String
  ): DeviceMotionEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], acceleration = acceleration.asInstanceOf[js.Any], accelerationIncludingGravity = accelerationIncludingGravity.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initDeviceMotionEvent = js.Any.fromFunction7(initDeviceMotionEvent), initEvent = js.Any.fromFunction3(initEvent), interval = interval.asInstanceOf[js.Any], isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], rotationRate = rotationRate.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMotionEvent]
  }
  @scala.inline
  implicit class DeviceMotionEventOps[Self <: DeviceMotionEvent] (val x: Self) extends AnyVal {
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
    def setAcceleration(value: DeviceAcceleration): Self = this.set("acceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccelerationIncludingGravity(value: DeviceAcceleration): Self = this.set("accelerationIncludingGravity", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitDeviceMotionEvent(
      value: (java.lang.String, scala.Boolean, scala.Boolean, DeviceAccelerationDict, DeviceAccelerationDict, DeviceRotationRateDict, Double) => Unit
    ): Self = this.set("initDeviceMotionEvent", js.Any.fromFunction7(value))
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotationRate(value: DeviceRotationRate): Self = this.set("rotationRate", value.asInstanceOf[js.Any])
  }
  
}

