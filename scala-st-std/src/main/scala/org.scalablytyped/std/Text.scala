package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text
  extends CharacterData
     with Slotable {
  /**
    * Returns the combined data of all direct Text node siblings.
    */
  val wholeText: java.lang.String = js.native
  /**
    * Splits data at the given offset and returns the remainder as Text node.
    */
  def splitText(offset: Double): Text = js.native
}

