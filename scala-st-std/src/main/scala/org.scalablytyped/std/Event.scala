package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var AT_TARGET: Double
  var BUBBLING_PHASE: Double
  var CAPTURING_PHASE: Double
  var bubbles: scala.Boolean
  var cancelBubble: scala.Boolean
  var cancelable: scala.Boolean
  var currentTarget: EventTarget
  var defaultPrevented: scala.Boolean
  var eventPhase: Double
  var isTrusted: scala.Boolean
  var returnValue: scala.Boolean
  var srcElement: Element
  var target: EventTarget
  var timeStamp: Double
  var `type`: java.lang.String
  def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): Unit
  def preventDefault(): Unit
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
}

object Event {
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
    eventPhase: Double,
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
  ): Event = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setAT_TARGET(value: Double): Self = this.set("AT_TARGET", value.asInstanceOf[js.Any])
    @scala.inline
    def setBUBBLING_PHASE(value: Double): Self = this.set("BUBBLING_PHASE", value.asInstanceOf[js.Any])
    @scala.inline
    def setCAPTURING_PHASE(value: Double): Self = this.set("CAPTURING_PHASE", value.asInstanceOf[js.Any])
    @scala.inline
    def setBubbles(value: scala.Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelBubble(value: scala.Boolean): Self = this.set("cancelBubble", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelable(value: scala.Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTarget(value: EventTarget): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultPrevented(value: scala.Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventPhase(value: Double): Self = this.set("eventPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitEvent(value: (java.lang.String, scala.Boolean, scala.Boolean) => Unit): Self = this.set("initEvent", js.Any.fromFunction3(value))
    @scala.inline
    def setIsTrusted(value: scala.Boolean): Self = this.set("isTrusted", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setReturnValue(value: scala.Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcElement(value: Element): Self = this.set("srcElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopImmediatePropagation(value: () => Unit): Self = this.set("stopImmediatePropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setTarget(value: EventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

