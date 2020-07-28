package org.scalablytyped.std.global

import org.scalablytyped.std.Window
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEvent")
@js.native
class TextEvent ()
  extends org.scalablytyped.std.TextEvent {
  /* CompleteClass */
  override var AT_TARGET: Double = js.native
  /* CompleteClass */
  override var BUBBLING_PHASE: Double = js.native
  /* CompleteClass */
  override var CAPTURING_PHASE: Double = js.native
  /* CompleteClass */
  override var DOM_INPUT_METHOD_DROP: Double = js.native
  /* CompleteClass */
  override var DOM_INPUT_METHOD_HANDWRITING: Double = js.native
  /* CompleteClass */
  override var DOM_INPUT_METHOD_IME: Double = js.native
  /* CompleteClass */
  override var DOM_INPUT_METHOD_KEYBOARD: Double = js.native
  /* CompleteClass */
  override var DOM_INPUT_METHOD_MULTIMODAL: Double = js.native
  /* CompleteClass */
  override var DOM_INPUT_METHOD_OPTION: Double = js.native
  /* CompleteClass */
  override var DOM_INPUT_METHOD_PASTE: Double = js.native
  /* CompleteClass */
  override var DOM_INPUT_METHOD_SCRIPT: Double = js.native
  /* CompleteClass */
  override var DOM_INPUT_METHOD_UNKNOWN: Double = js.native
  /* CompleteClass */
  override var DOM_INPUT_METHOD_VOICE: Double = js.native
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
  override var inputMethod: Double = js.native
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
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): Unit = js.native
  /* CompleteClass */
  override def initTextEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    dataArg: java.lang.String,
    inputMethod: Double,
    locale: java.lang.String
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

@JSGlobal("TextEvent")
@js.native
object TextEvent
  extends Instantiable0[org.scalablytyped.std.TextEvent] {
  var DOM_INPUT_METHOD_DROP: Double = js.native
  var DOM_INPUT_METHOD_HANDWRITING: Double = js.native
  var DOM_INPUT_METHOD_IME: Double = js.native
  var DOM_INPUT_METHOD_KEYBOARD: Double = js.native
  var DOM_INPUT_METHOD_MULTIMODAL: Double = js.native
  var DOM_INPUT_METHOD_OPTION: Double = js.native
  var DOM_INPUT_METHOD_PASTE: Double = js.native
  var DOM_INPUT_METHOD_SCRIPT: Double = js.native
  var DOM_INPUT_METHOD_UNKNOWN: Double = js.native
  var DOM_INPUT_METHOD_VOICE: Double = js.native
}

