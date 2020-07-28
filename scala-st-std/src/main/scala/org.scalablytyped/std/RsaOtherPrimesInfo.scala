package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaOtherPrimesInfo extends js.Object {
  var d: java.lang.String
  var r: java.lang.String
  var t: java.lang.String
}

object RsaOtherPrimesInfo {
  @scala.inline
  def apply(d: java.lang.String, r: java.lang.String, t: java.lang.String): RsaOtherPrimesInfo = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOtherPrimesInfo]
  }
  @scala.inline
  implicit class RsaOtherPrimesInfoOps[Self <: RsaOtherPrimesInfo] (val x: Self) extends AnyVal {
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
    def setD(value: java.lang.String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: java.lang.String): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def setT(value: java.lang.String): Self = this.set("t", value.asInstanceOf[js.Any])
  }
  
}

