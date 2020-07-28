package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionEvent extends Event {
  val elapsedTime: Double = js.native
  val propertyName: java.lang.String = js.native
  def initTransitionEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    propertyNameArg: java.lang.String,
    elapsedTimeArg: Double
  ): Unit = js.native
}

