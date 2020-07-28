package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OESStandardDerivatives extends js.Object {
  val FRAGMENT_SHADER_DERIVATIVE_HINT_OES: GLenum
}

object OESStandardDerivatives {
  @scala.inline
  def apply(FRAGMENT_SHADER_DERIVATIVE_HINT_OES: GLenum): OESStandardDerivatives = {
    val __obj = js.Dynamic.literal(FRAGMENT_SHADER_DERIVATIVE_HINT_OES = FRAGMENT_SHADER_DERIVATIVE_HINT_OES.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESStandardDerivatives]
  }
  @scala.inline
  implicit class OESStandardDerivativesOps[Self <: OESStandardDerivatives] (val x: Self) extends AnyVal {
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
    def setFRAGMENT_SHADER_DERIVATIVE_HINT_OES(value: GLenum): Self = this.set("FRAGMENT_SHADER_DERIVATIVE_HINT_OES", value.asInstanceOf[js.Any])
  }
  
}

