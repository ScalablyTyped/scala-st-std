package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSManipulationEvent extends UIEvent {
  var MS_MANIPULATION_STATE_ACTIVE: Double
  var MS_MANIPULATION_STATE_CANCELLED: Double
  var MS_MANIPULATION_STATE_COMMITTED: Double
  var MS_MANIPULATION_STATE_DRAGGING: Double
  var MS_MANIPULATION_STATE_INERTIA: Double
  var MS_MANIPULATION_STATE_PRESELECT: Double
  var MS_MANIPULATION_STATE_SELECTING: Double
  var MS_MANIPULATION_STATE_STOPPED: Double
  var currentState: Double
  var inertiaDestinationX: Double
  var inertiaDestinationY: Double
  var lastState: Double
  def initMSManipulationEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    lastState: Double,
    currentState: Double
  ): Unit
}

object MSManipulationEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    MS_MANIPULATION_STATE_ACTIVE: Double,
    MS_MANIPULATION_STATE_CANCELLED: Double,
    MS_MANIPULATION_STATE_COMMITTED: Double,
    MS_MANIPULATION_STATE_DRAGGING: Double,
    MS_MANIPULATION_STATE_INERTIA: Double,
    MS_MANIPULATION_STATE_PRESELECT: Double,
    MS_MANIPULATION_STATE_SELECTING: Double,
    MS_MANIPULATION_STATE_STOPPED: Double,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    currentState: Double,
    currentTarget: EventTarget,
    defaultPrevented: scala.Boolean,
    detail: Double,
    eventPhase: Double,
    inertiaDestinationX: Double,
    inertiaDestinationY: Double,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    initMSManipulationEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double, Double, Double) => Unit,
    initUIEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double) => Unit,
    isTrusted: scala.Boolean,
    lastState: Double,
    preventDefault: () => Unit,
    returnValue: scala.Boolean,
    srcElement: Element,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String,
    view: Window
  ): MSManipulationEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], MS_MANIPULATION_STATE_ACTIVE = MS_MANIPULATION_STATE_ACTIVE.asInstanceOf[js.Any], MS_MANIPULATION_STATE_CANCELLED = MS_MANIPULATION_STATE_CANCELLED.asInstanceOf[js.Any], MS_MANIPULATION_STATE_COMMITTED = MS_MANIPULATION_STATE_COMMITTED.asInstanceOf[js.Any], MS_MANIPULATION_STATE_DRAGGING = MS_MANIPULATION_STATE_DRAGGING.asInstanceOf[js.Any], MS_MANIPULATION_STATE_INERTIA = MS_MANIPULATION_STATE_INERTIA.asInstanceOf[js.Any], MS_MANIPULATION_STATE_PRESELECT = MS_MANIPULATION_STATE_PRESELECT.asInstanceOf[js.Any], MS_MANIPULATION_STATE_SELECTING = MS_MANIPULATION_STATE_SELECTING.asInstanceOf[js.Any], MS_MANIPULATION_STATE_STOPPED = MS_MANIPULATION_STATE_STOPPED.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentState = currentState.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], inertiaDestinationX = inertiaDestinationX.asInstanceOf[js.Any], inertiaDestinationY = inertiaDestinationY.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initMSManipulationEvent = js.Any.fromFunction7(initMSManipulationEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), isTrusted = isTrusted.asInstanceOf[js.Any], lastState = lastState.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSManipulationEvent]
  }
  @scala.inline
  implicit class MSManipulationEventOps[Self <: MSManipulationEvent] (val x: Self) extends AnyVal {
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
    def setMS_MANIPULATION_STATE_ACTIVE(value: Double): Self = this.set("MS_MANIPULATION_STATE_ACTIVE", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS_MANIPULATION_STATE_CANCELLED(value: Double): Self = this.set("MS_MANIPULATION_STATE_CANCELLED", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS_MANIPULATION_STATE_COMMITTED(value: Double): Self = this.set("MS_MANIPULATION_STATE_COMMITTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS_MANIPULATION_STATE_DRAGGING(value: Double): Self = this.set("MS_MANIPULATION_STATE_DRAGGING", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS_MANIPULATION_STATE_INERTIA(value: Double): Self = this.set("MS_MANIPULATION_STATE_INERTIA", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS_MANIPULATION_STATE_PRESELECT(value: Double): Self = this.set("MS_MANIPULATION_STATE_PRESELECT", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS_MANIPULATION_STATE_SELECTING(value: Double): Self = this.set("MS_MANIPULATION_STATE_SELECTING", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS_MANIPULATION_STATE_STOPPED(value: Double): Self = this.set("MS_MANIPULATION_STATE_STOPPED", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentState(value: Double): Self = this.set("currentState", value.asInstanceOf[js.Any])
    @scala.inline
    def setInertiaDestinationX(value: Double): Self = this.set("inertiaDestinationX", value.asInstanceOf[js.Any])
    @scala.inline
    def setInertiaDestinationY(value: Double): Self = this.set("inertiaDestinationY", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitMSManipulationEvent(value: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double, Double, Double) => Unit): Self = this.set("initMSManipulationEvent", js.Any.fromFunction7(value))
    @scala.inline
    def setLastState(value: Double): Self = this.set("lastState", value.asInstanceOf[js.Any])
  }
  
}

