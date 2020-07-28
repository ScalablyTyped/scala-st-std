package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormData extends js.Object {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String | File]] = js.native
  def append(name: js.Any, value: js.Any): Unit = js.native
  def append(name: js.Any, value: js.Any, blobName: java.lang.String): Unit = js.native
  /**
    * Returns an array of key, value pairs for every entry in the list
    */
  def entries(): IterableIterator[js.Tuple2[java.lang.String, java.lang.String | File]] = js.native
  /**
    * Returns a list of keys in the list
    */
  def keys(): IterableIterator[java.lang.String] = js.native
  /**
    * Returns a list of values in the list
    */
  def values(): IterableIterator[java.lang.String | File] = js.native
}

