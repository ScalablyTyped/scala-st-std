package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBObjectStore extends js.Object {
  var autoIncrement: scala.Boolean = js.native
  val indexNames: DOMStringList = js.native
  val keyPath: java.lang.String | js.Array[java.lang.String] | Null = js.native
  val name: java.lang.String = js.native
  val transaction: IDBTransaction = js.native
  def add(value: js.Any): IDBRequest = js.native
  def add(value: js.Any, key: Date): IDBRequest = js.native
  def add(value: js.Any, key: IDBArrayKey): IDBRequest = js.native
  def add(value: js.Any, key: IDBKeyRange): IDBRequest = js.native
  def add(value: js.Any, key: java.lang.String): IDBRequest = js.native
  def add(value: js.Any, key: Double): IDBRequest = js.native
  def clear(): IDBRequest = js.native
  def count(): IDBRequest = js.native
  def count(key: Date): IDBRequest = js.native
  def count(key: IDBArrayKey): IDBRequest = js.native
  def count(key: IDBKeyRange): IDBRequest = js.native
  def count(key: java.lang.String): IDBRequest = js.native
  def count(key: Double): IDBRequest = js.native
  def createIndex(name: java.lang.String, keyPath: java.lang.String): IDBIndex = js.native
  def createIndex(name: java.lang.String, keyPath: java.lang.String, optionalParameters: IDBIndexParameters): IDBIndex = js.native
  def createIndex(name: java.lang.String, keyPath: js.Array[java.lang.String]): IDBIndex = js.native
  def createIndex(
    name: java.lang.String,
    keyPath: js.Array[java.lang.String],
    optionalParameters: IDBIndexParameters
  ): IDBIndex = js.native
  def delete(key: Date): IDBRequest = js.native
  def delete(key: IDBArrayKey): IDBRequest = js.native
  def delete(key: IDBKeyRange): IDBRequest = js.native
  def delete(key: java.lang.String): IDBRequest = js.native
  def delete(key: Double): IDBRequest = js.native
  def deleteIndex(indexName: java.lang.String): Unit = js.native
  def get(key: js.Any): IDBRequest = js.native
  def index(name: java.lang.String): IDBIndex = js.native
  def openCursor(): IDBRequest = js.native
  def openCursor(range: js.UndefOr[scala.Nothing], direction: IDBCursorDirection): IDBRequest = js.native
  def openCursor(range: Date): IDBRequest = js.native
  def openCursor(range: Date, direction: IDBCursorDirection): IDBRequest = js.native
  def openCursor(range: IDBArrayKey): IDBRequest = js.native
  def openCursor(range: IDBArrayKey, direction: IDBCursorDirection): IDBRequest = js.native
  def openCursor(range: IDBKeyRange): IDBRequest = js.native
  def openCursor(range: IDBKeyRange, direction: IDBCursorDirection): IDBRequest = js.native
  def openCursor(range: java.lang.String): IDBRequest = js.native
  def openCursor(range: java.lang.String, direction: IDBCursorDirection): IDBRequest = js.native
  def openCursor(range: Double): IDBRequest = js.native
  def openCursor(range: Double, direction: IDBCursorDirection): IDBRequest = js.native
  def put(value: js.Any): IDBRequest = js.native
  def put(value: js.Any, key: Date): IDBRequest = js.native
  def put(value: js.Any, key: IDBArrayKey): IDBRequest = js.native
  def put(value: js.Any, key: IDBKeyRange): IDBRequest = js.native
  def put(value: js.Any, key: java.lang.String): IDBRequest = js.native
  def put(value: js.Any, key: Double): IDBRequest = js.native
}

