package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEvent extends UIEvent {
  val DOM_KEY_LOCATION_JOYSTICK: Double
  val DOM_KEY_LOCATION_LEFT: Double
  val DOM_KEY_LOCATION_MOBILE: Double
  val DOM_KEY_LOCATION_NUMPAD: Double
  val DOM_KEY_LOCATION_RIGHT: Double
  val DOM_KEY_LOCATION_STANDARD: Double
  val altKey: scala.Boolean
  val char: java.lang.String | Null
  val charCode: Double
  val ctrlKey: scala.Boolean
  val key: java.lang.String
  val keyCode: Double
  val locale: java.lang.String
  val location: Double
  val metaKey: scala.Boolean
  val repeat: scala.Boolean
  val shiftKey: scala.Boolean
  val which: Double
  def getModifierState(keyArg: java.lang.String): scala.Boolean
  def initKeyboardEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    keyArg: java.lang.String,
    locationArg: Double,
    modifiersListArg: java.lang.String,
    repeat: scala.Boolean,
    locale: java.lang.String
  ): Unit
}

object KeyboardEvent {
  @scala.inline
  def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    DOM_KEY_LOCATION_JOYSTICK: Double,
    DOM_KEY_LOCATION_LEFT: Double,
    DOM_KEY_LOCATION_MOBILE: Double,
    DOM_KEY_LOCATION_NUMPAD: Double,
    DOM_KEY_LOCATION_RIGHT: Double,
    DOM_KEY_LOCATION_STANDARD: Double,
    altKey: scala.Boolean,
    bubbles: scala.Boolean,
    cancelBubble: scala.Boolean,
    cancelable: scala.Boolean,
    charCode: Double,
    ctrlKey: scala.Boolean,
    currentTarget: EventTarget,
    defaultPrevented: scala.Boolean,
    detail: Double,
    eventPhase: Double,
    getModifierState: java.lang.String => scala.Boolean,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => Unit,
    initKeyboardEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, java.lang.String, Double, java.lang.String, scala.Boolean, java.lang.String) => Unit,
    initUIEvent: (java.lang.String, scala.Boolean, scala.Boolean, Window, Double) => Unit,
    isTrusted: scala.Boolean,
    key: java.lang.String,
    keyCode: Double,
    locale: java.lang.String,
    location: Double,
    metaKey: scala.Boolean,
    preventDefault: () => Unit,
    repeat: scala.Boolean,
    returnValue: scala.Boolean,
    shiftKey: scala.Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: java.lang.String,
    view: Window,
    which: Double
  ): KeyboardEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], DOM_KEY_LOCATION_JOYSTICK = DOM_KEY_LOCATION_JOYSTICK.asInstanceOf[js.Any], DOM_KEY_LOCATION_LEFT = DOM_KEY_LOCATION_LEFT.asInstanceOf[js.Any], DOM_KEY_LOCATION_MOBILE = DOM_KEY_LOCATION_MOBILE.asInstanceOf[js.Any], DOM_KEY_LOCATION_NUMPAD = DOM_KEY_LOCATION_NUMPAD.asInstanceOf[js.Any], DOM_KEY_LOCATION_RIGHT = DOM_KEY_LOCATION_RIGHT.asInstanceOf[js.Any], DOM_KEY_LOCATION_STANDARD = DOM_KEY_LOCATION_STANDARD.asInstanceOf[js.Any], altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), initEvent = js.Any.fromFunction3(initEvent), initKeyboardEvent = js.Any.fromFunction9(initKeyboardEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), repeat = repeat.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEvent]
  }
  @scala.inline
  implicit class KeyboardEventOps[Self <: KeyboardEvent] (val x: Self) extends AnyVal {
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
    def setDOM_KEY_LOCATION_JOYSTICK(value: Double): Self = this.set("DOM_KEY_LOCATION_JOYSTICK", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_KEY_LOCATION_LEFT(value: Double): Self = this.set("DOM_KEY_LOCATION_LEFT", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_KEY_LOCATION_MOBILE(value: Double): Self = this.set("DOM_KEY_LOCATION_MOBILE", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_KEY_LOCATION_NUMPAD(value: Double): Self = this.set("DOM_KEY_LOCATION_NUMPAD", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_KEY_LOCATION_RIGHT(value: Double): Self = this.set("DOM_KEY_LOCATION_RIGHT", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM_KEY_LOCATION_STANDARD(value: Double): Self = this.set("DOM_KEY_LOCATION_STANDARD", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltKey(value: scala.Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharCode(value: Double): Self = this.set("charCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtrlKey(value: scala.Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetModifierState(value: java.lang.String => scala.Boolean): Self = this.set("getModifierState", js.Any.fromFunction1(value))
    @scala.inline
    def setInitKeyboardEvent(
      value: (java.lang.String, scala.Boolean, scala.Boolean, Window, java.lang.String, Double, java.lang.String, scala.Boolean, java.lang.String) => Unit
    ): Self = this.set("initKeyboardEvent", js.Any.fromFunction9(value))
    @scala.inline
    def setKey(value: java.lang.String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyCode(value: Double): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: java.lang.String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaKey(value: scala.Boolean): Self = this.set("metaKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeat(value: scala.Boolean): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def setShiftKey(value: scala.Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhich(value: Double): Self = this.set("which", value.asInstanceOf[js.Any])
    @scala.inline
    def setChar(value: java.lang.String): Self = this.set("char", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharNull: Self = this.set("char", null)
  }
  
}

