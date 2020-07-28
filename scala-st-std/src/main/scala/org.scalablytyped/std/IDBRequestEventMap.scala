package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBRequestEventMap extends js.Object {
  var error: ErrorEvent
  var success: Event
}

object IDBRequestEventMap {
  @scala.inline
  def apply(error: ErrorEvent, success: Event): IDBRequestEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBRequestEventMap]
  }
  @scala.inline
  implicit class IDBRequestEventMapOps[Self <: IDBRequestEventMap] (val x: Self) extends AnyVal {
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
    def setError(value: ErrorEvent): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Event): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

