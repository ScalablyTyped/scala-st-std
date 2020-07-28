package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGTextPathElement
  extends SVGTextContentElement
     with SVGURIReference {
  var TEXTPATH_METHODTYPE_ALIGN: Double = js.native
  var TEXTPATH_METHODTYPE_STRETCH: Double = js.native
  var TEXTPATH_METHODTYPE_UNKNOWN: Double = js.native
  var TEXTPATH_SPACINGTYPE_AUTO: Double = js.native
  var TEXTPATH_SPACINGTYPE_EXACT: Double = js.native
  var TEXTPATH_SPACINGTYPE_UNKNOWN: Double = js.native
  var method: SVGAnimatedEnumeration = js.native
  var spacing: SVGAnimatedEnumeration = js.native
  var startOffset: SVGAnimatedLength = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

