package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakMap[K, V] extends js.Object {
  @JSName(js.Symbol.toStringTag)
  var toStringTag: org.scalablytyped.std.stdStrings.WeakMap = js.native
  def delete(key: K): scala.Boolean = js.native
  def get(key: K): V = js.native
  def has(key: K): scala.Boolean = js.native
  def set(key: K): WeakMap[K, V] = js.native
  def set(key: K, value: V): WeakMap[K, V] = js.native
}

