package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSWebViewAsyncOperationEventMap extends js.Object {
  var complete: Event
  var error: ErrorEvent
}

object MSWebViewAsyncOperationEventMap {
  @scala.inline
  def apply(complete: Event, error: ErrorEvent): MSWebViewAsyncOperationEventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSWebViewAsyncOperationEventMap]
  }
  @scala.inline
  implicit class MSWebViewAsyncOperationEventMapOps[Self <: MSWebViewAsyncOperationEventMap] (val x: Self) extends AnyVal {
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
    def setComplete(value: Event): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

