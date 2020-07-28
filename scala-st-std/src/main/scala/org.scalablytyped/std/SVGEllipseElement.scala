package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- `org.scalablytyped`.std.SVGStylable because var conflicts: className. Inlined style */ @js.native
trait SVGEllipseElement
  extends SVGElement
     with SVGTransformable
     with SVGTests
     with SVGLangSpace
     with SVGExternalResourcesRequired {
  var cx: SVGAnimatedLength = js.native
  var cy: SVGAnimatedLength = js.native
  var rx: SVGAnimatedLength = js.native
  var ry: SVGAnimatedLength = js.native
  var style: CSSStyleDeclaration = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

