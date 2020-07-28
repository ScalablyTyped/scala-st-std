package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The IDBCursorWithValue interface of the IndexedDB API represents a cursor for traversing or iterating over multiple records in a database. It is the same as the IDBCursor, except that it includes the value property. */
@js.native
trait IDBCursorWithValue extends IDBCursor {
  /**
    * Returns the cursor's current value.
    */
  val value: js.Any = js.native
}

