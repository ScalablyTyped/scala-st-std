package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  def append(name: java.lang.String, value: java.lang.String): Unit = js.native
  def delete(name: java.lang.String): Unit = js.native
  /**
    * Returns an iterator allowing to go through all key/value pairs contained in this object.
    */
  def entries(): IterableIterator[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ java.lang.String, /* key */ java.lang.String, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ java.lang.String, /* key */ java.lang.String, /* parent */ this.type, Unit],
    thisArg: js.Any
  ): Unit = js.native
  def get(name: java.lang.String): java.lang.String | Null = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  /**
    * Returns an iterator allowing to go through all keys of the key/value pairs contained in this object.
    */
  def keys(): IterableIterator[java.lang.String] = js.native
  def set(name: java.lang.String, value: java.lang.String): Unit = js.native
  /**
    * Returns an iterator allowing to go through all values of the key/value pairs contained in this object.
    */
  def values(): IterableIterator[java.lang.String] = js.native
}

