package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBCursor extends js.Object {
  var NEXT: java.lang.String = js.native
  var NEXT_NO_DUPLICATE: java.lang.String = js.native
  var PREV: java.lang.String = js.native
  var PREV_NO_DUPLICATE: java.lang.String = js.native
  var direction: java.lang.String = js.native
  var key: js.Any = js.native
  var primaryKey: js.Any = js.native
  var source: js.Any = js.native
  def advance(count: Double): Unit = js.native
  def continue(): Unit = js.native
  def continue(key: js.Any): Unit = js.native
  def delete(): IDBRequest = js.native
  def update(value: js.Any): IDBRequest = js.native
}

