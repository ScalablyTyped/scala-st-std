package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWheelEvent extends MouseEvent {
  var wheelDelta: Double
  var wheelDeltaX: Double
  var wheelDeltaY: Double
  def initMouseWheelEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    buttonArg: Double,
    relatedTargetArg: EventTarget,
    modifiersListArg: java.lang.String,
    wheelDeltaArg: Double
  ): Unit
}

object MouseWheelEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    altKey: scala.Boolean,
    bubbles: scala.Boolean,
    button: Double,
    buttons: Double,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: scala.Boolean,
    currentTarget: EventTarget,
    defaultPrevented: scala.Boolean,
    detail: Double,
    eventPhase: Double,
    fromElement: Element,
    getModifierState: java.lang.String => scala.Boolean,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    initMouseEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double, Double, Double, Double, Double, scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean, Double, EventTarget) => Unit,
    initMouseWheelEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double, Double, Double, Double, Double, Double, EventTarget, java.lang.String, Double) => Unit,
    initUIEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double) => Unit,
    isTrusted: scala.Boolean,
    layerX: Double,
    layerY: Double,
    metaKey: scala.Boolean,
    movementX: Double,
    movementY: Double,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    preventDefault: () => Unit,
    relatedTarget: EventTarget,
    returnValue: scala.Boolean,
    screenX: Double,
    screenY: Double,
    shiftKey: scala.Boolean,
    srcElement: Element,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    toElement: Element,
    `type`: java.lang.String,
    view: Window,
    wheelDelta: Double,
    wheelDeltaX: Double,
    wheelDeltaY: Double,
    which: Double,
    x: Double,
    y: Double
  ): MouseWheelEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], fromElement = fromElement.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), initEvent = js.Any.fromFunction3(initEvent), initMouseEvent = js.Any.fromFunction15(initMouseEvent), initMouseWheelEvent = js.Any.fromFunction13(initMouseWheelEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), isTrusted = isTrusted.asInstanceOf[js.Any], layerX = layerX.asInstanceOf[js.Any], layerY = layerY.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], wheelDelta = wheelDelta.asInstanceOf[js.Any], wheelDeltaX = wheelDeltaX.asInstanceOf[js.Any], wheelDeltaY = wheelDeltaY.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelEvent]
  }
  @scala.inline
  implicit class MouseWheelEventOps[Self <: MouseWheelEvent] (val x: Self) extends AnyVal {
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
    def setInitMouseWheelEvent(
      value: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double, Double, Double, Double, Double, Double, EventTarget, java.lang.String, Double) => Unit
    ): Self = this.set("initMouseWheelEvent", js.Any.fromFunction13(value))
    @scala.inline
    def setWheelDelta(value: Double): Self = this.set("wheelDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def setWheelDeltaX(value: Double): Self = this.set("wheelDeltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def setWheelDeltaY(value: Double): Self = this.set("wheelDeltaY", value.asInstanceOf[js.Any])
  }
  
}

