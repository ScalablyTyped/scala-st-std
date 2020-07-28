package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationEvent extends Event {
  val ADDITION: Double = js.native
  val MODIFICATION: Double = js.native
  val REMOVAL: Double = js.native
  val attrChange: Double = js.native
  val attrName: java.lang.String = js.native
  val newValue: java.lang.String = js.native
  val prevValue: java.lang.String = js.native
  val relatedNode: Node = js.native
  def initMutationEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    relatedNodeArg: Node,
    prevValueArg: java.lang.String,
    newValueArg: java.lang.String,
    attrNameArg: java.lang.String,
    attrChangeArg: Double
  ): Unit = js.native
}

