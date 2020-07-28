package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBIndex extends js.Object {
  var keyPath: java.lang.String | js.Array[java.lang.String] = js.native
  var multiEntry: scala.Boolean = js.native
  val name: java.lang.String = js.native
  val objectStore: IDBObjectStore = js.native
  val unique: scala.Boolean = js.native
  def count(): IDBRequest = js.native
  def count(key: IDBKeyRange): IDBRequest = js.native
  def count(key: IDBValidKey): IDBRequest = js.native
  def get(key: IDBKeyRange): IDBRequest = js.native
  def get(key: IDBValidKey): IDBRequest = js.native
  def getKey(key: IDBKeyRange): IDBRequest = js.native
  def getKey(key: IDBValidKey): IDBRequest = js.native
  def openCursor(): IDBRequest = js.native
  def openCursor(range: js.UndefOr[IDBValidKey], direction: java.lang.String): IDBRequest = js.native
  def openCursor(range: IDBKeyRange): IDBRequest = js.native
  def openCursor(range: IDBKeyRange, direction: java.lang.String): IDBRequest = js.native
  def openCursor(range: IDBValidKey): IDBRequest = js.native
  def openKeyCursor(): IDBRequest = js.native
  def openKeyCursor(range: js.UndefOr[IDBValidKey], direction: java.lang.String): IDBRequest = js.native
  def openKeyCursor(range: IDBKeyRange): IDBRequest = js.native
  def openKeyCursor(range: IDBKeyRange, direction: java.lang.String): IDBRequest = js.native
  def openKeyCursor(range: IDBValidKey): IDBRequest = js.native
}

