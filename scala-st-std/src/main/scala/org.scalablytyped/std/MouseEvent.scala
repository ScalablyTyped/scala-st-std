package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEvent extends UIEvent {
  var altKey: scala.Boolean
  var button: Double
  var buttons: Double
  var clientX: Double
  var clientY: Double
  var ctrlKey: scala.Boolean
  var fromElement: Element
  var layerX: Double
  var layerY: Double
  var metaKey: scala.Boolean
  var movementX: Double
  var movementY: Double
  var offsetX: Double
  var offsetY: Double
  var pageX: Double
  var pageY: Double
  var relatedTarget: EventTarget
  var screenX: Double
  var screenY: Double
  var shiftKey: scala.Boolean
  var toElement: Element
  var which: Double
  var x: Double
  var y: Double
  def getModifierState(keyArg: java.lang.String): scala.Boolean
  def initMouseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: Double,
    relatedTargetArg: EventTarget
  ): Unit
}

object MouseEvent {
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
    which: Double,
    x: Double,
    y: Double
  ): MouseEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], fromElement = fromElement.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), initEvent = js.Any.fromFunction3(initEvent), initMouseEvent = js.Any.fromFunction15(initMouseEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), isTrusted = isTrusted.asInstanceOf[js.Any], layerX = layerX.asInstanceOf[js.Any], layerY = layerY.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvent]
  }
  @scala.inline
  implicit class MouseEventOps[Self <: MouseEvent] (val x: Self) extends AnyVal {
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
    def setAltKey(value: scala.Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setButton(value: Double): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtons(value: Double): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtrlKey(value: scala.Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromElement(value: Element): Self = this.set("fromElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetModifierState(value: java.lang.String => scala.Boolean): Self = this.set("getModifierState", js.Any.fromFunction1(value))
    @scala.inline
    def setInitMouseEvent(
      value: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double, Double, Double, Double, Double, scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean, Double, EventTarget) => Unit
    ): Self = this.set("initMouseEvent", js.Any.fromFunction15(value))
    @scala.inline
    def setLayerX(value: Double): Self = this.set("layerX", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayerY(value: Double): Self = this.set("layerY", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaKey(value: scala.Boolean): Self = this.set("metaKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMovementX(value: Double): Self = this.set("movementX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMovementY(value: Double): Self = this.set("movementY", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedTarget(value: EventTarget): Self = this.set("relatedTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenX(value: Double): Self = this.set("screenX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenY(value: Double): Self = this.set("screenY", value.asInstanceOf[js.Any])
    @scala.inline
    def setShiftKey(value: scala.Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setToElement(value: Element): Self = this.set("toElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhich(value: Double): Self = this.set("which", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

