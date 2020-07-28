package org.scalablytyped.std

import org.scalablytyped.std.stdBooleans.`false`
import org.scalablytyped.std.stdBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - `org.scalablytyped`.std.ReadableStreamReadValueResult[T]
  - `org.scalablytyped`.std.ReadableStreamReadDoneResult[T]
*/
trait ReadableStreamReadResult[T] extends js.Object

object ReadableStreamReadResult {
  @scala.inline
  def ReadableStreamReadValueResult[T](done: `false`, value: T): ReadableStreamReadResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamReadResult[T]]
  }
  @scala.inline
  def ReadableStreamReadDoneResult[T](done: `true`): ReadableStreamReadResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamReadResult[T]]
  }
}

