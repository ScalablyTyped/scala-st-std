package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginArray extends /* index */ NumberDictionary[Plugin] {
  var length: Double = js.native
  def item(index: Double): Plugin = js.native
  def namedItem(name: java.lang.String): Plugin = js.native
  def refresh(): Unit = js.native
  def refresh(reload: scala.Boolean): Unit = js.native
}

