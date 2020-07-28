package org.scalablytyped.std.global

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
  def this(body: org.scalablytyped.std.ArrayBuffer) = this()
  def this(body: org.scalablytyped.std.Blob) = this()
  def this(body: org.scalablytyped.std.DataView) = this()
  def this(body: org.scalablytyped.std.Float32Array) = this()
  def this(body: org.scalablytyped.std.Float64Array) = this()
  def this(body: org.scalablytyped.std.FormData) = this()
  def this(body: org.scalablytyped.std.Int16Array) = this()
  def this(body: org.scalablytyped.std.Int32Array) = this()
  def this(body: org.scalablytyped.std.Int8Array) = this()
  def this(body: org.scalablytyped.std.Uint16Array) = this()
  def this(body: org.scalablytyped.std.Uint32Array) = this()
  def this(body: org.scalablytyped.std.Uint8Array) = this()
  def this(body: org.scalablytyped.std.Uint8ClampedArray) = this()
  def this(body: java.lang.String) = this()
  def this(body: js.UndefOr[scala.Nothing], init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.ArrayBuffer, init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.Blob, init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.DataView, init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.Float32Array, init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.Float64Array, init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.FormData, init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.Int16Array, init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.Int32Array, init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.Int8Array, init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.Uint16Array, init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.Uint32Array, init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.Uint8Array, init: ResponseInit) = this()
  def this(body: org.scalablytyped.std.Uint8ClampedArray, init: ResponseInit) = this()
  def this(body: java.lang.String, init: ResponseInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  /* CompleteClass */
  override val body: org.scalablytyped.std.ReadableStream | Null = js.native
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
     with Instantiable1[
      (/* body */ org.scalablytyped.std.ArrayBuffer) | (/* body */ org.scalablytyped.std.Blob) | (/* body */ org.scalablytyped.std.DataView) | (/* body */ org.scalablytyped.std.Float32Array) | (/* body */ org.scalablytyped.std.Float64Array) | (/* body */ org.scalablytyped.std.FormData) | (/* body */ org.scalablytyped.std.Int16Array) | (/* body */ org.scalablytyped.std.Int32Array) | (/* body */ org.scalablytyped.std.Int8Array) | (/* body */ java.lang.String) | (/* body */ org.scalablytyped.std.Uint16Array) | (/* body */ org.scalablytyped.std.Uint32Array) | (/* body */ org.scalablytyped.std.Uint8Array) | (/* body */ org.scalablytyped.std.Uint8ClampedArray), 
      org.scalablytyped.std.Response
    ]
     with Instantiable2[
      js.UndefOr[
        (/* body */ org.scalablytyped.std.ArrayBuffer) | (/* body */ org.scalablytyped.std.Blob) | (/* body */ org.scalablytyped.std.DataView) | (/* body */ org.scalablytyped.std.Float32Array) | (/* body */ org.scalablytyped.std.Float64Array) | (/* body */ org.scalablytyped.std.FormData) | (/* body */ org.scalablytyped.std.Int16Array) | (/* body */ org.scalablytyped.std.Int32Array) | (/* body */ org.scalablytyped.std.Int8Array) | (/* body */ Null) | (/* body */ java.lang.String) | (/* body */ org.scalablytyped.std.Uint16Array) | (/* body */ org.scalablytyped.std.Uint32Array) | (/* body */ org.scalablytyped.std.Uint8Array) | (/* body */ org.scalablytyped.std.Uint8ClampedArray)
      ], 
      /* init */ ResponseInit, 
      org.scalablytyped.std.Response
    ] {
  def error(): org.scalablytyped.std.Response = js.native
  def redirect(url: java.lang.String): org.scalablytyped.std.Response = js.native
  def redirect(url: java.lang.String, status: Double): org.scalablytyped.std.Response = js.native
}

