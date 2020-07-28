package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- `org.scalablytyped`.std.SVGStylable because var conflicts: className. Inlined style */ @js.native
trait SVGMarkerElement
  extends SVGElement
     with SVGLangSpace
     with SVGExternalResourcesRequired
     with SVGFitToViewBox {
  var SVG_MARKERUNITS_STROKEWIDTH: Double = js.native
  var SVG_MARKERUNITS_UNKNOWN: Double = js.native
  var SVG_MARKERUNITS_USERSPACEONUSE: Double = js.native
  var SVG_MARKER_ORIENT_ANGLE: Double = js.native
  var SVG_MARKER_ORIENT_AUTO: Double = js.native
  var SVG_MARKER_ORIENT_UNKNOWN: Double = js.native
  var markerHeight: SVGAnimatedLength = js.native
  var markerUnits: SVGAnimatedEnumeration = js.native
  var markerWidth: SVGAnimatedLength = js.native
  var orientAngle: SVGAnimatedAngle = js.native
  var orientType: SVGAnimatedEnumeration = js.native
  var refX: SVGAnimatedLength = js.native
  var refY: SVGAnimatedLength = js.native
  var style: CSSStyleDeclaration = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  def setOrientToAngle(angle: SVGAngle): Unit = js.native
  def setOrientToAuto(): Unit = js.native
}

