package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionEvent extends Event {
  var elapsedTime: Double
  var propertyName: java.lang.String
  def initTransitionEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    propertyNameArg: java.lang.String,
    elapsedTimeArg: Double
  ): Unit
}

object TransitionEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: EventTarget,
    defaultPrevented: scala.Boolean,
    elapsedTime: Double,
    eventPhase: Double,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    initTransitionEvent: (java.lang.String, scala.Boolean, scala.Boolean, java.lang.String, Double) => Unit,
    isTrusted: scala.Boolean,
    preventDefault: () => Unit,
    propertyName: java.lang.String,
    returnValue: scala.Boolean,
    srcElement: Element,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String
  ): TransitionEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initTransitionEvent = js.Any.fromFunction5(initTransitionEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), propertyName = propertyName.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEvent]
  }
  @scala.inline
  implicit class TransitionEventOps[Self <: TransitionEvent] (val x: Self) extends AnyVal {
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
    def setElapsedTime(value: Double): Self = this.set("elapsedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitTransitionEvent(value: (java.lang.String, scala.Boolean, scala.Boolean, java.lang.String, Double) => Unit): Self = this.set("initTransitionEvent", js.Any.fromFunction5(value))
    @scala.inline
    def setPropertyName(value: java.lang.String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
  }
  
}

