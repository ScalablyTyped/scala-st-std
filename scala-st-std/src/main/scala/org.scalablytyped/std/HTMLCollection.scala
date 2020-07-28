package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCollection extends /* index */ NumberDictionary[Element] {
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  var length: Double = js.native
  /**
    * Retrieves an object from various collections.
    */
  def item(): Element = js.native
  def item(nameOrIndex: js.UndefOr[scala.Nothing], optionalIndex: js.Any): Element = js.native
  def item(nameOrIndex: js.Any): Element = js.native
  def item(nameOrIndex: js.Any, optionalIndex: js.Any): Element = js.native
  /**
    * Retrieves a select object or an object from an options collection.
    */
  def namedItem(name: java.lang.String): Element = js.native
}

