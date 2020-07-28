package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebSocket")
@js.native
class WebSocket protected ()
  extends org.scalablytyped.std.WebSocket {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, protocols: java.lang.String) = this()
  def this(url: java.lang.String, protocols: js.Array[java.lang.String]) = this()
}

@JSGlobal("WebSocket")
@js.native
object WebSocket
  extends Instantiable1[/* url */ java.lang.String, org.scalablytyped.std.WebSocket]
     with Instantiable2[
      /* url */ java.lang.String, 
      (/* protocols */ js.Array[java.lang.String]) | (/* protocols */ java.lang.String), 
      org.scalablytyped.std.WebSocket
    ] {
  var CLOSED: Double = js.native
  var CLOSING: Double = js.native
  var CONNECTING: Double = js.native
  var OPEN: Double = js.native
}

