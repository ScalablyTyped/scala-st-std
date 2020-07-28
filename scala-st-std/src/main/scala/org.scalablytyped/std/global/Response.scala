package org.scalablytyped.std.global

import org.scalablytyped.std.ResponseInit
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
  def this(body: js.Any) = this()
  def this(body: js.UndefOr[scala.Nothing], init: ResponseInit) = this()
  def this(body: js.Any, init: ResponseInit) = this()
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

@JSGlobal("Response")
@js.native
object Response
  extends Instantiable0[org.scalablytyped.std.Response]
     with Instantiable1[/* body */ js.Any, org.scalablytyped.std.Response]
     with Instantiable2[
      js.UndefOr[/* body */ js.Any], 
      /* init */ ResponseInit, 
      org.scalablytyped.std.Response
    ] {
  def error(): org.scalablytyped.std.Response = js.native
  def redirect(url: java.lang.String): org.scalablytyped.std.Response = js.native
  def redirect(url: java.lang.String, status: Double): org.scalablytyped.std.Response = js.native
}

