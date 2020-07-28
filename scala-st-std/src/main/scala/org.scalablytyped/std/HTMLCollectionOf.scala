package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCollectionOf[T /* <: Element */] extends /* n */ NumberDictionary[T] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[T]] = js.native
  def entries(): IterableIterator[js.Tuple2[Double, T]] = js.native
  def forEach(callbackfn: js.Function3[/* value */ T, /* key */ Double, /* parent */ HTMLCollectionOf[T], Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* key */ Double, /* parent */ HTMLCollectionOf[T], Unit],
    thisArg: js.Any
  ): Unit = js.native
  def item(index: Double): T = js.native
  def keys(): IterableIterator[Double] = js.native
  def namedItem(name: java.lang.String): T = js.native
  def values(): IterableIterator[T] = js.native
}

