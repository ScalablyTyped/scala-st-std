package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response
  extends Object
     with Body {
  val body: ReadableStream | Null = js.native
  val headers: Headers = js.native
  val ok: scala.Boolean = js.native
  val redirected: scala.Boolean = js.native
  val status: Double = js.native
  val statusText: java.lang.String = js.native
  val `type`: ResponseType = js.native
  val url: java.lang.String = js.native
}

