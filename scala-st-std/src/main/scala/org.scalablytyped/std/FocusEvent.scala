package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The FocusEvent interface represents focus-related events like focus, blur, focusin, or focusout. */
@js.native
trait FocusEvent extends UIEvent {
  val relatedTarget: EventTarget = js.native
  def initFocusEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    relatedTargetArg: EventTarget
  ): Unit = js.native
}

