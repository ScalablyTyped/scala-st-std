package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSDCCEventInit extends EventInit {
  var maxFr: js.UndefOr[Double] = js.undefined
  var maxFs: js.UndefOr[Double] = js.undefined
}

object MSDCCEventInit {
  @scala.inline
  def apply(): MSDCCEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSDCCEventInit]
  }
  @scala.inline
  implicit class MSDCCEventInitOps[Self <: MSDCCEventInit] (val x: Self) extends AnyVal {
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
    def setMaxFr(value: Double): Self = this.set("maxFr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFr: Self = this.set("maxFr", js.undefined)
    @scala.inline
    def setMaxFs(value: Double): Self = this.set("maxFs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFs: Self = this.set("maxFs", js.undefined)
  }
  
}

