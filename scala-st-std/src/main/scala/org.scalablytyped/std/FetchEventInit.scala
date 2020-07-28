package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchEventInit extends EventInit {
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var preloadResponse: js.Promise[_]
  var request: Request
  var resultingClientId: js.UndefOr[java.lang.String] = js.undefined
  var targetClientId: js.UndefOr[java.lang.String] = js.undefined
}

object FetchEventInit {
  @scala.inline
  def apply(preloadResponse: js.Promise[_], request: Request): FetchEventInit = {
    val __obj = js.Dynamic.literal(preloadResponse = preloadResponse.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchEventInit]
  }
  @scala.inline
  implicit class FetchEventInitOps[Self <: FetchEventInit] (val x: Self) extends AnyVal {
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
    def setPreloadResponse(value: js.Promise[_]): Self = this.set("preloadResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: Request): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: java.lang.String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setResultingClientId(value: java.lang.String): Self = this.set("resultingClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultingClientId: Self = this.set("resultingClientId", js.undefined)
    @scala.inline
    def setTargetClientId(value: java.lang.String): Self = this.set("targetClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetClientId: Self = this.set("targetClientId", js.undefined)
  }
  
}

