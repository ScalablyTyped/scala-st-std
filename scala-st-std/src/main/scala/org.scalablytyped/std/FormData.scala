package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormData extends js.Object {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String | File]] = js.native
  def append(name: java.lang.String, value: Blob): Unit = js.native
  def append(name: java.lang.String, value: Blob, fileName: java.lang.String): Unit = js.native
  def append(name: java.lang.String, value: java.lang.String): Unit = js.native
  def append(name: java.lang.String, value: java.lang.String, fileName: java.lang.String): Unit = js.native
  def delete(name: java.lang.String): Unit = js.native
  /**
    * Returns an array of key, value pairs for every entry in the list
    */
  def entries(): IterableIterator[js.Tuple2[java.lang.String, java.lang.String | File]] = js.native
  def get(name: java.lang.String): FormDataEntryValue | Null = js.native
  def getAll(name: java.lang.String): js.Array[FormDataEntryValue] = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a list of keys in the list
    */
  def keys(): IterableIterator[java.lang.String] = js.native
  def set(name: java.lang.String, value: Blob): Unit = js.native
  def set(name: java.lang.String, value: Blob, fileName: java.lang.String): Unit = js.native
  def set(name: java.lang.String, value: java.lang.String): Unit = js.native
  def set(name: java.lang.String, value: java.lang.String, fileName: java.lang.String): Unit = js.native
  /**
    * Returns a list of values in the list
    */
  def values(): IterableIterator[java.lang.String | File] = js.native
}

