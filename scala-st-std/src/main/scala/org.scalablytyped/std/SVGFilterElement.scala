package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFilterElement
  extends SVGElement
     with SVGUnitTypes
     with SVGURIReference {
  val filterResX: SVGAnimatedInteger = js.native
  val filterResY: SVGAnimatedInteger = js.native
  val filterUnits: SVGAnimatedEnumeration = js.native
  val height: SVGAnimatedLength = js.native
  val primitiveUnits: SVGAnimatedEnumeration = js.native
  val width: SVGAnimatedLength = js.native
  val x: SVGAnimatedLength = js.native
  val y: SVGAnimatedLength = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  def setFilterRes(filterResX: Double, filterResY: Double): Unit = js.native
}

