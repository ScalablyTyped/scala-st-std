package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBIndex extends js.Object {
  var keyPath: java.lang.String | js.Array[java.lang.String] = js.native
  var multiEntry: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var objectStore: IDBObjectStore = js.native
  var unique: scala.Boolean = js.native
  def count(): IDBRequest = js.native
  def count(key: js.Any): IDBRequest = js.native
  def get(key: js.Any): IDBRequest = js.native
  def getKey(key: js.Any): IDBRequest = js.native
  def openCursor(): IDBRequest = js.native
  def openCursor(range: js.UndefOr[scala.Nothing], direction: java.lang.String): IDBRequest = js.native
  def openCursor(range: IDBKeyRange): IDBRequest = js.native
  def openCursor(range: IDBKeyRange, direction: java.lang.String): IDBRequest = js.native
  def openKeyCursor(): IDBRequest = js.native
  def openKeyCursor(range: js.UndefOr[scala.Nothing], direction: java.lang.String): IDBRequest = js.native
  def openKeyCursor(range: IDBKeyRange): IDBRequest = js.native
  def openKeyCursor(range: IDBKeyRange, direction: java.lang.String): IDBRequest = js.native
}

