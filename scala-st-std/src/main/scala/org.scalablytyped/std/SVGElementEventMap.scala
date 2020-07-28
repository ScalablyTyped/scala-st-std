package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGElementEventMap extends ElementEventMap {
  var click: MouseEvent
  var dblclick: MouseEvent
  var focusin: FocusEvent
  var focusout: FocusEvent
  var load: Event
  var mousedown: MouseEvent
  var mousemove: MouseEvent
  var mouseout: MouseEvent
  var mouseover: MouseEvent
  var mouseup: MouseEvent
}

object SVGElementEventMap {
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
    click: MouseEvent,
    command: Event,
    dblclick: MouseEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    gotpointercapture: PointerEvent,
    load: Event,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    touchcancel: Event,
    touchend: Event,
    touchmove: Event,
    touchstart: Event,
    webkitfullscreenchange: Event,
    webkitfullscreenerror: Event,
    wheel: WheelEvent
  ): SVGElementEventMap = {
    val __obj = js.Dynamic.literal(MSGestureChange = MSGestureChange.asInstanceOf[js.Any], MSGestureDoubleTap = MSGestureDoubleTap.asInstanceOf[js.Any], MSGestureEnd = MSGestureEnd.asInstanceOf[js.Any], MSGestureHold = MSGestureHold.asInstanceOf[js.Any], MSGestureStart = MSGestureStart.asInstanceOf[js.Any], MSGestureTap = MSGestureTap.asInstanceOf[js.Any], MSGotPointerCapture = MSGotPointerCapture.asInstanceOf[js.Any], MSInertiaStart = MSInertiaStart.asInstanceOf[js.Any], MSLostPointerCapture = MSLostPointerCapture.asInstanceOf[js.Any], MSPointerCancel = MSPointerCancel.asInstanceOf[js.Any], MSPointerDown = MSPointerDown.asInstanceOf[js.Any], MSPointerEnter = MSPointerEnter.asInstanceOf[js.Any], MSPointerLeave = MSPointerLeave.asInstanceOf[js.Any], MSPointerMove = MSPointerMove.asInstanceOf[js.Any], MSPointerOut = MSPointerOut.asInstanceOf[js.Any], MSPointerOver = MSPointerOver.asInstanceOf[js.Any], MSPointerUp = MSPointerUp.asInstanceOf[js.Any], ariarequest = ariarequest.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], webkitfullscreenchange = webkitfullscreenchange.asInstanceOf[js.Any], webkitfullscreenerror = webkitfullscreenerror.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGElementEventMap]
  }
  @scala.inline
  implicit class SVGElementEventMapOps[Self <: SVGElementEventMap] (val x: Self) extends AnyVal {
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
    def setClick(value: MouseEvent): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: MouseEvent): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusin(value: FocusEvent): Self = this.set("focusin", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusout(value: FocusEvent): Self = this.set("focusout", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad(value: Event): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousedown(value: MouseEvent): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousemove(value: MouseEvent): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseout(value: MouseEvent): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseover(value: MouseEvent): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseup(value: MouseEvent): Self = this.set("mouseup", value.asInstanceOf[js.Any])
  }
  
}

