package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLFormControlsCollection interface represents a collection of HTML form control elements.  */
@js.native
trait HTMLFormControlsCollection extends HTMLCollectionBase {
  /**
    * element = collection[name]
    */
  def namedItem(name: java.lang.String): RadioNodeList | Element | Null = js.native
}

