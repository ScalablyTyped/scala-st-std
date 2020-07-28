package org.scalablytyped.std.global

import org.scalablytyped.std.MouseEventInit
import org.scalablytyped.std.Window
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MouseEvent")
@js.native
class MouseEvent protected ()
  extends org.scalablytyped.std.MouseEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: MouseEventInit) = this()
  /* CompleteClass */
  override val AT_TARGET: Double = js.native
  /* CompleteClass */
  override val BUBBLING_PHASE: Double = js.native
  /* CompleteClass */
  override val CAPTURING_PHASE: Double = js.native
  /* CompleteClass */
  override val altKey: scala.Boolean = js.native
  /* CompleteClass */
  override val bubbles: scala.Boolean = js.native
  /* CompleteClass */
  override val button: Double = js.native
  /* CompleteClass */
  override val buttons: Double = js.native
  /* CompleteClass */
  override var cancelBubble: scala.Boolean = js.native
  /* CompleteClass */
  override val cancelable: scala.Boolean = js.native
  /* CompleteClass */
  override val clientX: Double = js.native
  /* CompleteClass */
  override val clientY: Double = js.native
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
  override val fromElement: org.scalablytyped.std.Element = js.native
  /* CompleteClass */
  override val isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override val layerX: Double = js.native
  /* CompleteClass */
  override val layerY: Double = js.native
  /* CompleteClass */
  override val metaKey: scala.Boolean = js.native
  /* CompleteClass */
  override val movementX: Double = js.native
  /* CompleteClass */
  override val movementY: Double = js.native
  /* CompleteClass */
  override val offsetX: Double = js.native
  /* CompleteClass */
  override val offsetY: Double = js.native
  /* CompleteClass */
  override val pageX: Double = js.native
  /* CompleteClass */
  override val pageY: Double = js.native
  /* CompleteClass */
  override val relatedTarget: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override var returnValue: scala.Boolean = js.native
  /* CompleteClass */
  override val screenX: Double = js.native
  /* CompleteClass */
  override val screenY: Double = js.native
  /* CompleteClass */
  override val shiftKey: scala.Boolean = js.native
  /* CompleteClass */
  override val srcElement: org.scalablytyped.std.Element | Null = js.native
  /* CompleteClass */
  override val target: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override val timeStamp: Double = js.native
  /* CompleteClass */
  override val toElement: org.scalablytyped.std.Element = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override val view: Window = js.native
  /* CompleteClass */
  override val which: Double = js.native
  /* CompleteClass */
  override val x: Double = js.native
  /* CompleteClass */
  override val y: Double = js.native
  /* CompleteClass */
  override def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): Unit = js.native
  /* CompleteClass */
  override def initMouseEvent(
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
    relatedTargetArg: org.scalablytyped.std.EventTarget
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

@JSGlobal("MouseEvent")
@js.native
object MouseEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.MouseEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ MouseEventInit, 
      org.scalablytyped.std.MouseEvent
    ]
