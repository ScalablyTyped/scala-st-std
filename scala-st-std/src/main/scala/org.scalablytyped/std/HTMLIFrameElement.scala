package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLIFrameElement
  extends HTMLElement
     with GetSVGDocument {
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    */
  var align: java.lang.String = js.native
  var allowFullscreen: scala.Boolean = js.native
  var allowPaymentRequest: scala.Boolean = js.native
  /**
    * Specifies the properties of a border drawn around an object.
    */
  var border: java.lang.String = js.native
  /**
    * Retrieves the document object of the page or frame.
    */
  val contentDocument: Document = js.native
  /**
    * Retrieves the object of the specified.
    */
  val contentWindow: Window = js.native
  /**
    * Sets or retrieves whether to display a border for the frame.
    */
  var frameBorder: java.lang.String = js.native
  /**
    * Sets or retrieves the amount of additional space between the frames.
    */
  var frameSpacing: js.Any = js.native
  /**
    * Sets or retrieves the height of the object.
    */
  var height: java.lang.String = js.native
  /**
    * Sets or retrieves the horizontal margin for the object.
    */
  var hspace: Double = js.native
  /**
    * Sets or retrieves a URI to a long description of the object.
    */
  var longDesc: java.lang.String = js.native
  /**
    * Sets or retrieves the top and bottom margin heights before displaying the text in a frame.
    */
  var marginHeight: java.lang.String = js.native
  /**
    * Sets or retrieves the left and right margin widths before displaying the text in a frame.
    */
  var marginWidth: java.lang.String = js.native
  /**
    * Sets or retrieves the frame name.
    */
  var name: java.lang.String = js.native
  /**
    * Sets or retrieves whether the user can resize the frame.
    */
  var noResize: scala.Boolean = js.native
  val sandbox: DOMSettableTokenList = js.native
  /**
    * Sets or retrieves whether the frame can be scrolled.
    */
  var scrolling: java.lang.String = js.native
  /**
    * Sets or retrieves a URL to be loaded by the object.
    */
  var src: java.lang.String = js.native
  /**
    * Sets or retrieves the vertical margin for the object.
    */
  var vspace: Double = js.native
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

