package org.scalablytyped.std.global

import org.scalablytyped.std.ReferrerPolicy
import org.scalablytyped.std.RequestCache
import org.scalablytyped.std.RequestCredentials
import org.scalablytyped.std.RequestDestination
import org.scalablytyped.std.RequestInit
import org.scalablytyped.std.RequestMode
import org.scalablytyped.std.RequestRedirect
import org.scalablytyped.std.RequestType
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
  override val cache: RequestCache = js.native
  /* CompleteClass */
  override val credentials: RequestCredentials = js.native
  /* CompleteClass */
  override val destination: RequestDestination = js.native
  /* CompleteClass */
  override val headers: org.scalablytyped.std.Headers = js.native
  /* CompleteClass */
  override val integrity: java.lang.String = js.native
  /* CompleteClass */
  override val keepalive: scala.Boolean = js.native
  /* CompleteClass */
  override val method: java.lang.String = js.native
  /* CompleteClass */
  override val mode: RequestMode = js.native
  /* CompleteClass */
  override val redirect: RequestRedirect = js.native
  /* CompleteClass */
  override val referrer: java.lang.String = js.native
  /* CompleteClass */
  override val referrerPolicy: ReferrerPolicy = js.native
  /* CompleteClass */
  override val signal: org.scalablytyped.std.AbortSignal | Null = js.native
  /* CompleteClass */
  override val `type`: RequestType = js.native
  /* CompleteClass */
  override val url: java.lang.String = js.native
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

