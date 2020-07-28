package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardEvent extends UIEvent {
  val DOM_KEY_LOCATION_JOYSTICK: Double = js.native
  val DOM_KEY_LOCATION_LEFT: Double = js.native
  val DOM_KEY_LOCATION_MOBILE: Double = js.native
  val DOM_KEY_LOCATION_NUMPAD: Double = js.native
  val DOM_KEY_LOCATION_RIGHT: Double = js.native
  val DOM_KEY_LOCATION_STANDARD: Double = js.native
  val altKey: scala.Boolean = js.native
  /** @deprecated */
  var char: java.lang.String = js.native
  /** @deprecated */
  val charCode: Double = js.native
  val code: java.lang.String = js.native
  val ctrlKey: scala.Boolean = js.native
  val key: java.lang.String = js.native
  /** @deprecated */
  val keyCode: Double = js.native
  val location: Double = js.native
  val metaKey: scala.Boolean = js.native
  val repeat: scala.Boolean = js.native
  val shiftKey: scala.Boolean = js.native
  /** @deprecated */
  val which: Double = js.native
  def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  /** @deprecated */
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
  ): Unit = js.native
}

