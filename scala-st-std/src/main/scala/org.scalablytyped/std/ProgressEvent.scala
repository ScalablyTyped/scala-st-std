package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressEvent extends Event {
  val lengthComputable: scala.Boolean = js.native
  val loaded: Double = js.native
  val total: Double = js.native
  def initProgressEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    lengthComputableArg: scala.Boolean,
    loadedArg: Double,
    totalArg: Double
  ): Unit = js.native
}

