package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGZoomEvent extends UIEvent {
  val newScale: Double
  val newTranslate: SVGPoint
  val previousScale: Double
  val previousTranslate: SVGPoint
  val zoomRectScreen: SVGRect
}

object SVGZoomEvent {
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
    detail: Double,
    eventPhase: Double,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    initUIEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double) => Unit,
    isTrusted: scala.Boolean,
    newScale: Double,
    newTranslate: SVGPoint,
    preventDefault: () => Unit,
    previousScale: Double,
    previousTranslate: SVGPoint,
    returnValue: scala.Boolean,
    scoped: scala.Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String,
    view: Window,
    zoomRectScreen: SVGRect
  ): SVGZoomEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], deepPath = js.Any.fromFunction0(deepPath), defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), isTrusted = isTrusted.asInstanceOf[js.Any], newScale = newScale.asInstanceOf[js.Any], newTranslate = newTranslate.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), previousScale = previousScale.asInstanceOf[js.Any], previousTranslate = previousTranslate.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], zoomRectScreen = zoomRectScreen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGZoomEvent]
  }
  @scala.inline
  implicit class SVGZoomEventOps[Self <: SVGZoomEvent] (val x: Self) extends AnyVal {
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
    def setNewScale(value: Double): Self = this.set("newScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewTranslate(value: SVGPoint): Self = this.set("newTranslate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousScale(value: Double): Self = this.set("previousScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousTranslate(value: SVGPoint): Self = this.set("previousTranslate", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomRectScreen(value: SVGRect): Self = this.set("zoomRectScreen", value.asInstanceOf[js.Any])
  }
  
}

