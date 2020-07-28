package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLTextAreaElement extends HTMLElement {
  /**
    * Provides a way to direct a user to a specific field when a document loads. This can provide both direction and convenience for a user, reducing the need to click or tab to a field when a page opens. This attribute is true when present on an element, and false when missing.
    */
  var autofocus: scala.Boolean = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var cols: Double = js.native
  /**
    * Sets or retrieves the initial contents of the object.
    */
  var defaultValue: java.lang.String = js.native
  var disabled: scala.Boolean = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement = js.native
  /**
    * Sets or retrieves the maximum number of characters that the user can enter in a text control.
    */
  var maxLength: Double = js.native
  var minLength: Double = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
  /**
    * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
    */
  var placeholder: java.lang.String = js.native
  /**
    * Sets or retrieves the value indicated whether the content of the object is read-only.
    */
  var readOnly: scala.Boolean = js.native
  /**
    * When present, marks an element that can't be submitted without a value.
    */
  var required: scala.Boolean = js.native
  /**
    * Sets or retrieves the number of horizontal rows contained in the object.
    */
  var rows: Double = js.native
  /**
    * Gets or sets the end position or offset of a text selection.
    */
  var selectionEnd: Double = js.native
  /**
    * Gets or sets the starting position or offset of a text selection.
    */
  var selectionStart: Double = js.native
  /**
    * Sets or retrieves the value indicating whether the control is selected.
    */
  var status: js.Any = js.native
  /**
    * Retrieves the type of control.
    */
  val `type`: java.lang.String = js.native
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    */
  val validationMessage: java.lang.String = js.native
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    */
  val validity: ValidityState = js.native
  /**
    * Retrieves or sets the text in the entry field of the textArea element.
    */
  var value: java.lang.String = js.native
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    */
  val willValidate: scala.Boolean = js.native
  /**
    * Sets or retrieves how to handle wordwrapping in the object.
    */
  var wrap: java.lang.String = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  /**
    * Highlights the input area of a form element.
    */
  def select(): Unit = js.native
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  /**
    * Sets the start and end positions of a selection in a text field.
    * @param start The offset into the text field for the start of the selection.
    * @param end The offset into the text field for the end of the selection.
    */
  def setSelectionRange(start: Double, end: Double): Unit = js.native
}
