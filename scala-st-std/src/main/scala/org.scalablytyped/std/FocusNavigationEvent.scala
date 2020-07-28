package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusNavigationEvent extends Event {
  val navigationReason: java.lang.String
  val originHeight: Double
  val originLeft: Double
  val originTop: Double
  val originWidth: Double
  def requestFocus(): Unit
}

object FocusNavigationEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: EventTarget,
    deepPath: () => js.Array[EventTarget],
    defaultPrevented: scala.Boolean,
    eventPhase: Double,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    isTrusted: scala.Boolean,
    navigationReason: java.lang.String,
    originHeight: Double,
    originLeft: Double,
    originTop: Double,
    originWidth: Double,
    preventDefault: () => Unit,
    requestFocus: () => Unit,
    returnValue: scala.Boolean,
    scoped: scala.Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String
  ): FocusNavigationEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], deepPath = js.Any.fromFunction0(deepPath), defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], navigationReason = navigationReason.asInstanceOf[js.Any], originHeight = originHeight.asInstanceOf[js.Any], originLeft = originLeft.asInstanceOf[js.Any], originTop = originTop.asInstanceOf[js.Any], originWidth = originWidth.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), requestFocus = js.Any.fromFunction0(requestFocus), returnValue = returnValue.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusNavigationEvent]
  }
  @scala.inline
  implicit class FocusNavigationEventOps[Self <: FocusNavigationEvent] (val x: Self) extends AnyVal {
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
    def setNavigationReason(value: java.lang.String): Self = this.set("navigationReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginHeight(value: Double): Self = this.set("originHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginLeft(value: Double): Self = this.set("originLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginTop(value: Double): Self = this.set("originTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginWidth(value: Double): Self = this.set("originWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestFocus(value: () => Unit): Self = this.set("requestFocus", js.Any.fromFunction0(value))
  }
  
}

