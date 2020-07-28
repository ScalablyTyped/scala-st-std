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
  override var AT_TARGET: Double = js.native
  /* CompleteClass */
  override var BUBBLING_PHASE: Double = js.native
  /* CompleteClass */
  override var CAPTURING_PHASE: Double = js.native
  /* CompleteClass */
  override var MS_MANIPULATION_STATE_ACTIVE: Double = js.native
  /* CompleteClass */
  override var MS_MANIPULATION_STATE_CANCELLED: Double = js.native
  /* CompleteClass */
  override var MS_MANIPULATION_STATE_COMMITTED: Double = js.native
  /* CompleteClass */
  override var MS_MANIPULATION_STATE_DRAGGING: Double = js.native
  /* CompleteClass */
  override var MS_MANIPULATION_STATE_INERTIA: Double = js.native
  /* CompleteClass */
  override var MS_MANIPULATION_STATE_PRESELECT: Double = js.native
  /* CompleteClass */
  override var MS_MANIPULATION_STATE_SELECTING: Double = js.native
  /* CompleteClass */
  override var MS_MANIPULATION_STATE_STOPPED: Double = js.native
  /* CompleteClass */
  override var bubbles: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelBubble: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelable: scala.Boolean = js.native
  /* CompleteClass */
  override var currentState: Double = js.native
  /* CompleteClass */
  override var currentTarget: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override var defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override var detail: Double = js.native
  /* CompleteClass */
  override var eventPhase: Double = js.native
  /* CompleteClass */
  override var inertiaDestinationX: Double = js.native
  /* CompleteClass */
  override var inertiaDestinationY: Double = js.native
  /* CompleteClass */
  override var isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override var lastState: Double = js.native
  /* CompleteClass */
  override var returnValue: scala.Boolean = js.native
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
  var MS_MANIPULATION_STATE_ACTIVE: Double = js.native
  var MS_MANIPULATION_STATE_CANCELLED: Double = js.native
  var MS_MANIPULATION_STATE_COMMITTED: Double = js.native
  var MS_MANIPULATION_STATE_DRAGGING: Double = js.native
  var MS_MANIPULATION_STATE_INERTIA: Double = js.native
  var MS_MANIPULATION_STATE_PRESELECT: Double = js.native
  var MS_MANIPULATION_STATE_SELECTING: Double = js.native
  var MS_MANIPULATION_STATE_STOPPED: Double = js.native
}

