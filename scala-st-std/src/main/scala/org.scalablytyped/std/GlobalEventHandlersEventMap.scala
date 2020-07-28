package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalEventHandlersEventMap extends js.Object {
  var animationcancel: AnimationEvent
  var animationend: AnimationEvent
  var animationiteration: AnimationEvent
  var animationstart: AnimationEvent
  var gotpointercapture: PointerEvent
  var lostpointercapture: PointerEvent
  var pointercancel: PointerEvent
  var pointerdown: PointerEvent
  var pointerenter: PointerEvent
  var pointerleave: PointerEvent
  var pointermove: PointerEvent
  var pointerout: PointerEvent
  var pointerover: PointerEvent
  var pointerup: PointerEvent
  var touchcancel: TouchEvent
  var touchend: TouchEvent
  var touchmove: TouchEvent
  var touchstart: TouchEvent
  var transitioncancel: TransitionEvent
  var transitionend: TransitionEvent
  var transitionrun: TransitionEvent
  var transitionstart: TransitionEvent
  var wheel: WheelEvent
}

object GlobalEventHandlersEventMap {
  @scala.inline
  def apply(
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
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
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    wheel: WheelEvent
  ): GlobalEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalEventHandlersEventMap]
  }
  @scala.inline
  implicit class GlobalEventHandlersEventMapOps[Self <: GlobalEventHandlersEventMap] (val x: Self) extends AnyVal {
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
    def setAnimationcancel(value: AnimationEvent): Self = this.set("animationcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationend(value: AnimationEvent): Self = this.set("animationend", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationiteration(value: AnimationEvent): Self = this.set("animationiteration", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationstart(value: AnimationEvent): Self = this.set("animationstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setGotpointercapture(value: PointerEvent): Self = this.set("gotpointercapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setLostpointercapture(value: PointerEvent): Self = this.set("lostpointercapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointercancel(value: PointerEvent): Self = this.set("pointercancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerdown(value: PointerEvent): Self = this.set("pointerdown", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerenter(value: PointerEvent): Self = this.set("pointerenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerleave(value: PointerEvent): Self = this.set("pointerleave", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointermove(value: PointerEvent): Self = this.set("pointermove", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerout(value: PointerEvent): Self = this.set("pointerout", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerover(value: PointerEvent): Self = this.set("pointerover", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerup(value: PointerEvent): Self = this.set("pointerup", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchcancel(value: TouchEvent): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: TouchEvent): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchmove(value: TouchEvent): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: TouchEvent): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitioncancel(value: TransitionEvent): Self = this.set("transitioncancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionend(value: TransitionEvent): Self = this.set("transitionend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionrun(value: TransitionEvent): Self = this.set("transitionrun", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionstart(value: TransitionEvent): Self = this.set("transitionstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setWheel(value: WheelEvent): Self = this.set("wheel", value.asInstanceOf[js.Any])
  }
  
}

