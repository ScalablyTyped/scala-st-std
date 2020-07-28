package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEvent extends UIEvent {
  val DOM_INPUT_METHOD_DROP: Double
  val DOM_INPUT_METHOD_HANDWRITING: Double
  val DOM_INPUT_METHOD_IME: Double
  val DOM_INPUT_METHOD_KEYBOARD: Double
  val DOM_INPUT_METHOD_MULTIMODAL: Double
  val DOM_INPUT_METHOD_OPTION: Double
  val DOM_INPUT_METHOD_PASTE: Double
  val DOM_INPUT_METHOD_SCRIPT: Double
  val DOM_INPUT_METHOD_UNKNOWN: Double
  val DOM_INPUT_METHOD_VOICE: Double
  val data: java.lang.String
  val inputMethod: Double
  val locale: java.lang.String
  def initTextEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    dataArg: java.lang.String,
    inputMethod: Double,
    locale: java.lang.String
  ): Unit
}

object TextEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    DOM_INPUT_METHOD_DROP: Double,
    DOM_INPUT_METHOD_HANDWRITING: Double,
    DOM_INPUT_METHOD_IME: Double,
    DOM_INPUT_METHOD_KEYBOARD: Double,
    DOM_INPUT_METHOD_MULTIMODAL: Double,
    DOM_INPUT_METHOD_OPTION: Double,
    DOM_INPUT_METHOD_PASTE: Double,
    DOM_INPUT_METHOD_SCRIPT: Double,
    DOM_INPUT_METHOD_UNKNOWN: Double,
    DOM_INPUT_METHOD_VOICE: Double,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: EventTarget,
    data: java.lang.String,
    deepPath: () => js.Array[EventTarget],
    defaultPrevented: scala.Boolean,
    detail: Double,
    eventPhase: Double,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    initTextEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, java.lang.String, Double, java.lang.String) => Unit,
    initUIEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double) => Unit,
    inputMethod: Double,
    isTrusted: scala.Boolean,
    locale: java.lang.String,
    preventDefault: () => Unit,
    returnValue: scala.Boolean,
    scoped: scala.Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String,
    view: Window
  ): TextEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], DOM_INPUT_METHOD_DROP = DOM_INPUT_METHOD_DROP.asInstanceOf[js.Any], DOM_INPUT_METHOD_HANDWRITING = DOM_INPUT_METHOD_HANDWRITING.asInstanceOf[js.Any], DOM_INPUT_METHOD_IME = DOM_INPUT_METHOD_IME.asInstanceOf[js.Any], DOM_INPUT_METHOD_KEYBOARD = DOM_INPUT_METHOD_KEYBOARD.asInstanceOf[js.Any], DOM_INPUT_METHOD_MULTIMODAL = DOM_INPUT_METHOD_MULTIMODAL.asInstanceOf[js.Any], DOM_INPUT_METHOD_OPTION = DOM_INPUT_METHOD_OPTION.asInstanceOf[js.Any], DOM_INPUT_METHOD_PASTE = DOM_INPUT_METHOD_PASTE.asInstanceOf[js.Any], DOM_INPUT_METHOD_SCRIPT = DOM_INPUT_METHOD_SCRIPT.asInstanceOf[js.Any], DOM_INPUT_METHOD_UNKNOWN = DOM_INPUT_METHOD_UNKNOWN.asInstanceOf[js.Any], DOM_INPUT_METHOD_VOICE = DOM_INPUT_METHOD_VOICE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deepPath = js.Any.fromFunction0(deepPath), defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initTextEvent = js.Any.fromFunction7(initTextEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), inputMethod = inputMethod.asInstanceOf[js.Any], isTrusted = isTrusted.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEvent]
  }
  @scala.inline
  implicit class TextEventOps[Self <: TextEvent] (val x: Self) extends AnyVal {
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
    def setDOM_INPUT_METHOD_DROP(value: Double): Self = this.set("DOM_INPUT_METHOD_DROP", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_INPUT_METHOD_HANDWRITING(value: Double): Self = this.set("DOM_INPUT_METHOD_HANDWRITING", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_INPUT_METHOD_IME(value: Double): Self = this.set("DOM_INPUT_METHOD_IME", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_INPUT_METHOD_KEYBOARD(value: Double): Self = this.set("DOM_INPUT_METHOD_KEYBOARD", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_INPUT_METHOD_MULTIMODAL(value: Double): Self = this.set("DOM_INPUT_METHOD_MULTIMODAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_INPUT_METHOD_OPTION(value: Double): Self = this.set("DOM_INPUT_METHOD_OPTION", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_INPUT_METHOD_PASTE(value: Double): Self = this.set("DOM_INPUT_METHOD_PASTE", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_INPUT_METHOD_SCRIPT(value: Double): Self = this.set("DOM_INPUT_METHOD_SCRIPT", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_INPUT_METHOD_UNKNOWN(value: Double): Self = this.set("DOM_INPUT_METHOD_UNKNOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_INPUT_METHOD_VOICE(value: Double): Self = this.set("DOM_INPUT_METHOD_VOICE", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: java.lang.String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitTextEvent(
      value: (java.lang.String, scala.Boolean, scala.Boolean, Window, java.lang.String, Double, java.lang.String) => Unit
    ): Self = this.set("initTextEvent", js.Any.fromFunction7(value))
    @scala.inline
    def setInputMethod(value: Double): Self = this.set("inputMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: java.lang.String): Self = this.set("locale", value.asInstanceOf[js.Any])
  }
  
}

