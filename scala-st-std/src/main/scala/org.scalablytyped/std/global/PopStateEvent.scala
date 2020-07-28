package org.scalablytyped.std.global

import org.scalablytyped.std.PopStateEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PopStateEvent")
@js.native
class PopStateEvent protected ()
  extends org.scalablytyped.std.PopStateEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: PopStateEventInit) = this()
  /* CompleteClass */
  override val AT_TARGET: Double = js.native
  /* CompleteClass */
  override val BUBBLING_PHASE: Double = js.native
  /* CompleteClass */
  override val CAPTURING_PHASE: Double = js.native
  /* CompleteClass */
  override val bubbles: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelBubble: scala.Boolean = js.native
  /* CompleteClass */
  override val cancelable: scala.Boolean = js.native
  /* CompleteClass */
  override val currentTarget: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override val defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override val eventPhase: Double = js.native
  /* CompleteClass */
  override val isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override var returnValue: scala.Boolean = js.native
  /* CompleteClass */
  override val scoped: scala.Boolean = js.native
  /* CompleteClass */
  override val srcElement: org.scalablytyped.std.Element | Null = js.native
  /* CompleteClass */
  override val state: js.Any = js.native
  /* CompleteClass */
  override val target: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override val timeStamp: Double = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /* CompleteClass */
  override def deepPath(): js.Array[org.scalablytyped.std.EventTarget] = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): Unit = js.native
  /* CompleteClass */
  override def initPopStateEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    stateArg: js.Any
  ): Unit = js.native
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}

@JSGlobal("PopStateEvent")
@js.native
object PopStateEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.PopStateEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ PopStateEventInit, 
      org.scalablytyped.std.PopStateEvent
    ]

