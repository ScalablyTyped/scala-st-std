package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLHRElement
  extends HTMLElement
     with DOML2DeprecatedColorProperty
     with DOML2DeprecatedSizeProperty {
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    */
  var align: java.lang.String = js.native
  /**
    * Sets or retrieves whether the horizontal rule is drawn with 3-D shading.
    */
  var noShade: scala.Boolean = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var width: Double = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}
