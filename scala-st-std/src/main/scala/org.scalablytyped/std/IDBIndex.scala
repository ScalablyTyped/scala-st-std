package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBIndex extends js.Object {
  val keyPath: java.lang.String | js.Array[java.lang.String] = js.native
  var multiEntry: scala.Boolean = js.native
  val name: java.lang.String = js.native
  val objectStore: IDBObjectStore = js.native
  val unique: scala.Boolean = js.native
  def count(): IDBRequest = js.native
  def count(key: Date): IDBRequest = js.native
  def count(key: IDBArrayKey): IDBRequest = js.native
  def count(key: IDBKeyRange): IDBRequest = js.native
  def count(key: java.lang.String): IDBRequest = js.native
  def count(key: Double): IDBRequest = js.native
  def get(key: Date): IDBRequest = js.native
  def get(key: IDBArrayKey): IDBRequest = js.native
  def get(key: IDBKeyRange): IDBRequest = js.native
  def get(key: java.lang.String): IDBRequest = js.native
  def get(key: Double): IDBRequest = js.native
  def getKey(key: Date): IDBRequest = js.native
  def getKey(key: IDBArrayKey): IDBRequest = js.native
  def getKey(key: IDBKeyRange): IDBRequest = js.native
  def getKey(key: java.lang.String): IDBRequest = js.native
  def getKey(key: Double): IDBRequest = js.native
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
  def openKeyCursor(): IDBRequest = js.native
  def openKeyCursor(range: js.UndefOr[scala.Nothing], direction: IDBCursorDirection): IDBRequest = js.native
  def openKeyCursor(range: Date): IDBRequest = js.native
  def openKeyCursor(range: Date, direction: IDBCursorDirection): IDBRequest = js.native
  def openKeyCursor(range: IDBArrayKey): IDBRequest = js.native
  def openKeyCursor(range: IDBArrayKey, direction: IDBCursorDirection): IDBRequest = js.native
  def openKeyCursor(range: IDBKeyRange): IDBRequest = js.native
  def openKeyCursor(range: IDBKeyRange, direction: IDBCursorDirection): IDBRequest = js.native
  def openKeyCursor(range: java.lang.String): IDBRequest = js.native
  def openKeyCursor(range: java.lang.String, direction: IDBCursorDirection): IDBRequest = js.native
  def openKeyCursor(range: Double): IDBRequest = js.native
  def openKeyCursor(range: Double, direction: IDBCursorDirection): IDBRequest = js.native
}

