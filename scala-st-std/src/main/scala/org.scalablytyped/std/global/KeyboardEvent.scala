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
  override val AT_TARGET: Double = js.native
  /* CompleteClass */
  override val BUBBLING_PHASE: Double = js.native
  /* CompleteClass */
  override val CAPTURING_PHASE: Double = js.native
  /* CompleteClass */
  override val DOM_KEY_LOCATION_JOYSTICK: Double = js.native
  /* CompleteClass */
  override val DOM_KEY_LOCATION_LEFT: Double = js.native
  /* CompleteClass */
  override val DOM_KEY_LOCATION_MOBILE: Double = js.native
  /* CompleteClass */
  override val DOM_KEY_LOCATION_NUMPAD: Double = js.native
  /* CompleteClass */
  override val DOM_KEY_LOCATION_RIGHT: Double = js.native
  /* CompleteClass */
  override val DOM_KEY_LOCATION_STANDARD: Double = js.native
  /* CompleteClass */
  override val altKey: scala.Boolean = js.native
  /* CompleteClass */
  override val bubbles: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelBubble: scala.Boolean = js.native
  /* CompleteClass */
  override val cancelable: scala.Boolean = js.native
  /* CompleteClass */
  override val char: java.lang.String | Null = js.native
  /* CompleteClass */
  override val charCode: Double = js.native
  /* CompleteClass */
  override val ctrlKey: scala.Boolean = js.native
  /* CompleteClass */
  override val currentTarget: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override val defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override val detail: Double = js.native
  /* CompleteClass */
  override val eventPhase: Double = js.native
  /* CompleteClass */
  override val isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override val key: java.lang.String = js.native
  /* CompleteClass */
  override val keyCode: Double = js.native
  /* CompleteClass */
  override val locale: java.lang.String = js.native
  /* CompleteClass */
  override val location: Double = js.native
  /* CompleteClass */
  override val metaKey: scala.Boolean = js.native
  /* CompleteClass */
  override val repeat: scala.Boolean = js.native
  /* CompleteClass */
  override var returnValue: scala.Boolean = js.native
  /* CompleteClass */
  override val shiftKey: scala.Boolean = js.native
  /* CompleteClass */
  override val srcElement: org.scalablytyped.std.Element | Null = js.native
  /* CompleteClass */
  override val target: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override val timeStamp: Double = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override val view: Window = js.native
  /* CompleteClass */
  override val which: Double = js.native
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
  val DOM_KEY_LOCATION_JOYSTICK: Double = js.native
  val DOM_KEY_LOCATION_LEFT: Double = js.native
  val DOM_KEY_LOCATION_MOBILE: Double = js.native
  val DOM_KEY_LOCATION_NUMPAD: Double = js.native
  val DOM_KEY_LOCATION_RIGHT: Double = js.native
  val DOM_KEY_LOCATION_STANDARD: Double = js.native
}

