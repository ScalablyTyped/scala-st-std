package org.scalablytyped.std.global

import org.scalablytyped.std.BodyInit
import org.scalablytyped.std.ResponseInit
import org.scalablytyped.std.ResponseType
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Response")
@js.native
class Response ()
  extends org.scalablytyped.std.Response {
  def this(body: BodyInit) = this()
  def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  /* CompleteClass */
  override val body: org.scalablytyped.std.ReadableStream[org.scalablytyped.std.Uint8Array] | Null = js.native
  /* CompleteClass */
  override val bodyUsed: scala.Boolean = js.native
  /* CompleteClass */
  override val headers: org.scalablytyped.std.Headers = js.native
  /* CompleteClass */
  override val ok: scala.Boolean = js.native
  /* CompleteClass */
  override val redirected: scala.Boolean = js.native
  /* CompleteClass */
  override val status: Double = js.native
  /* CompleteClass */
  override val statusText: java.lang.String = js.native
  /* CompleteClass */
  override val trailer: js.Promise[org.scalablytyped.std.Headers] = js.native
  /* CompleteClass */
  override val `type`: ResponseType = js.native
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

@JSGlobal("Response")
@js.native
object Response
  extends Instantiable0[org.scalablytyped.std.Response]
     with Instantiable1[/* body */ BodyInit, org.scalablytyped.std.Response]
     with Instantiable2[
      js.UndefOr[(/* body */ BodyInit) | (/* body */ Null)], 
      /* init */ ResponseInit, 
      org.scalablytyped.std.Response
    ] {
  def error(): org.scalablytyped.std.Response = js.native
  def redirect(url: java.lang.String): org.scalablytyped.std.Response = js.native
  def redirect(url: java.lang.String, status: Double): org.scalablytyped.std.Response = js.native
}

