package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowEvent extends UIEvent {
  val BOTH: Double
  val HORIZONTAL: Double
  val VERTICAL: Double
  val horizontalOverflow: scala.Boolean
  val orient: Double
  val verticalOverflow: scala.Boolean
}

object OverflowEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BOTH: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    HORIZONTAL: Double,
    VERTICAL: Double,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: EventTarget,
    defaultPrevented: scala.Boolean,
    detail: Double,
    eventPhase: Double,
    horizontalOverflow: scala.Boolean,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    initUIEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double) => Unit,
    isTrusted: scala.Boolean,
    orient: Double,
    preventDefault: () => Unit,
    returnValue: scala.Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String,
    verticalOverflow: scala.Boolean,
    view: Window
  ): OverflowEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BOTH = BOTH.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], HORIZONTAL = HORIZONTAL.asInstanceOf[js.Any], VERTICAL = VERTICAL.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], horizontalOverflow = horizontalOverflow.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), isTrusted = isTrusted.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], verticalOverflow = verticalOverflow.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowEvent]
  }
  @scala.inline
  implicit class OverflowEventOps[Self <: OverflowEvent] (val x: Self) extends AnyVal {
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
    def setBOTH(value: Double): Self = this.set("BOTH", value.asInstanceOf[js.Any])
    @scala.inline
    def setHORIZONTAL(value: Double): Self = this.set("HORIZONTAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setVERTICAL(value: Double): Self = this.set("VERTICAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalOverflow(value: scala.Boolean): Self = this.set("horizontalOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrient(value: Double): Self = this.set("orient", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalOverflow(value: scala.Boolean): Self = this.set("verticalOverflow", value.asInstanceOf[js.Any])
  }
  
}

