package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSPointerEvent extends MouseEvent {
  val currentPoint: js.Any
  val height: Double
  val hwTimestamp: Double
  val intermediatePoints: js.Any
  val isPrimary: scala.Boolean
  val pointerId: Double
  val pointerType: js.Any
  val pressure: Double
  val rotation: Double
  val tiltX: Double
  val tiltY: Double
  val width: Double
  def getCurrentPoint(element: Element): Unit
  def getIntermediatePoints(element: Element): Unit
  def initPointerEvent(
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
    relatedTargetArg: EventTarget,
    offsetXArg: Double,
    offsetYArg: Double,
    widthArg: Double,
    heightArg: Double,
    pressure: Double,
    rotation: Double,
    tiltX: Double,
    tiltY: Double,
    pointerIdArg: Double,
    pointerType: js.Any,
    hwTimestampArg: Double,
    isPrimary: scala.Boolean
  ): Unit
}

object MSPointerEvent {
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
    currentPoint: js.Any,
    currentTarget: EventTarget,
    defaultPrevented: scala.Boolean,
    detail: Double,
    eventPhase: Double,
    fromElement: Element,
    getCurrentPoint: Element => Unit,
    getIntermediatePoints: Element => Unit,
    getModifierState: java.lang.String => scala.Boolean,
    height: Double,
    hwTimestamp: Double,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    initMouseEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double, Double, Double, Double, Double, scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean, Double, EventTarget) => Unit,
    initUIEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double) => Unit,
    intermediatePoints: js.Any,
    isPrimary: scala.Boolean,
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
    pointerId: Double,
    pointerType: js.Any,
    pressure: Double,
    preventDefault: () => Unit,
    relatedTarget: EventTarget,
    returnValue: scala.Boolean,
    rotation: Double,
    screenX: Double,
    screenY: Double,
    shiftKey: scala.Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    tiltX: Double,
    tiltY: Double,
    timeStamp: Double,
    toElement: Element,
    `type`: java.lang.String,
    view: Window,
    which: Double,
    width: Double,
    x: Double,
    y: Double
  ): MSPointerEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentPoint = currentPoint.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], fromElement = fromElement.asInstanceOf[js.Any], getCurrentPoint = js.Any.fromFunction1(getCurrentPoint), getIntermediatePoints = js.Any.fromFunction1(getIntermediatePoints), getModifierState = js.Any.fromFunction1(getModifierState), height = height.asInstanceOf[js.Any], hwTimestamp = hwTimestamp.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initMouseEvent = js.Any.fromFunction15(initMouseEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), intermediatePoints = intermediatePoints.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], isTrusted = isTrusted.asInstanceOf[js.Any], layerX = layerX.asInstanceOf[js.Any], layerY = layerY.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSPointerEvent]
  }
  @scala.inline
  implicit class MSPointerEventOps[Self <: MSPointerEvent] (val x: Self) extends AnyVal {
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
    def setCurrentPoint(value: js.Any): Self = this.set("currentPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCurrentPoint(value: Element => Unit): Self = this.set("getCurrentPoint", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIntermediatePoints(value: Element => Unit): Self = this.set("getIntermediatePoints", js.Any.fromFunction1(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHwTimestamp(value: Double): Self = this.set("hwTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntermediatePoints(value: js.Any): Self = this.set("intermediatePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPrimary(value: scala.Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerId(value: Double): Self = this.set("pointerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerType(value: js.Any): Self = this.set("pointerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPressure(value: Double): Self = this.set("pressure", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiltX(value: Double): Self = this.set("tiltX", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiltY(value: Double): Self = this.set("tiltY", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

