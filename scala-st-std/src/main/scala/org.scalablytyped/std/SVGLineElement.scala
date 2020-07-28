package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- `org.scalablytyped`.std.SVGStylable because var conflicts: className. Inlined style */ @js.native
trait SVGLineElement
  extends SVGElement
     with SVGTransformable
     with SVGTests
     with SVGLangSpace
     with SVGExternalResourcesRequired {
  var style: CSSStyleDeclaration = js.native
  var x1: SVGAnimatedLength = js.native
  var x2: SVGAnimatedLength = js.native
  var y1: SVGAnimatedLength = js.native
  var y2: SVGAnimatedLength = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

