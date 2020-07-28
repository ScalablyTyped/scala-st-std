package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map[K, V] extends js.Object {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
  val size: Double = js.native
  @JSName(js.Symbol.toStringTag)
  val toStringTag: org.scalablytyped.std.stdStrings.Map = js.native
  def clear(): Unit = js.native
  def delete(key: K): scala.Boolean = js.native
  def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ Map[K, V], Unit]): Unit = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ Map[K, V], Unit], thisArg: js.Any): Unit = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): scala.Boolean = js.native
  def keys(): IterableIterator[K] = js.native
  def set(key: K): this.type = js.native
  def set(key: K, value: V): this.type = js.native
  def values(): IterableIterator[V] = js.native
}

