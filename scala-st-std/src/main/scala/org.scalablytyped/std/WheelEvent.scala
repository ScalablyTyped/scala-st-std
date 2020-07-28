package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelEvent extends MouseEvent {
  var DOM_DELTA_LINE: Double
  var DOM_DELTA_PAGE: Double
  var DOM_DELTA_PIXEL: Double
  var deltaMode: Double
  var deltaX: Double
  var deltaY: Double
  var deltaZ: Double
  def getCurrentPoint(element: Element): Unit
  def initWheelEvent(
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
    deltaXArg: Double,
    deltaYArg: Double,
    deltaZArg: Double,
    deltaMode: Double
  ): Unit
}

object WheelEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    DOM_DELTA_LINE: Double,
    DOM_DELTA_PAGE: Double,
    DOM_DELTA_PIXEL: Double,
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
    deltaMode: Double,
    deltaX: Double,
    deltaY: Double,
    deltaZ: Double,
    detail: Double,
    eventPhase: Double,
    fromElement: Element,
    getCurrentPoint: Element => Unit,
    getModifierState: java.lang.String => scala.Boolean,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    initMouseEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double, Double, Double, Double, Double, scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean, Double, EventTarget) => Unit,
    initUIEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double) => Unit,
    initWheelEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double, Double, Double, Double, Double, Double, EventTarget, java.lang.String, Double, Double, Double, Double) => Unit,
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
    which: Double,
    x: Double,
    y: Double
  ): WheelEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], DOM_DELTA_LINE = DOM_DELTA_LINE.asInstanceOf[js.Any], DOM_DELTA_PAGE = DOM_DELTA_PAGE.asInstanceOf[js.Any], DOM_DELTA_PIXEL = DOM_DELTA_PIXEL.asInstanceOf[js.Any], altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], deltaMode = deltaMode.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], deltaZ = deltaZ.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], fromElement = fromElement.asInstanceOf[js.Any], getCurrentPoint = js.Any.fromFunction1(getCurrentPoint), getModifierState = js.Any.fromFunction1(getModifierState), initEvent = js.Any.fromFunction3(initEvent), initMouseEvent = js.Any.fromFunction15(initMouseEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), initWheelEvent = js.Any.fromFunction16(initWheelEvent), isTrusted = isTrusted.asInstanceOf[js.Any], layerX = layerX.asInstanceOf[js.Any], layerY = layerY.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelEvent]
  }
  @scala.inline
  implicit class WheelEventOps[Self <: WheelEvent] (val x: Self) extends AnyVal {
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
    def setDOM_DELTA_LINE(value: Double): Self = this.set("DOM_DELTA_LINE", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_DELTA_PAGE(value: Double): Self = this.set("DOM_DELTA_PAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_DELTA_PIXEL(value: Double): Self = this.set("DOM_DELTA_PIXEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaMode(value: Double): Self = this.set("deltaMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaZ(value: Double): Self = this.set("deltaZ", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCurrentPoint(value: Element => Unit): Self = this.set("getCurrentPoint", js.Any.fromFunction1(value))
    @scala.inline
    def setInitWheelEvent(
      value: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double, Double, Double, Double, Double, Double, EventTarget, java.lang.String, Double, Double, Double, Double) => Unit
    ): Self = this.set("initWheelEvent", js.Any.fromFunction16(value))
  }
  
}

