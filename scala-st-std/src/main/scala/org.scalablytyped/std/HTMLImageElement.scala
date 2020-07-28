package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLImageElement extends HTMLElement {
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    */
  var align: java.lang.String = js.native
  /**
    * Sets or retrieves a text alternative to the graphic.
    */
  var alt: java.lang.String = js.native
  /**
    * Specifies the properties of a border drawn around an object.
    */
  var border: java.lang.String = js.native
  /**
    * Retrieves whether the object is fully loaded.
    */
  val complete: scala.Boolean = js.native
  var crossOrigin: java.lang.String | Null = js.native
  val currentSrc: java.lang.String = js.native
  /**
    * Sets or retrieves the height of the object.
    */
  var height: Double = js.native
  /**
    * Sets or retrieves the width of the border to draw around the object.
    */
  var hspace: Double = js.native
  /**
    * Sets or retrieves whether the image is a server-side image map.
    */
  var isMap: scala.Boolean = js.native
  /**
    * Sets or retrieves a Uniform Resource Identifier (URI) to a long description of the object.
    */
  var longDesc: java.lang.String = js.native
  var lowsrc: java.lang.String = js.native
  /**
    * Gets or sets whether the DLNA PlayTo device is available.
    */
  var msPlayToDisabled: scala.Boolean = js.native
  var msPlayToPreferredSourceUri: java.lang.String = js.native
  /**
    * Gets or sets the primary DLNA PlayTo device.
    */
  var msPlayToPrimary: scala.Boolean = js.native
  /**
    * Gets the source associated with the media element for use by the PlayToManager.
    */
  val msPlayToSource: js.Any = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
  /**
    * The original height of the image resource before sizing.
    */
  val naturalHeight: Double = js.native
  /**
    * The original width of the image resource before sizing.
    */
  val naturalWidth: Double = js.native
  var sizes: java.lang.String = js.native
  /**
    * The address or URL of the a media resource that is to be considered.
    */
  var src: java.lang.String = js.native
  var srcset: java.lang.String = js.native
  /**
    * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
    */
  var useMap: java.lang.String = js.native
  /**
    * Sets or retrieves the vertical margin for the object.
    */
  var vspace: Double = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var width: Double = js.native
  val x: Double = js.native
  val y: Double = js.native
  def msGetAsCastingSource(): js.Any = js.native
}

