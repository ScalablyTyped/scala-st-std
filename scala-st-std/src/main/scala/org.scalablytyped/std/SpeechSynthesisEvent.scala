package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechSynthesisEvent extends Event {
  val charIndex: Double
  val elapsedTime: Double
  val name: java.lang.String
  val utterance: SpeechSynthesisUtterance | Null
}

object SpeechSynthesisEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    charIndex: Double,
    currentTarget: EventTarget,
    deepPath: () => js.Array[EventTarget],
    defaultPrevented: scala.Boolean,
    elapsedTime: Double,
    eventPhase: Double,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    isTrusted: scala.Boolean,
    name: java.lang.String,
    preventDefault: () => Unit,
    returnValue: scala.Boolean,
    scoped: scala.Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String
  ): SpeechSynthesisEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charIndex = charIndex.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], deepPath = js.Any.fromFunction0(deepPath), defaultPrevented = defaultPrevented.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisEvent]
  }
  @scala.inline
  implicit class SpeechSynthesisEventOps[Self <: SpeechSynthesisEvent] (val x: Self) extends AnyVal {
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
    def setCharIndex(value: Double): Self = this.set("charIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setElapsedTime(value: Double): Self = this.set("elapsedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtterance(value: SpeechSynthesisUtterance): Self = this.set("utterance", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtteranceNull: Self = this.set("utterance", null)
  }
  
}

