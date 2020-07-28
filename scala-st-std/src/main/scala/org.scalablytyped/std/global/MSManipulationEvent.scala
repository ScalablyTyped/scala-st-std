package org.scalablytyped.std.global

import org.scalablytyped.std.Window
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSManipulationEvent")
@js.native
class MSManipulationEvent ()
  extends org.scalablytyped.std.MSManipulationEvent {
  /* CompleteClass */
  override val AT_TARGET: Double = js.native
  /* CompleteClass */
  override val BUBBLING_PHASE: Double = js.native
  /* CompleteClass */
  override val CAPTURING_PHASE: Double = js.native
  /* CompleteClass */
  override val MS_MANIPULATION_STATE_ACTIVE: Double = js.native
  /* CompleteClass */
  override val MS_MANIPULATION_STATE_CANCELLED: Double = js.native
  /* CompleteClass */
  override val MS_MANIPULATION_STATE_COMMITTED: Double = js.native
  /* CompleteClass */
  override val MS_MANIPULATION_STATE_DRAGGING: Double = js.native
  /* CompleteClass */
  override val MS_MANIPULATION_STATE_INERTIA: Double = js.native
  /* CompleteClass */
  override val MS_MANIPULATION_STATE_PRESELECT: Double = js.native
  /* CompleteClass */
  override val MS_MANIPULATION_STATE_SELECTING: Double = js.native
  /* CompleteClass */
  override val MS_MANIPULATION_STATE_STOPPED: Double = js.native
  /* CompleteClass */
  override val bubbles: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelBubble: scala.Boolean = js.native
  /* CompleteClass */
  override val cancelable: scala.Boolean = js.native
  /* CompleteClass */
  override val currentState: Double = js.native
  /* CompleteClass */
  override val currentTarget: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override val defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override val detail: Double = js.native
  /* CompleteClass */
  override val eventPhase: Double = js.native
  /* CompleteClass */
  override val inertiaDestinationX: Double = js.native
  /* CompleteClass */
  override val inertiaDestinationY: Double = js.native
  /* CompleteClass */
  override val isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override val lastState: Double = js.native
  /* CompleteClass */
  override var returnValue: scala.Boolean = js.native
  /* CompleteClass */
  override val scoped: scala.Boolean = js.native
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
  override def deepPath(): js.Array[org.scalablytyped.std.EventTarget] = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): Unit = js.native
  /* CompleteClass */
  override def initMSManipulationEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    lastState: Double,
    currentState: Double
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

@JSGlobal("MSManipulationEvent")
@js.native
object MSManipulationEvent
  extends Instantiable0[org.scalablytyped.std.MSManipulationEvent] {
  val MS_MANIPULATION_STATE_ACTIVE: Double = js.native
  val MS_MANIPULATION_STATE_CANCELLED: Double = js.native
  val MS_MANIPULATION_STATE_COMMITTED: Double = js.native
  val MS_MANIPULATION_STATE_DRAGGING: Double = js.native
  val MS_MANIPULATION_STATE_INERTIA: Double = js.native
  val MS_MANIPULATION_STATE_PRESELECT: Double = js.native
  val MS_MANIPULATION_STATE_SELECTING: Double = js.native
  val MS_MANIPULATION_STATE_STOPPED: Double = js.native
}

