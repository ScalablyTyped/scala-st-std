package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadonlyMap[K, V] extends js.Object {
  val size: Double = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ ReadonlyMap[K, V], Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ ReadonlyMap[K, V], Unit],
    thisArg: js.Any
  ): Unit = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): scala.Boolean = js.native
}

