package org.scalablytyped.std.global

import org.scalablytyped.std.Window
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSGestureEvent")
@js.native
class MSGestureEvent ()
  extends org.scalablytyped.std.MSGestureEvent {
  /* CompleteClass */
  override val AT_TARGET: Double = js.native
  /* CompleteClass */
  override val BUBBLING_PHASE: Double = js.native
  /* CompleteClass */
  override val CAPTURING_PHASE: Double = js.native
  /* CompleteClass */
  override val MSGESTURE_FLAG_BEGIN: Double = js.native
  /* CompleteClass */
  override val MSGESTURE_FLAG_CANCEL: Double = js.native
  /* CompleteClass */
  override val MSGESTURE_FLAG_END: Double = js.native
  /* CompleteClass */
  override val MSGESTURE_FLAG_INERTIA: Double = js.native
  /* CompleteClass */
  override val MSGESTURE_FLAG_NONE: Double = js.native
  /* CompleteClass */
  override val bubbles: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelBubble: scala.Boolean = js.native
  /* CompleteClass */
  override val cancelable: scala.Boolean = js.native
  /* CompleteClass */
  override val clientX: Double = js.native
  /* CompleteClass */
  override val clientY: Double = js.native
  /* CompleteClass */
  override val currentTarget: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override val defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override val detail: Double = js.native
  /* CompleteClass */
  override val eventPhase: Double = js.native
  /* CompleteClass */
  override val expansion: Double = js.native
  /* CompleteClass */
  override val gestureObject: js.Any = js.native
  /* CompleteClass */
  override val hwTimestamp: Double = js.native
  /* CompleteClass */
  override val isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override val offsetX: Double = js.native
  /* CompleteClass */
  override val offsetY: Double = js.native
  /* CompleteClass */
  override var returnValue: scala.Boolean = js.native
  /* CompleteClass */
  override val rotation: Double = js.native
  /* CompleteClass */
  override val scale: Double = js.native
  /* CompleteClass */
  override val screenX: Double = js.native
  /* CompleteClass */
  override val screenY: Double = js.native
  /* CompleteClass */
  override val srcElement: org.scalablytyped.std.Element | Null = js.native
  /* CompleteClass */
  override val target: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override val timeStamp: Double = js.native
  /* CompleteClass */
  override val translationX: Double = js.native
  /* CompleteClass */
  override val translationY: Double = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override val velocityAngular: Double = js.native
  /* CompleteClass */
  override val velocityExpansion: Double = js.native
  /* CompleteClass */
  override val velocityX: Double = js.native
  /* CompleteClass */
  override val velocityY: Double = js.native
  /* CompleteClass */
  override val view: Window = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): Unit = js.native
  /* CompleteClass */
  override def initGestureEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    offsetXArg: Double,
    offsetYArg: Double,
    translationXArg: Double,
    translationYArg: Double,
    scaleArg: Double,
    expansionArg: Double,
    rotationArg: Double,
    velocityXArg: Double,
    velocityYArg: Double,
    velocityExpansionArg: Double,
    velocityAngularArg: Double,
    hwTimestampArg: Double
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

@JSGlobal("MSGestureEvent")
@js.native
object MSGestureEvent
  extends Instantiable0[org.scalablytyped.std.MSGestureEvent] {
  val MSGESTURE_FLAG_BEGIN: Double = js.native
  val MSGESTURE_FLAG_CANCEL: Double = js.native
  val MSGESTURE_FLAG_END: Double = js.native
  val MSGESTURE_FLAG_INERTIA: Double = js.native
  val MSGESTURE_FLAG_NONE: Double = js.native
}

