package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEvent extends Event {
  var detail: js.Any
  def initCustomEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    detailArg: js.Any
  ): Unit
}

object CustomEvent {
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
    detail: js.Any,
    eventPhase: Double,
    initCustomEvent: (java.lang.String, scala.Boolean, scala.Boolean, js.Any) => Unit,
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
  ): CustomEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initCustomEvent = js.Any.fromFunction4(initCustomEvent), initEvent = js.Any.fromFunction3(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEvent]
  }
  @scala.inline
  implicit class CustomEventOps[Self <: CustomEvent] (val x: Self) extends AnyVal {
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
    def setDetail(value: js.Any): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitCustomEvent(value: (java.lang.String, scala.Boolean, scala.Boolean, js.Any) => Unit): Self = this.set("initCustomEvent", js.Any.fromFunction4(value))
  }
  
}

