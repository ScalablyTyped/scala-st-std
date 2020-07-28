package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OESTextureHalfFloat extends js.Object {
  val HALF_FLOAT_OES: Double
}

object OESTextureHalfFloat {
  @scala.inline
  def apply(HALF_FLOAT_OES: Double): OESTextureHalfFloat = {
    val __obj = js.Dynamic.literal(HALF_FLOAT_OES = HALF_FLOAT_OES.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESTextureHalfFloat]
  }
  @scala.inline
  implicit class OESTextureHalfFloatOps[Self <: OESTextureHalfFloat] (val x: Self) extends AnyVal {
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
    def setHALF_FLOAT_OES(value: Double): Self = this.set("HALF_FLOAT_OES", value.asInstanceOf[js.Any])
  }
  
}

