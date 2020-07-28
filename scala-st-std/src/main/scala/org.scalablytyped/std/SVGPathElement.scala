package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- `org.scalablytyped`.std.SVGStylable because var conflicts: className. Inlined style */ @js.native
trait SVGPathElement
  extends SVGElement
     with SVGTransformable
     with SVGTests
     with SVGLangSpace
     with SVGExternalResourcesRequired
     with SVGAnimatedPathData {
  var style: CSSStyleDeclaration = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  def createSVGPathSegArcAbs(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: scala.Boolean,
    sweepFlag: scala.Boolean
  ): SVGPathSegArcAbs = js.native
  def createSVGPathSegArcRel(
    x: Double,
    y: Double,
    r1: Double,
    r2: Double,
    angle: Double,
    largeArcFlag: scala.Boolean,
    sweepFlag: scala.Boolean
  ): SVGPathSegArcRel = js.native
  def createSVGPathSegClosePath(): SVGPathSegClosePath = js.native
  def createSVGPathSegCurvetoCubicAbs(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): SVGPathSegCurvetoCubicAbs = js.native
  def createSVGPathSegCurvetoCubicRel(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): SVGPathSegCurvetoCubicRel = js.native
  def createSVGPathSegCurvetoCubicSmoothAbs(x: Double, y: Double, x2: Double, y2: Double): SVGPathSegCurvetoCubicSmoothAbs = js.native
  def createSVGPathSegCurvetoCubicSmoothRel(x: Double, y: Double, x2: Double, y2: Double): SVGPathSegCurvetoCubicSmoothRel = js.native
  def createSVGPathSegCurvetoQuadraticAbs(x: Double, y: Double, x1: Double, y1: Double): SVGPathSegCurvetoQuadraticAbs = js.native
  def createSVGPathSegCurvetoQuadraticRel(x: Double, y: Double, x1: Double, y1: Double): SVGPathSegCurvetoQuadraticRel = js.native
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: Double, y: Double): SVGPathSegCurvetoQuadraticSmoothAbs = js.native
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: Double, y: Double): SVGPathSegCurvetoQuadraticSmoothRel = js.native
  def createSVGPathSegLinetoAbs(x: Double, y: Double): SVGPathSegLinetoAbs = js.native
  def createSVGPathSegLinetoHorizontalAbs(x: Double): SVGPathSegLinetoHorizontalAbs = js.native
  def createSVGPathSegLinetoHorizontalRel(x: Double): SVGPathSegLinetoHorizontalRel = js.native
  def createSVGPathSegLinetoRel(x: Double, y: Double): SVGPathSegLinetoRel = js.native
  def createSVGPathSegLinetoVerticalAbs(y: Double): SVGPathSegLinetoVerticalAbs = js.native
  def createSVGPathSegLinetoVerticalRel(y: Double): SVGPathSegLinetoVerticalRel = js.native
  def createSVGPathSegMovetoAbs(x: Double, y: Double): SVGPathSegMovetoAbs = js.native
  def createSVGPathSegMovetoRel(x: Double, y: Double): SVGPathSegMovetoRel = js.native
  def getPathSegAtLength(distance: Double): Double = js.native
  def getPointAtLength(distance: Double): SVGPoint = js.native
  def getTotalLength(): Double = js.native
}

