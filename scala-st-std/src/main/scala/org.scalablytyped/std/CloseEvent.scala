package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseEvent extends Event {
  val code: Double = js.native
  val reason: java.lang.String = js.native
  val wasClean: scala.Boolean = js.native
  /** @deprecated */
  def initCloseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    wasCleanArg: scala.Boolean,
    codeArg: Double,
    reasonArg: java.lang.String
  ): Unit = js.native
}

