package org.scalablytyped.std.global

import org.scalablytyped.std.CustomEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CustomEvent")
@js.native
class CustomEvent[T] protected ()
  extends org.scalablytyped.std.CustomEvent[T] {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: CustomEventInit[T]) = this()
}

@JSGlobal("CustomEvent")
@js.native
object CustomEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.CustomEvent[js.Object]]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ CustomEventInit[js.Object], 
      org.scalablytyped.std.CustomEvent[js.Object]
    ]

