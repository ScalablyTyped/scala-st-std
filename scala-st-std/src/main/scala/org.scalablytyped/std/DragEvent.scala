package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragEvent extends MouseEvent {
  var dataTransfer: DataTransfer = js.native
  def initDragEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: Double,
    relatedTargetArg: EventTarget,
    dataTransferArg: DataTransfer
  ): Unit = js.native
  def msConvertURL(file: File, targetType: java.lang.String): Unit = js.native
  def msConvertURL(file: File, targetType: java.lang.String, targetURL: java.lang.String): Unit = js.native
}

