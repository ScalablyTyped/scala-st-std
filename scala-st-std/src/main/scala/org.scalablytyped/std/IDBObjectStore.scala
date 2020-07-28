package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBObjectStore extends js.Object {
  var indexNames: DOMStringList = js.native
  var keyPath: java.lang.String = js.native
  var name: java.lang.String = js.native
  var transaction: IDBTransaction = js.native
  def add(value: js.Any): IDBRequest = js.native
  def add(value: js.Any, key: js.Any): IDBRequest = js.native
  def clear(): IDBRequest = js.native
  def count(): IDBRequest = js.native
  def count(key: js.Any): IDBRequest = js.native
  def createIndex(name: java.lang.String, keyPath: java.lang.String): IDBIndex = js.native
  def createIndex(name: java.lang.String, keyPath: java.lang.String, optionalParameters: IDBIndexParameters): IDBIndex = js.native
  def createIndex(name: java.lang.String, keyPath: js.Array[java.lang.String]): IDBIndex = js.native
  def createIndex(
    name: java.lang.String,
    keyPath: js.Array[java.lang.String],
    optionalParameters: IDBIndexParameters
  ): IDBIndex = js.native
  def delete(key: js.Any): IDBRequest = js.native
  def deleteIndex(indexName: java.lang.String): Unit = js.native
  def get(key: js.Any): IDBRequest = js.native
  def index(name: java.lang.String): IDBIndex = js.native
  def openCursor(): IDBRequest = js.native
  def openCursor(range: js.UndefOr[scala.Nothing], direction: java.lang.String): IDBRequest = js.native
  def openCursor(range: js.Any): IDBRequest = js.native
  def openCursor(range: js.Any, direction: java.lang.String): IDBRequest = js.native
  def put(value: js.Any): IDBRequest = js.native
  def put(value: js.Any, key: js.Any): IDBRequest = js.native
}

