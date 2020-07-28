package org.scalablytyped.std.global

import org.scalablytyped.std.RequestInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Request")
@js.native
class Request protected ()
  extends org.scalablytyped.std.Request {
  def this(input: org.scalablytyped.std.Request) = this()
  def this(input: java.lang.String) = this()
  def this(input: org.scalablytyped.std.Request, init: RequestInit) = this()
  def this(input: java.lang.String, init: RequestInit) = this()
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[org.scalablytyped.std.ArrayBuffer] = js.native
  /* CompleteClass */
  override def blob(): js.Promise[org.scalablytyped.std.Blob] = js.native
  /* CompleteClass */
  override def formData(): js.Promise[org.scalablytyped.std.FormData] = js.native
  /* CompleteClass */
  override def json(): js.Promise[_] = js.native
  /* CompleteClass */
  override def text(): js.Promise[java.lang.String] = js.native
}

@JSGlobal("Request")
@js.native
object Request
  extends Instantiable1[
      (/* input */ org.scalablytyped.std.Request) | (/* input */ java.lang.String), 
      org.scalablytyped.std.Request
    ]
     with Instantiable2[
      (/* input */ org.scalablytyped.std.Request) | (/* input */ java.lang.String), 
      /* init */ RequestInit, 
      org.scalablytyped.std.Request
    ]

