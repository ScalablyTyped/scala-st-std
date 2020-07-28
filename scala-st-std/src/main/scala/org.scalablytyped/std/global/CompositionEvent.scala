package org.scalablytyped.std.global

import org.scalablytyped.std.CompositionEventInit
import org.scalablytyped.std.Window
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CompositionEvent")
@js.native
class CompositionEvent protected ()
  extends org.scalablytyped.std.CompositionEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: CompositionEventInit) = this()
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
  override var data: java.lang.String = js.native
  /* CompleteClass */
  override var defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override var detail: Double = js.native
  /* CompleteClass */
  override var eventPhase: Double = js.native
  /* CompleteClass */
  override var isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override var locale: java.lang.String = js.native
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
  override def initCompositionEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    dataArg: java.lang.String,
    locale: java.lang.String
  ): Unit = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): Unit = js.native
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

@JSGlobal("CompositionEvent")
@js.native
object CompositionEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.CompositionEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ CompositionEventInit, 
      org.scalablytyped.std.CompositionEvent
    ]

