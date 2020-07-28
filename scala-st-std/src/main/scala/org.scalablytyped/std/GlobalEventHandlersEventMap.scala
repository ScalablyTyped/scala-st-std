package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalEventHandlersEventMap extends js.Object {
  var pointercancel: PointerEvent
  var pointerdown: PointerEvent
  var pointerenter: PointerEvent
  var pointerleave: PointerEvent
  var pointermove: PointerEvent
  var pointerout: PointerEvent
  var pointerover: PointerEvent
  var pointerup: PointerEvent
  var wheel: WheelEvent
}

object GlobalEventHandlersEventMap {
  @scala.inline
  def apply(
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    wheel: WheelEvent
  ): GlobalEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
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
    def setWheel(value: WheelEvent): Self = this.set("wheel", value.asInstanceOf[js.Any])
  }
  
}

