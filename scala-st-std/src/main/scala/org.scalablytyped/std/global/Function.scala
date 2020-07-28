package org.scalablytyped.std.global

import org.scalablytyped.std.FunctionConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Function")
@js.native
class Function protected ()
  extends js.Function {
  /**
    * Creates a new function.
    * @param args A list of arguments the function accepts.
    */
  def this(args: java.lang.String*) = this()
}

@JSGlobal("Function")
@js.native
object Function extends TopLevel[FunctionConstructor]

