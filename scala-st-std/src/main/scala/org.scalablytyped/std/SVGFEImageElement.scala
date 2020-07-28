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
  val height: SVGAnimatedLength = js.native
  val preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  val result: SVGAnimatedString = js.native
  val style: CSSStyleDeclaration = js.native
  val width: SVGAnimatedLength = js.native
  val x: SVGAnimatedLength = js.native
  val y: SVGAnimatedLength = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

