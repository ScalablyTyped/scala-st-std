package org.scalablytyped.std.global

import org.scalablytyped.std.TypeErrorConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeError")
@js.native
class TypeError ()
  extends org.scalablytyped.std.Error {
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

@JSGlobal("TypeError")
@js.native
object TypeError extends TopLevel[TypeErrorConstructor]

