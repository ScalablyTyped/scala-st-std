package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementEventMap extends GlobalEventHandlersEventMap {
  var MSGestureChange: Event
  var MSGestureDoubleTap: Event
  var MSGestureEnd: Event
  var MSGestureHold: Event
  var MSGestureStart: Event
  var MSGestureTap: Event
  var MSGotPointerCapture: Event
  var MSInertiaStart: Event
  var MSLostPointerCapture: Event
  var MSPointerCancel: Event
  var MSPointerDown: Event
  var MSPointerEnter: Event
  var MSPointerLeave: Event
  var MSPointerMove: Event
  var MSPointerOut: Event
  var MSPointerOver: Event
  var MSPointerUp: Event
  var ariarequest: Event
  var command: Event
  var gotpointercapture: PointerEvent
  var lostpointercapture: PointerEvent
  var touchcancel: TouchEvent
  var touchend: TouchEvent
  var touchmove: TouchEvent
  var touchstart: TouchEvent
  var webkitfullscreenchange: Event
  var webkitfullscreenerror: Event
}

object ElementEventMap {
  @scala.inline
  def apply(
    MSGestureChange: Event,
    MSGestureDoubleTap: Event,
    MSGestureEnd: Event,
    MSGestureHold: Event,
    MSGestureStart: Event,
    MSGestureTap: Event,
    MSGotPointerCapture: Event,
    MSInertiaStart: Event,
    MSLostPointerCapture: Event,
    MSPointerCancel: Event,
    MSPointerDown: Event,
    MSPointerEnter: Event,
    MSPointerLeave: Event,
    MSPointerMove: Event,
    MSPointerOut: Event,
    MSPointerOver: Event,
    MSPointerUp: Event,
    ariarequest: Event,
    command: Event,
    gotpointercapture: PointerEvent,
    lostpointercapture: PointerEvent,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    webkitfullscreenchange: Event,
    webkitfullscreenerror: Event,
    wheel: WheelEvent
  ): ElementEventMap = {
    val __obj = js.Dynamic.literal(MSGestureChange = MSGestureChange.asInstanceOf[js.Any], MSGestureDoubleTap = MSGestureDoubleTap.asInstanceOf[js.Any], MSGestureEnd = MSGestureEnd.asInstanceOf[js.Any], MSGestureHold = MSGestureHold.asInstanceOf[js.Any], MSGestureStart = MSGestureStart.asInstanceOf[js.Any], MSGestureTap = MSGestureTap.asInstanceOf[js.Any], MSGotPointerCapture = MSGotPointerCapture.asInstanceOf[js.Any], MSInertiaStart = MSInertiaStart.asInstanceOf[js.Any], MSLostPointerCapture = MSLostPointerCapture.asInstanceOf[js.Any], MSPointerCancel = MSPointerCancel.asInstanceOf[js.Any], MSPointerDown = MSPointerDown.asInstanceOf[js.Any], MSPointerEnter = MSPointerEnter.asInstanceOf[js.Any], MSPointerLeave = MSPointerLeave.asInstanceOf[js.Any], MSPointerMove = MSPointerMove.asInstanceOf[js.Any], MSPointerOut = MSPointerOut.asInstanceOf[js.Any], MSPointerOver = MSPointerOver.asInstanceOf[js.Any], MSPointerUp = MSPointerUp.asInstanceOf[js.Any], ariarequest = ariarequest.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], webkitfullscreenchange = webkitfullscreenchange.asInstanceOf[js.Any], webkitfullscreenerror = webkitfullscreenerror.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementEventMap]
  }
  @scala.inline
  implicit class ElementEventMapOps[Self <: ElementEventMap] (val x: Self) extends AnyVal {
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
    def setMSGestureChange(value: Event): Self = this.set("MSGestureChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureDoubleTap(value: Event): Self = this.set("MSGestureDoubleTap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureEnd(value: Event): Self = this.set("MSGestureEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureHold(value: Event): Self = this.set("MSGestureHold", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureStart(value: Event): Self = this.set("MSGestureStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureTap(value: Event): Self = this.set("MSGestureTap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGotPointerCapture(value: Event): Self = this.set("MSGotPointerCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSInertiaStart(value: Event): Self = this.set("MSInertiaStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSLostPointerCapture(value: Event): Self = this.set("MSLostPointerCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerCancel(value: Event): Self = this.set("MSPointerCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerDown(value: Event): Self = this.set("MSPointerDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerEnter(value: Event): Self = this.set("MSPointerEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerLeave(value: Event): Self = this.set("MSPointerLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerMove(value: Event): Self = this.set("MSPointerMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerOut(value: Event): Self = this.set("MSPointerOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerOver(value: Event): Self = this.set("MSPointerOver", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerUp(value: Event): Self = this.set("MSPointerUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriarequest(value: Event): Self = this.set("ariarequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: Event): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setGotpointercapture(value: PointerEvent): Self = this.set("gotpointercapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setLostpointercapture(value: PointerEvent): Self = this.set("lostpointercapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: TouchEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: TouchEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: TouchEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: TouchEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebkitfullscreenchange(value: Event): Self = this.set("webkitfullscreenchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebkitfullscreenerror(value: Event): Self = this.set("webkitfullscreenerror", value.asInstanceOf[js.Any])
  }
  
}

