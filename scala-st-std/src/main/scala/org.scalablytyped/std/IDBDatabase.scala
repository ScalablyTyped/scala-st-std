package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.abort
import org.scalablytyped.std.stdStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBDatabase extends EventTarget {
  var name: java.lang.String = js.native
  var objectStoreNames: DOMStringList = js.native
  var version: Double = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _], useCapture: scala.Boolean): Unit = js.native
  def close(): Unit = js.native
  def createObjectStore(name: java.lang.String): IDBObjectStore = js.native
  def createObjectStore(name: java.lang.String, optionalParameters: IDBObjectStoreParameters): IDBObjectStore = js.native
  def deleteObjectStore(name: java.lang.String): Unit = js.native
  def onabort(ev: Event): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
  def transaction(storeNames: js.Any): IDBTransaction = js.native
  def transaction(storeNames: js.Any, mode: java.lang.String): IDBTransaction = js.native
}

