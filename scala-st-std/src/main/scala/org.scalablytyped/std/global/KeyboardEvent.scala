package org.scalablytyped.std.global

import org.scalablytyped.std.KeyboardEventInit
import org.scalablytyped.std.Window
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("KeyboardEvent")
@js.native
class KeyboardEvent protected ()
  extends org.scalablytyped.std.KeyboardEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: KeyboardEventInit) = this()
  /* CompleteClass */
  override var AT_TARGET: Double = js.native
  /* CompleteClass */
  override var BUBBLING_PHASE: Double = js.native
  /* CompleteClass */
  override var CAPTURING_PHASE: Double = js.native
  /* CompleteClass */
  override var DOM_KEY_LOCATION_JOYSTICK: Double = js.native
  /* CompleteClass */
  override var DOM_KEY_LOCATION_LEFT: Double = js.native
  /* CompleteClass */
  override var DOM_KEY_LOCATION_MOBILE: Double = js.native
  /* CompleteClass */
  override var DOM_KEY_LOCATION_NUMPAD: Double = js.native
  /* CompleteClass */
  override var DOM_KEY_LOCATION_RIGHT: Double = js.native
  /* CompleteClass */
  override var DOM_KEY_LOCATION_STANDARD: Double = js.native
  /* CompleteClass */
  override var altKey: scala.Boolean = js.native
  /* CompleteClass */
  override var bubbles: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelBubble: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelable: scala.Boolean = js.native
  /* CompleteClass */
  override var char: java.lang.String = js.native
  /* CompleteClass */
  override var charCode: Double = js.native
  /* CompleteClass */
  override var ctrlKey: scala.Boolean = js.native
  /* CompleteClass */
  override var currentTarget: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override var defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override var detail: Double = js.native
  /* CompleteClass */
  override var eventPhase: Double = js.native
  /* CompleteClass */
  override var isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override var key: java.lang.String = js.native
  /* CompleteClass */
  override var keyCode: Double = js.native
  /* CompleteClass */
  override var locale: java.lang.String = js.native
  /* CompleteClass */
  override var location: Double = js.native
  /* CompleteClass */
  override var metaKey: scala.Boolean = js.native
  /* CompleteClass */
  override var repeat: scala.Boolean = js.native
  /* CompleteClass */
  override var returnValue: scala.Boolean = js.native
  /* CompleteClass */
  override var shiftKey: scala.Boolean = js.native
  /* CompleteClass */
  override var srcElement: org.scalablytyped.std.Element = js.native
  /* CompleteClass */
  override var target: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override var timeStamp: Double = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  override var view: Window = js.native
  /* CompleteClass */
  override var which: Double = js.native
  /* CompleteClass */
  override def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): Unit = js.native
  /* CompleteClass */
  override def initKeyboardEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    keyArg: java.lang.String,
    locationArg: Double,
    modifiersListArg: java.lang.String,
    repeat: scala.Boolean,
    locale: java.lang.String
  ): Unit = js.native
  /* CompleteClass */
  override def initUIEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double
  ): Unit = js.native
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}

@JSGlobal("KeyboardEvent")
@js.native
object KeyboardEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.KeyboardEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ KeyboardEventInit, 
      org.scalablytyped.std.KeyboardEvent
    ] {
  var DOM_KEY_LOCATION_JOYSTICK: Double = js.native
  var DOM_KEY_LOCATION_LEFT: Double = js.native
  var DOM_KEY_LOCATION_MOBILE: Double = js.native
  var DOM_KEY_LOCATION_NUMPAD: Double = js.native
  var DOM_KEY_LOCATION_RIGHT: Double = js.native
  var DOM_KEY_LOCATION_STANDARD: Double = js.native
}

