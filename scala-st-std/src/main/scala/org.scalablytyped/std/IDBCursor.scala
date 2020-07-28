package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBCursor extends js.Object {
  val NEXT: java.lang.String = js.native
  val NEXT_NO_DUPLICATE: java.lang.String = js.native
  val PREV: java.lang.String = js.native
  val PREV_NO_DUPLICATE: java.lang.String = js.native
  val direction: java.lang.String = js.native
  var key: IDBKeyRange | IDBValidKey = js.native
  val primaryKey: js.Any = js.native
  var source: IDBObjectStore | IDBIndex = js.native
  def advance(count: Double): Unit = js.native
  def continue(): Unit = js.native
  def continue(key: IDBKeyRange): Unit = js.native
  def continue(key: IDBValidKey): Unit = js.native
  def delete(): IDBRequest = js.native
  def update(value: js.Any): IDBRequest = js.native
}

