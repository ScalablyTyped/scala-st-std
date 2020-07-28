package org.scalablytyped.std.global

import org.scalablytyped.std.Record
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("URLSearchParams")
@js.native
class URLSearchParams ()
  extends org.scalablytyped.std.URLSearchParams {
  def this(init: Record[java.lang.String, java.lang.String]) = this()
  def this(init: org.scalablytyped.std.URLSearchParams) = this()
  def this(init: java.lang.String) = this()
  def this(init: js.Array[js.Array[java.lang.String]]) = this()
}

@JSGlobal("URLSearchParams")
@js.native
object URLSearchParams
  extends Instantiable0[org.scalablytyped.std.URLSearchParams]
     with Instantiable1[
      (/* init */ js.Array[js.Array[java.lang.String]]) | (/* init */ Record[java.lang.String, java.lang.String]) | (/* init */ java.lang.String) | (/* init */ org.scalablytyped.std.URLSearchParams), 
      org.scalablytyped.std.URLSearchParams
    ]

