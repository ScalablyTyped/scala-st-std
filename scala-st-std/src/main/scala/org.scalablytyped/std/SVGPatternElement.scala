package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- `org.scalablytyped`.std.SVGStylable because var conflicts: className. Inlined style */ @js.native
trait SVGPatternElement
  extends SVGElement
     with SVGTests
     with SVGLangSpace
     with SVGExternalResourcesRequired
     with SVGFitToViewBox
     with SVGURIReference
     with SVGUnitTypes {
  val height: SVGAnimatedLength = js.native
  val patternContentUnits: SVGAnimatedEnumeration = js.native
  val patternTransform: SVGAnimatedTransformList = js.native
  val patternUnits: SVGAnimatedEnumeration = js.native
  val style: CSSStyleDeclaration = js.native
  val width: SVGAnimatedLength = js.native
  val x: SVGAnimatedLength = js.native
  val y: SVGAnimatedLength = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

