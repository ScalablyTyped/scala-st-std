package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  val AT_TARGET: Double = js.native
  val BUBBLING_PHASE: Double = js.native
  val CAPTURING_PHASE: Double = js.native
  val NONE: Double = js.native
  val bubbles: scala.Boolean = js.native
  var cancelBubble: scala.Boolean = js.native
  val cancelable: scala.Boolean = js.native
  val currentTarget: EventTarget | Null = js.native
  val defaultPrevented: scala.Boolean = js.native
  val eventPhase: Double = js.native
  val isTrusted: scala.Boolean = js.native
  var returnValue: scala.Boolean = js.native
  val scoped: scala.Boolean = js.native
  val srcElement: Element | Null = js.native
  val target: EventTarget | Null = js.native
  val timeStamp: Double = js.native
  val `type`: java.lang.String = js.native
  def deepPath(): js.Array[EventTarget] = js.native
  def initEvent(`type`: java.lang.String): Unit = js.native
  def initEvent(`type`: java.lang.String, bubbles: js.UndefOr[scala.Nothing], cancelable: scala.Boolean): Unit = js.native
  def initEvent(`type`: java.lang.String, bubbles: scala.Boolean): Unit = js.native
  def initEvent(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: scala.Boolean): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

