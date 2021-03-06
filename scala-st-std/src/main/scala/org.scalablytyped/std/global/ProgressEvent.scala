package org.scalablytyped.std.global

import org.scalablytyped.std.ProgressEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ProgressEvent")
@js.native
class ProgressEvent protected ()
  extends org.scalablytyped.std.ProgressEvent[org.scalablytyped.std.EventTarget] {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ProgressEventInit) = this()
}

@JSGlobal("ProgressEvent")
@js.native
object ProgressEvent
  extends Instantiable1[
      /* type */ java.lang.String, 
      org.scalablytyped.std.ProgressEvent[org.scalablytyped.std.EventTarget]
    ]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ ProgressEventInit, 
      org.scalablytyped.std.ProgressEvent[org.scalablytyped.std.EventTarget]
    ]

