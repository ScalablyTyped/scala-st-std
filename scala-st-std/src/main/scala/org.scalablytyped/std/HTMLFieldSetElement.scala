package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLFieldSetElement extends HTMLElement {
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    */
  var align: java.lang.String = js.native
  var disabled: scala.Boolean = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  var form: HTMLFormElement = js.native
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    */
  var validationMessage: java.lang.String = js.native
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    */
  var validity: ValidityState = js.native
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    */
  var willValidate: scala.Boolean = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  def setCustomValidity(error: java.lang.String): Unit = js.native
}

