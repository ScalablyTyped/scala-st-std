package org.scalablytyped.std.global

import org.scalablytyped.std.ErrorConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Error")
@js.native
class Error ()
  extends org.scalablytyped.std.Error {
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

@JSGlobal("Error")
@js.native
object Error extends TopLevel[ErrorConstructor]

