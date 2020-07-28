package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGSVGElementEventMap extends SVGElementEventMap {
  var SVGAbort: Event
  var SVGError: Event
  var SVGUnload: Event
  var SVGZoom: SVGZoomEvent
  var resize: UIEvent
  var scroll: UIEvent
}

object SVGSVGElementEventMap {
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
    SVGAbort: Event,
    SVGError: Event,
    SVGUnload: Event,
    SVGZoom: SVGZoomEvent,
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
    resize: UIEvent,
    scroll: UIEvent,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    webkitfullscreenchange: Event,
    webkitfullscreenerror: Event,
    wheel: WheelEvent
  ): SVGSVGElementEventMap = {
    val __obj = js.Dynamic.literal(MSGestureChange = MSGestureChange.asInstanceOf[js.Any], MSGestureDoubleTap = MSGestureDoubleTap.asInstanceOf[js.Any], MSGestureEnd = MSGestureEnd.asInstanceOf[js.Any], MSGestureHold = MSGestureHold.asInstanceOf[js.Any], MSGestureStart = MSGestureStart.asInstanceOf[js.Any], MSGestureTap = MSGestureTap.asInstanceOf[js.Any], MSGotPointerCapture = MSGotPointerCapture.asInstanceOf[js.Any], MSInertiaStart = MSInertiaStart.asInstanceOf[js.Any], MSLostPointerCapture = MSLostPointerCapture.asInstanceOf[js.Any], MSPointerCancel = MSPointerCancel.asInstanceOf[js.Any], MSPointerDown = MSPointerDown.asInstanceOf[js.Any], MSPointerEnter = MSPointerEnter.asInstanceOf[js.Any], MSPointerLeave = MSPointerLeave.asInstanceOf[js.Any], MSPointerMove = MSPointerMove.asInstanceOf[js.Any], MSPointerOut = MSPointerOut.asInstanceOf[js.Any], MSPointerOver = MSPointerOver.asInstanceOf[js.Any], MSPointerUp = MSPointerUp.asInstanceOf[js.Any], SVGAbort = SVGAbort.asInstanceOf[js.Any], SVGError = SVGError.asInstanceOf[js.Any], SVGUnload = SVGUnload.asInstanceOf[js.Any], SVGZoom = SVGZoom.asInstanceOf[js.Any], ariarequest = ariarequest.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], webkitfullscreenchange = webkitfullscreenchange.asInstanceOf[js.Any], webkitfullscreenerror = webkitfullscreenerror.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGSVGElementEventMap]
  }
  @scala.inline
  implicit class SVGSVGElementEventMapOps[Self <: SVGSVGElementEventMap] (val x: Self) extends AnyVal {
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
    def setSVGAbort(value: Event): Self = this.set("SVGAbort", value.asInstanceOf[js.Any])
    @scala.inline
    def setSVGError(value: Event): Self = this.set("SVGError", value.asInstanceOf[js.Any])
    @scala.inline
    def setSVGUnload(value: Event): Self = this.set("SVGUnload", value.asInstanceOf[js.Any])
    @scala.inline
    def setSVGZoom(value: SVGZoomEvent): Self = this.set("SVGZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setResize(value: UIEvent): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def setScroll(value: UIEvent): Self = this.set("scroll", value.asInstanceOf[js.Any])
  }
  
}
