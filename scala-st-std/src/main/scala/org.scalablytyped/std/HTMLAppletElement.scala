package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAppletElement extends HTMLElement {
  /**
    * Retrieves a string of the URL where the object tag can be found. This is often the href of the document that the object is in, or the value set by a base element.
    */
  val BaseHref: java.lang.String = js.native
  var align: java.lang.String = js.native
  /**
    * Sets or retrieves a text alternative to the graphic.
    */
  var alt: java.lang.String = js.native
  /**
    * Gets or sets the optional alternative HTML script to execute if the object fails to load.
    */
  var altHtml: java.lang.String = js.native
  /**
    * Sets or retrieves a character string that can be used to implement your own archive functionality for the object.
    */
  var archive: java.lang.String = js.native
  var border: java.lang.String = js.native
  var code: java.lang.String = js.native
  /**
    * Sets or retrieves the URL of the component.
    */
  var codeBase: java.lang.String = js.native
  /**
    * Sets or retrieves the Internet media type for the code associated with the object.
    */
  var codeType: java.lang.String = js.native
  /**
    * Address of a pointer to the document this page or frame contains. If there is no document, then null will be returned.
    */
  val contentDocument: Document = js.native
  /**
    * Sets or retrieves the URL that references the data of the object.
    */
  var data: java.lang.String = js.native
  /**
    * Sets or retrieves a character string that can be used to implement your own declare functionality for the object.
    */
  var declare: scala.Boolean = js.native
  val form: HTMLFormElement = js.native
  /**
    * Sets or retrieves the height of the object.
    */
  var height: java.lang.String = js.native
  var hspace: Double = js.native
  /**
    * Sets or retrieves the shape of the object.
    */
  var name: java.lang.String = js.native
  var `object`: java.lang.String | Null = js.native
  /**
    * Sets or retrieves a message to be displayed while an object is loading.
    */
  var standby: java.lang.String = js.native
  /**
    * Returns the content type of the object.
    */
  var `type`: java.lang.String = js.native
  /**
    * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
    */
  var useMap: java.lang.String = js.native
  var vspace: Double = js.native
  var width: Double = js.native
}

