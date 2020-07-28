package org.scalablytyped.std.global

import org.scalablytyped.std.ForEachCallback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Headers")
@js.native
class Headers ()
  extends org.scalablytyped.std.Headers {
  def this(init: js.Any) = this()
  /* CompleteClass */
  override def append(name: java.lang.String, value: java.lang.String): Unit = js.native
  /* CompleteClass */
  override def delete(name: java.lang.String): Unit = js.native
  /* CompleteClass */
  override def forEach(callback: ForEachCallback): Unit = js.native
  /* CompleteClass */
  override def get(name: java.lang.String): java.lang.String | Null = js.native
  /* CompleteClass */
  override def has(name: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def set(name: java.lang.String, value: java.lang.String): Unit = js.native
}

@JSGlobal("Headers")
@js.native
object Headers
  extends Instantiable0[org.scalablytyped.std.Headers]
     with Instantiable1[/* init */ js.Any, org.scalablytyped.std.Headers]

