package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends Body {
  val cache: RequestCache
  val credentials: RequestCredentials
  val destination: RequestDestination
  val headers: Headers
  val integrity: java.lang.String
  val keepalive: scala.Boolean
  val method: java.lang.String
  val mode: RequestMode
  val redirect: RequestRedirect
  val referrer: java.lang.String
  val referrerPolicy: ReferrerPolicy
  val signal: AbortSignal | Null
  val `type`: RequestType
  val url: java.lang.String
}

object Request {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: scala.Boolean,
    cache: RequestCache,
    credentials: RequestCredentials,
    destination: RequestDestination,
    formData: () => js.Promise[FormData],
    headers: Headers,
    integrity: java.lang.String,
    json: () => js.Promise[_],
    keepalive: scala.Boolean,
    method: java.lang.String,
    mode: RequestMode,
    redirect: RequestRedirect,
    referrer: java.lang.String,
    referrerPolicy: ReferrerPolicy,
    text: () => js.Promise[java.lang.String],
    `type`: RequestType,
    url: java.lang.String
  ): Request = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), keepalive = keepalive.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCache(value: RequestCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentials(value: RequestCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestination(value: RequestDestination): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegrity(value: java.lang.String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepalive(value: scala.Boolean): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: java.lang.String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: RequestMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirect(value: RequestRedirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferrer(value: java.lang.String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferrerPolicy(value: ReferrerPolicy): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: RequestType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignalNull: Self = this.set("signal", null)
  }
  
}

