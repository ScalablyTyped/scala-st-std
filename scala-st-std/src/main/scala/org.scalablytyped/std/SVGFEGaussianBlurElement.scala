package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- `org.scalablytyped`.std.SVGStylable because var conflicts: className. Inlined style
- `org.scalablytyped`.std.SVGFilterPrimitiveStandardAttributes because var conflicts: className. Inlined height, result, width, x, y */ @js.native
trait SVGFEGaussianBlurElement extends SVGElement {
  var height: SVGAnimatedLength = js.native
  var in1: SVGAnimatedString = js.native
  var result: SVGAnimatedString = js.native
  var stdDeviationX: SVGAnimatedNumber = js.native
  var stdDeviationY: SVGAnimatedNumber = js.native
  var style: CSSStyleDeclaration = js.native
  var width: SVGAnimatedLength = js.native
  var x: SVGAnimatedLength = js.native
  var y: SVGAnimatedLength = js.native
  def setStdDeviation(stdDeviationX: Double, stdDeviationY: Double): Unit = js.native
}

