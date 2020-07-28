package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- `org.scalablytyped`.std.SVGStylable because var conflicts: className. Inlined style */ @js.native
trait SVGMaskElement
  extends SVGElement
     with SVGTests
     with SVGLangSpace
     with SVGExternalResourcesRequired
     with SVGUnitTypes {
  var height: SVGAnimatedLength = js.native
  var maskContentUnits: SVGAnimatedEnumeration = js.native
  var maskUnits: SVGAnimatedEnumeration = js.native
  var style: CSSStyleDeclaration = js.native
  var width: SVGAnimatedLength = js.native
  var x: SVGAnimatedLength = js.native
  var y: SVGAnimatedLength = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

