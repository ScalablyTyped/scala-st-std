package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEventInit extends EventInit {
  var code: js.UndefOr[Double] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var wasClean: js.UndefOr[scala.Boolean] = js.undefined
}

object CloseEventInit {
  @scala.inline
  def apply(): CloseEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseEventInit]
  }
  @scala.inline
  implicit class CloseEventInitOps[Self <: CloseEventInit] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setReason(value: java.lang.String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setWasClean(value: scala.Boolean): Self = this.set("wasClean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWasClean: Self = this.set("wasClean", js.undefined)
  }
  
}

