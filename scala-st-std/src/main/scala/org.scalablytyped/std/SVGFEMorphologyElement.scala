package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGFEMorphologyElement interface corresponds to the <feMorphology> element. */
@js.native
trait SVGFEMorphologyElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_MORPHOLOGY_OPERATOR_DILATE: Double = js.native
  val SVG_MORPHOLOGY_OPERATOR_ERODE: Double = js.native
  val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Double = js.native
  val in1: SVGAnimatedString = js.native
  val operator: SVGAnimatedEnumeration = js.native
  val radiusX: SVGAnimatedNumber = js.native
  val radiusY: SVGAnimatedNumber = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
}

