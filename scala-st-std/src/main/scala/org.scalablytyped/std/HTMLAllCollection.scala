package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLAllCollection extends HTMLCollection

object HTMLAllCollection {
  @scala.inline
  def apply(item: Double => Element, length: Double, namedItem: java.lang.String => Element): HTMLAllCollection = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], namedItem = js.Any.fromFunction1(namedItem))
    __obj.asInstanceOf[HTMLAllCollection]
  }
}

