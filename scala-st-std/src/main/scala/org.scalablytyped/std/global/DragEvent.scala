package org.scalablytyped.std.global

import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.drag
import org.scalablytyped.std.stdStrings.dragend
import org.scalablytyped.std.stdStrings.dragenter
import org.scalablytyped.std.stdStrings.dragexit
import org.scalablytyped.std.stdStrings.dragleave
import org.scalablytyped.std.stdStrings.dragover
import org.scalablytyped.std.stdStrings.dragstart
import org.scalablytyped.std.stdStrings.drop
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DragEvent")
@js.native
class DragEvent protected ()
  extends org.scalablytyped.std.DragEvent {
  def this(`type`: drag) = this()
  def this(`type`: dragend) = this()
  def this(`type`: dragenter) = this()
  def this(`type`: dragexit) = this()
  def this(`type`: dragleave) = this()
  def this(`type`: dragover) = this()
  def this(`type`: dragstart) = this()
  def this(`type`: drop) = this()
  def this(`type`: drag, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: dragend, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: dragenter, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: dragexit, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: dragleave, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: dragover, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: dragstart, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
  def this(`type`: drop, dragEventInit: org.scalablytyped.std.anon.DataTransfer) = this()
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
  override val detail: Double = js.native
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

@JSGlobal("DragEvent")
@js.native
object DragEvent
  extends Instantiable1[
      drag | dragend | dragenter | dragexit | dragleave | dragover | dragstart | drop, 
      org.scalablytyped.std.DragEvent
    ]
     with Instantiable2[
      drag | dragend | dragenter | dragexit | dragleave | dragover | dragstart | drop, 
      /* dragEventInit */ org.scalablytyped.std.anon.DataTransfer, 
      org.scalablytyped.std.DragEvent
    ]

