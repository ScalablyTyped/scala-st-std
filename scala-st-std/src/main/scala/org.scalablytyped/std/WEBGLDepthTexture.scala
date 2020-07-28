package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGLDepthTexture extends js.Object {
  var UNSIGNED_INT_24_8_WEBGL: Double
}

object WEBGLDepthTexture {
  @scala.inline
  def apply(UNSIGNED_INT_24_8_WEBGL: Double): WEBGLDepthTexture = {
    val __obj = js.Dynamic.literal(UNSIGNED_INT_24_8_WEBGL = UNSIGNED_INT_24_8_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLDepthTexture]
  }
  @scala.inline
  implicit class WEBGLDepthTextureOps[Self <: WEBGLDepthTexture] (val x: Self) extends AnyVal {
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
    def setUNSIGNED_INT_24_8_WEBGL(value: Double): Self = this.set("UNSIGNED_INT_24_8_WEBGL", value.asInstanceOf[js.Any])
  }
  
}

