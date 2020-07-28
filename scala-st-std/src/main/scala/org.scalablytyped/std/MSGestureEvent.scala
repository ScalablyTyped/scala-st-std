package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSGestureEvent extends UIEvent {
  var MSGESTURE_FLAG_BEGIN: Double
  var MSGESTURE_FLAG_CANCEL: Double
  var MSGESTURE_FLAG_END: Double
  var MSGESTURE_FLAG_INERTIA: Double
  var MSGESTURE_FLAG_NONE: Double
  var clientX: Double
  var clientY: Double
  var expansion: Double
  var gestureObject: js.Any
  var hwTimestamp: Double
  var offsetX: Double
  var offsetY: Double
  var rotation: Double
  var scale: Double
  var screenX: Double
  var screenY: Double
  var translationX: Double
  var translationY: Double
  var velocityAngular: Double
  var velocityExpansion: Double
  var velocityX: Double
  var velocityY: Double
  def initGestureEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    offsetXArg: Double,
    offsetYArg: Double,
    translationXArg: Double,
    translationYArg: Double,
    scaleArg: Double,
    expansionArg: Double,
    rotationArg: Double,
    velocityXArg: Double,
    velocityYArg: Double,
    velocityExpansionArg: Double,
    velocityAngularArg: Double,
    hwTimestampArg: Double
  ): Unit
}

object MSGestureEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    MSGESTURE_FLAG_BEGIN: Double,
    MSGESTURE_FLAG_CANCEL: Double,
    MSGESTURE_FLAG_END: Double,
    MSGESTURE_FLAG_INERTIA: Double,
    MSGESTURE_FLAG_NONE: Double,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    clientX: Double,
    clientY: Double,
    currentTarget: EventTarget,
    defaultPrevented: scala.Boolean,
    detail: Double,
    eventPhase: Double,
    expansion: Double,
    gestureObject: js.Any,
    hwTimestamp: Double,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    initGestureEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    initUIEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double) => Unit,
    isTrusted: scala.Boolean,
    offsetX: Double,
    offsetY: Double,
    preventDefault: () => Unit,
    returnValue: scala.Boolean,
    rotation: Double,
    scale: Double,
    screenX: Double,
    screenY: Double,
    srcElement: Element,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    translationX: Double,
    translationY: Double,
    `type`: java.lang.String,
    velocityAngular: Double,
    velocityExpansion: Double,
    velocityX: Double,
    velocityY: Double,
    view: Window
  ): MSGestureEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], MSGESTURE_FLAG_BEGIN = MSGESTURE_FLAG_BEGIN.asInstanceOf[js.Any], MSGESTURE_FLAG_CANCEL = MSGESTURE_FLAG_CANCEL.asInstanceOf[js.Any], MSGESTURE_FLAG_END = MSGESTURE_FLAG_END.asInstanceOf[js.Any], MSGESTURE_FLAG_INERTIA = MSGESTURE_FLAG_INERTIA.asInstanceOf[js.Any], MSGESTURE_FLAG_NONE = MSGESTURE_FLAG_NONE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], expansion = expansion.asInstanceOf[js.Any], gestureObject = gestureObject.asInstanceOf[js.Any], hwTimestamp = hwTimestamp.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initGestureEvent = js.Any.fromFunction21(initGestureEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), isTrusted = isTrusted.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any], velocityAngular = velocityAngular.asInstanceOf[js.Any], velocityExpansion = velocityExpansion.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSGestureEvent]
  }
  @scala.inline
  implicit class MSGestureEventOps[Self <: MSGestureEvent] (val x: Self) extends AnyVal {
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
    def setMSGESTURE_FLAG_BEGIN(value: Double): Self = this.set("MSGESTURE_FLAG_BEGIN", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGESTURE_FLAG_CANCEL(value: Double): Self = this.set("MSGESTURE_FLAG_CANCEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGESTURE_FLAG_END(value: Double): Self = this.set("MSGESTURE_FLAG_END", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGESTURE_FLAG_INERTIA(value: Double): Self = this.set("MSGESTURE_FLAG_INERTIA", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGESTURE_FLAG_NONE(value: Double): Self = this.set("MSGESTURE_FLAG_NONE", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpansion(value: Double): Self = this.set("expansion", value.asInstanceOf[js.Any])
    @scala.inline
    def setGestureObject(value: js.Any): Self = this.set("gestureObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setHwTimestamp(value: Double): Self = this.set("hwTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitGestureEvent(
      value: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit
    ): Self = this.set("initGestureEvent", js.Any.fromFunction21(value))
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenX(value: Double): Self = this.set("screenX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenY(value: Double): Self = this.set("screenY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslationX(value: Double): Self = this.set("translationX", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslationY(value: Double): Self = this.set("translationY", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocityAngular(value: Double): Self = this.set("velocityAngular", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocityExpansion(value: Double): Self = this.set("velocityExpansion", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocityX(value: Double): Self = this.set("velocityX", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocityY(value: Double): Self = this.set("velocityY", value.asInstanceOf[js.Any])
  }
  
}

