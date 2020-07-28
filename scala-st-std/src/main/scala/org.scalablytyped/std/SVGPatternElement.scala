package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPatternElement
  extends SVGElement
     with SVGTests
     with SVGUnitTypes
     with SVGFitToViewBox
     with SVGURIReference {
  val height: SVGAnimatedLength = js.native
  val patternContentUnits: SVGAnimatedEnumeration = js.native
  val patternTransform: SVGAnimatedTransformList = js.native
  val patternUnits: SVGAnimatedEnumeration = js.native
  val width: SVGAnimatedLength = js.native
  val x: SVGAnimatedLength = js.native
  val y: SVGAnimatedLength = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

