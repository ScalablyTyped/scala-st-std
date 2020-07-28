package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFEColorMatrixElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Double = js.native
  val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Double = js.native
  val SVG_FECOLORMATRIX_TYPE_MATRIX: Double = js.native
  val SVG_FECOLORMATRIX_TYPE_SATURATE: Double = js.native
  val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Double = js.native
  val in1: SVGAnimatedString = js.native
  val `type`: SVGAnimatedEnumeration = js.native
  val values: SVGAnimatedNumberList = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

