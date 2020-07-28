package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementEventMap extends GlobalEventHandlersEventMap {
  var MSGestureChange: MSGestureEvent
  var MSGestureDoubleTap: MSGestureEvent
  var MSGestureEnd: MSGestureEvent
  var MSGestureHold: MSGestureEvent
  var MSGestureStart: MSGestureEvent
  var MSGestureTap: MSGestureEvent
  var MSGotPointerCapture: MSPointerEvent
  var MSInertiaStart: MSGestureEvent
  var MSLostPointerCapture: MSPointerEvent
  var MSPointerCancel: MSPointerEvent
  var MSPointerDown: MSPointerEvent
  var MSPointerEnter: MSPointerEvent
  var MSPointerLeave: MSPointerEvent
  var MSPointerMove: MSPointerEvent
  var MSPointerOut: MSPointerEvent
  var MSPointerOver: MSPointerEvent
  var MSPointerUp: MSPointerEvent
  var ariarequest: AriaRequestEvent
  var command: CommandEvent
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
    MSGestureChange: MSGestureEvent,
    MSGestureDoubleTap: MSGestureEvent,
    MSGestureEnd: MSGestureEvent,
    MSGestureHold: MSGestureEvent,
    MSGestureStart: MSGestureEvent,
    MSGestureTap: MSGestureEvent,
    MSGotPointerCapture: MSPointerEvent,
    MSInertiaStart: MSGestureEvent,
    MSLostPointerCapture: MSPointerEvent,
    MSPointerCancel: MSPointerEvent,
    MSPointerDown: MSPointerEvent,
    MSPointerEnter: MSPointerEvent,
    MSPointerLeave: MSPointerEvent,
    MSPointerMove: MSPointerEvent,
    MSPointerOut: MSPointerEvent,
    MSPointerOver: MSPointerEvent,
    MSPointerUp: MSPointerEvent,
    ariarequest: AriaRequestEvent,
    command: CommandEvent,
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
    def setMSGestureChange(value: MSGestureEvent): Self = this.set("MSGestureChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureDoubleTap(value: MSGestureEvent): Self = this.set("MSGestureDoubleTap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureEnd(value: MSGestureEvent): Self = this.set("MSGestureEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureHold(value: MSGestureEvent): Self = this.set("MSGestureHold", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureStart(value: MSGestureEvent): Self = this.set("MSGestureStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGestureTap(value: MSGestureEvent): Self = this.set("MSGestureTap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSGotPointerCapture(value: MSPointerEvent): Self = this.set("MSGotPointerCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSInertiaStart(value: MSGestureEvent): Self = this.set("MSInertiaStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSLostPointerCapture(value: MSPointerEvent): Self = this.set("MSLostPointerCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerCancel(value: MSPointerEvent): Self = this.set("MSPointerCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerDown(value: MSPointerEvent): Self = this.set("MSPointerDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerEnter(value: MSPointerEvent): Self = this.set("MSPointerEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerLeave(value: MSPointerEvent): Self = this.set("MSPointerLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerMove(value: MSPointerEvent): Self = this.set("MSPointerMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerOut(value: MSPointerEvent): Self = this.set("MSPointerOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerOver(value: MSPointerEvent): Self = this.set("MSPointerOver", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSPointerUp(value: MSPointerEvent): Self = this.set("MSPointerUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriarequest(value: AriaRequestEvent): Self = this.set("ariarequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: CommandEvent): Self = this.set("command", value.asInstanceOf[js.Any])
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

