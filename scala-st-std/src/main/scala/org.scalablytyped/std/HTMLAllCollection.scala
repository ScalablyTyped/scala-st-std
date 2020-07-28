package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAllCollection extends /* index */ NumberDictionary[Element] {
  val length: Double = js.native
  def item(): HTMLCollection | Element | Null = js.native
  def item(nameOrIndex: java.lang.String): HTMLCollection | Element | Null = js.native
  def namedItem(name: java.lang.String): HTMLCollection | Element | Null = js.native
}

