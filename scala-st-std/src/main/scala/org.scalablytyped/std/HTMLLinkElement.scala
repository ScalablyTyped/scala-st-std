package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLLinkElement
  extends HTMLElement
     with LinkStyle {
  /**
    * Sets or retrieves the character set used to encode the object.
    */
  var charset: java.lang.String = js.native
  var disabled: scala.Boolean = js.native
  /**
    * Sets or retrieves a destination URL or an anchor point.
    */
  var href: java.lang.String = js.native
  /**
    * Sets or retrieves the language code of the object.
    */
  var hreflang: java.lang.String = js.native
  var `import`: js.UndefOr[Document] = js.native
  /**
    * Sets or retrieves the media type.
    */
  var media: java.lang.String = js.native
  /**
    * Sets or retrieves the relationship between the object and the destination of the link.
    */
  var rel: java.lang.String = js.native
  /**
    * Sets or retrieves the relationship between the object and the destination of the link.
    */
  var rev: java.lang.String = js.native
  /**
    * Sets or retrieves the window or frame at which to target content.
    */
  var target: java.lang.String = js.native
  /**
    * Sets or retrieves the MIME type of the object.
    */
  var `type`: java.lang.String = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}

