package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLTableColElement
  extends HTMLElement
     with HTMLTableAlignment {
  /**
    * Sets or retrieves the alignment of the object relative to the display or table.
    */
  var align: java.lang.String = js.native
  /**
    * Sets or retrieves the number of columns in the group.
    */
  var span: Double = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var width: js.Any = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

