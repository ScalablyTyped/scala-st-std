package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLTableCellElement
  extends HTMLElement
     with HTMLTableAlignment {
  /**
    * Sets or retrieves abbreviated text for the object.
    */
  var abbr: java.lang.String = js.native
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    */
  var align: java.lang.String = js.native
  /**
    * Sets or retrieves a comma-delimited list of conceptual categories associated with the object.
    */
  var axis: java.lang.String = js.native
  var bgColor: js.Any = js.native
  /**
    * Retrieves the position of the object in the cells collection of a row.
    */
  val cellIndex: Double = js.native
  /**
    * Sets or retrieves the number columns in the table that the object should span.
    */
  var colSpan: Double = js.native
  /**
    * Sets or retrieves a list of header cells that provide information for the object.
    */
  var headers: java.lang.String = js.native
  /**
    * Sets or retrieves the height of the object.
    */
  var height: js.Any = js.native
  /**
    * Sets or retrieves whether the browser automatically performs wordwrap.
    */
  var noWrap: scala.Boolean = js.native
  /**
    * Sets or retrieves how many rows in a table the cell should span.
    */
  var rowSpan: Double = js.native
  /**
    * Sets or retrieves the group of cells in a table to which the object's information applies.
    */
  var scope: java.lang.String = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var width: java.lang.String = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

