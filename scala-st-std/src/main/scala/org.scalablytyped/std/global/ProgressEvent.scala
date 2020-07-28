package org.scalablytyped.std.global

import org.scalablytyped.std.ProgressEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ProgressEvent")
@js.native
class ProgressEvent protected ()
  extends org.scalablytyped.std.ProgressEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ProgressEventInit) = this()
  /* CompleteClass */
  override var AT_TARGET: Double = js.native
  /* CompleteClass */
  override var BUBBLING_PHASE: Double = js.native
  /* CompleteClass */
  override var CAPTURING_PHASE: Double = js.native
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
  override var isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override var lengthComputable: scala.Boolean = js.native
  /* CompleteClass */
  override var loaded: Double = js.native
  /* CompleteClass */
  override var returnValue: scala.Boolean = js.native
  /* CompleteClass */
  override var srcElement: org.scalablytyped.std.Element = js.native
  /* CompleteClass */
  override var target: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override var timeStamp: Double = js.native
  /* CompleteClass */
  override var total: Double = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): Unit = js.native
  /* CompleteClass */
  override def initProgressEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    lengthComputableArg: scala.Boolean,
    loadedArg: Double,
    totalArg: Double
  ): Unit = js.native
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}

@JSGlobal("ProgressEvent")
@js.native
object ProgressEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.ProgressEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ ProgressEventInit, 
      org.scalablytyped.std.ProgressEvent
    ]

