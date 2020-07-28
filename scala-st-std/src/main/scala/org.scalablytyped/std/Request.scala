package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends Object
     with Body {
  val cache: RequestCache = js.native
  val credentials: RequestCredentials = js.native
  val destination: RequestDestination = js.native
  val headers: Headers = js.native
  val integrity: java.lang.String = js.native
  val keepalive: scala.Boolean = js.native
  val method: java.lang.String = js.native
  val mode: RequestMode = js.native
  val redirect: RequestRedirect = js.native
  val referrer: java.lang.String = js.native
  val referrerPolicy: ReferrerPolicy = js.native
  val signal: AbortSignal = js.native
  val `type`: RequestType = js.native
  val url: java.lang.String = js.native
}

