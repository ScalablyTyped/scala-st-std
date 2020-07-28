package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseEvent extends UIEvent {
  val altKey: scala.Boolean = js.native
  val button: Double = js.native
  val buttons: Double = js.native
  val clientX: Double = js.native
  val clientY: Double = js.native
  val ctrlKey: scala.Boolean = js.native
  /** @deprecated */
  val fromElement: Element = js.native
  val layerX: Double = js.native
  val layerY: Double = js.native
  val metaKey: scala.Boolean = js.native
  val movementX: Double = js.native
  val movementY: Double = js.native
  val offsetX: Double = js.native
  val offsetY: Double = js.native
  val pageX: Double = js.native
  val pageY: Double = js.native
  val relatedTarget: EventTarget = js.native
  val screenX: Double = js.native
  val screenY: Double = js.native
  val shiftKey: scala.Boolean = js.native
  /** @deprecated */
  val toElement: Element = js.native
  /** @deprecated */
  val which: Double = js.native
  val x: Double = js.native
  val y: Double = js.native
  def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  def initMouseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: Double
  ): Unit = js.native
  def initMouseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: Double,
    relatedTargetArg: EventTarget
  ): Unit = js.native
}

