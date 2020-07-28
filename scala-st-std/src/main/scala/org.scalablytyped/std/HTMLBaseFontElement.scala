package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLBaseFontElement
  extends HTMLElement
     with DOML2DeprecatedColorProperty {
  /**
    * Sets or retrieves the current typeface family.
    */
  var face: java.lang.String = js.native
  /**
    * Sets or retrieves the font size of the object.
    */
  var size: Double = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

