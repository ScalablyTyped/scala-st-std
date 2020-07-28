package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.abort
import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.versionchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBDatabase extends EventTarget {
  val name: java.lang.String = js.native
  val objectStoreNames: DOMStringList = js.native
  var version: Double = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(`type`: versionchange, listener: js.Function1[/* ev */ IDBVersionChangeEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: versionchange,
    listener: js.Function1[/* ev */ IDBVersionChangeEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def close(): Unit = js.native
  def createObjectStore(name: java.lang.String): IDBObjectStore = js.native
  def createObjectStore(name: java.lang.String, optionalParameters: IDBObjectStoreParameters): IDBObjectStore = js.native
  def deleteObjectStore(name: java.lang.String): Unit = js.native
  def onabort(ev: Event): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
  def onversionchange(ev: IDBVersionChangeEvent): js.Any = js.native
  def transaction(storeNames: java.lang.String): IDBTransaction = js.native
  def transaction(storeNames: java.lang.String, mode: java.lang.String): IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String]): IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String], mode: java.lang.String): IDBTransaction = js.native
}

