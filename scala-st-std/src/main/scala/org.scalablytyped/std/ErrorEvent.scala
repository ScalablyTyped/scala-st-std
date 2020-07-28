package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEvent extends Event {
  var colno: Double
  var error: js.Any
  var filename: java.lang.String
  var lineno: Double
  var message: java.lang.String
  def initErrorEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    messageArg: java.lang.String,
    filenameArg: java.lang.String,
    linenoArg: Double
  ): Unit
}

object ErrorEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    colno: Double,
    currentTarget: EventTarget,
    defaultPrevented: scala.Boolean,
    error: js.Any,
    eventPhase: Double,
    filename: java.lang.String,
    initErrorEvent: (java.lang.String, scala.Boolean, scala.Boolean, java.lang.String, java.lang.String, Double) => Unit,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    isTrusted: scala.Boolean,
    lineno: Double,
    message: java.lang.String,
    preventDefault: () => Unit,
    returnValue: scala.Boolean,
    srcElement: Element,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String
  ): ErrorEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], colno = colno.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], initErrorEvent = js.Any.fromFunction6(initErrorEvent), initEvent = js.Any.fromFunction3(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  @scala.inline
  implicit class ErrorEventOps[Self <: ErrorEvent] (val x: Self) extends AnyVal {
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
    def setColno(value: Double): Self = this.set("colno", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: java.lang.String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitErrorEvent(
      value: (java.lang.String, scala.Boolean, scala.Boolean, java.lang.String, java.lang.String, Double) => Unit
    ): Self = this.set("initErrorEvent", js.Any.fromFunction6(value))
    @scala.inline
    def setLineno(value: Double): Self = this.set("lineno", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: java.lang.String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

