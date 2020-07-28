package org.scalablytyped.std.global

import org.scalablytyped.std.ErrorEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ErrorEvent")
@js.native
class ErrorEvent protected ()
  extends org.scalablytyped.std.ErrorEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, errorEventInitDict: ErrorEventInit) = this()
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
  override val colno: Double = js.native
  /* CompleteClass */
  override val currentTarget: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override val defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override val error: js.Any = js.native
  /* CompleteClass */
  override val eventPhase: Double = js.native
  /* CompleteClass */
  override val filename: java.lang.String = js.native
  /* CompleteClass */
  override val isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override val lineno: Double = js.native
  /* CompleteClass */
  override val message: java.lang.String = js.native
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
  override def deepPath(): js.Array[org.scalablytyped.std.EventTarget] = js.native
  /* CompleteClass */
  override def initErrorEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    messageArg: java.lang.String,
    filenameArg: java.lang.String,
    linenoArg: Double
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

@JSGlobal("ErrorEvent")
@js.native
object ErrorEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.ErrorEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* errorEventInitDict */ ErrorEventInit, 
      org.scalablytyped.std.ErrorEvent
    ]

