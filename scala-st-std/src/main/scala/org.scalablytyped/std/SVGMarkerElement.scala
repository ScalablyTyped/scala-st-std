package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGMarkerElement
  extends SVGElement
     with SVGFitToViewBox {
  val SVG_MARKERUNITS_STROKEWIDTH: Double = js.native
  val SVG_MARKERUNITS_UNKNOWN: Double = js.native
  val SVG_MARKERUNITS_USERSPACEONUSE: Double = js.native
  val SVG_MARKER_ORIENT_ANGLE: Double = js.native
  val SVG_MARKER_ORIENT_AUTO: Double = js.native
  val SVG_MARKER_ORIENT_UNKNOWN: Double = js.native
  val markerHeight: SVGAnimatedLength = js.native
  val markerUnits: SVGAnimatedEnumeration = js.native
  val markerWidth: SVGAnimatedLength = js.native
  val orientAngle: SVGAnimatedAngle = js.native
  val orientType: SVGAnimatedEnumeration = js.native
  val refX: SVGAnimatedLength = js.native
  val refY: SVGAnimatedLength = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  def setOrientToAngle(angle: SVGAngle): Unit = js.native
  def setOrientToAuto(): Unit = js.native
}

