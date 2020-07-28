package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DeviceOrientationEvent")
@js.native
class DeviceOrientationEvent ()
  extends org.scalablytyped.std.DeviceOrientationEvent {
  /* CompleteClass */
  override var AT_TARGET: Double = js.native
  /* CompleteClass */
  override var BUBBLING_PHASE: Double = js.native
  /* CompleteClass */
  override var CAPTURING_PHASE: Double = js.native
  /* CompleteClass */
  override var absolute: scala.Boolean = js.native
  /* CompleteClass */
  override var alpha: Double = js.native
  /* CompleteClass */
  override var beta: Double = js.native
  /* CompleteClass */
  override var bubbles: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelBubble: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelable: scala.Boolean = js.native
  /* CompleteClass */
  override var currentTarget: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override var defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override var eventPhase: Double = js.native
  /* CompleteClass */
  override var gamma: Double = js.native
  /* CompleteClass */
  override var isTrusted: scala.Boolean = js.native
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
  override def initDeviceOrientationEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    alpha: Double,
    beta: Double,
    gamma: Double,
    absolute: scala.Boolean
  ): Unit = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): Unit = js.native
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}

@JSGlobal("DeviceOrientationEvent")
@js.native
object DeviceOrientationEvent
  extends Instantiable0[org.scalablytyped.std.DeviceOrientationEvent]

