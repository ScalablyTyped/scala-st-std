package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLEmbedElement
  extends HTMLElement
     with GetSVGDocument {
  /**
    * Sets or retrieves the height of the object.
    */
  var height: java.lang.String = js.native
  /**
    * Gets or sets whether the DLNA PlayTo device is available.
    */
  var msPlayToDisabled: scala.Boolean = js.native
  /**
    * Gets or sets the path to the preferred media source. This enables the Play To target device to stream the media content, which can be DRM protected, from a different location, such as a cloud media server.
    */
  var msPlayToPreferredSourceUri: java.lang.String = js.native
  /**
    * Gets or sets the primary DLNA PlayTo device.
    */
  var msPlayToPrimary: scala.Boolean = js.native
  /**
    * Gets the source associated with the media element for use by the PlayToManager.
    */
  var msPlayToSource: js.Any = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  var name: java.lang.String = js.native
  /**
    * Retrieves the palette used for the embedded document.
    */
  var palette: java.lang.String = js.native
  /**
    * Retrieves the URL of the plug-in used to view an embedded document.
    */
  var pluginspage: java.lang.String = js.native
  var readyState: java.lang.String = js.native
  /**
    * Sets or retrieves a URL to be loaded by the object.
    */
  var src: java.lang.String = js.native
  /**
    * Sets or retrieves the height and width units of the embed object.
    */
  var units: java.lang.String = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var width: java.lang.String = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

