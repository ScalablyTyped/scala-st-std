package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EXTBlendMinmax extends js.Object {
  val MAX_EXT: Double
  val MIN_EXT: Double
}

object EXTBlendMinmax {
  @scala.inline
  def apply(MAX_EXT: Double, MIN_EXT: Double): EXTBlendMinmax = {
    val __obj = js.Dynamic.literal(MAX_EXT = MAX_EXT.asInstanceOf[js.Any], MIN_EXT = MIN_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTBlendMinmax]
  }
  @scala.inline
  implicit class EXTBlendMinmaxOps[Self <: EXTBlendMinmax] (val x: Self) extends AnyVal {
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
    def setMAX_EXT(value: Double): Self = this.set("MAX_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setMIN_EXT(value: Double): Self = this.set("MIN_EXT", value.asInstanceOf[js.Any])
  }
  
}

