package org.scalablytyped.std

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLFormElement
  extends HTMLElement
     with /* name */ StringDictionary[js.Any] {
  /**
    * Sets or retrieves a list of character encodings for input data that must be accepted by the server processing the form.
    */
  var acceptCharset: java.lang.String = js.native
  /**
    * Sets or retrieves the URL to which the form content is sent for processing.
    */
  var action: java.lang.String = js.native
  /**
    * Specifies whether autocomplete is applied to an editable text field.
    */
  var autocomplete: java.lang.String = js.native
  /**
    * Retrieves a collection, in source order, of all controls in a given form.
    */
  val elements: HTMLFormControlsCollection = js.native
  /**
    * Sets or retrieves the MIME encoding for the form.
    */
  var encoding: java.lang.String = js.native
  /**
    * Sets or retrieves the encoding type for the form.
    */
  var enctype: java.lang.String = js.native
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  val length: Double = js.native
  /**
    * Sets or retrieves how to send the form data to the server.
    */
  var method: java.lang.String = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
  /**
    * Designates a form that is not validated when submitted.
    */
  var noValidate: scala.Boolean = js.native
  /**
    * Sets or retrieves the window or frame at which to target content.
    */
  var target: java.lang.String = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  /**
    * Retrieves a form object or an object from an elements collection.
    * @param name Variant of type Number or String that specifies the object or collection to retrieve. If this parameter is a Number, it is the zero-based index of the object. If this parameter is a string, all objects with matching name or id properties are retrieved, and a collection is returned if more than one match is made.
    * @param index Variant of type Number that specifies the zero-based index of the object to retrieve when a collection is returned.
    */
  def item(): js.Any = js.native
  def item(name: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def item(name: js.Any): js.Any = js.native
  def item(name: js.Any, index: js.Any): js.Any = js.native
  /**
    * Retrieves a form object or an object from an elements collection.
    */
  def namedItem(name: java.lang.String): js.Any = js.native
  /**
    * Fires when the user resets a form.
    */
  def reset(): Unit = js.native
  /**
    * Fires when a FORM is about to be submitted.
    */
  def submit(): Unit = js.native
}

