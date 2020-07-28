package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- `org.scalablytyped`.std.SVGStylable because var conflicts: className. Inlined style
- `org.scalablytyped`.std.SVGFilterPrimitiveStandardAttributes because var conflicts: className. Inlined height, result, width, x, y */ @js.native
trait SVGFEImageElement
  extends SVGElement
     with SVGLangSpace
     with SVGURIReference
     with SVGExternalResourcesRequired {
  var height: SVGAnimatedLength = js.native
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  var result: SVGAnimatedString = js.native
  var style: CSSStyleDeclaration = js.native
  var width: SVGAnimatedLength = js.native
  var x: SVGAnimatedLength = js.native
  var y: SVGAnimatedLength = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

