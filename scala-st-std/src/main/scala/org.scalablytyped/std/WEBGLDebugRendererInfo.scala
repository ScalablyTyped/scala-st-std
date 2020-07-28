package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGLDebugRendererInfo extends js.Object {
  val UNMASKED_RENDERER_WEBGL: Double
  val UNMASKED_VENDOR_WEBGL: Double
}

object WEBGLDebugRendererInfo {
  @scala.inline
  def apply(UNMASKED_RENDERER_WEBGL: Double, UNMASKED_VENDOR_WEBGL: Double): WEBGLDebugRendererInfo = {
    val __obj = js.Dynamic.literal(UNMASKED_RENDERER_WEBGL = UNMASKED_RENDERER_WEBGL.asInstanceOf[js.Any], UNMASKED_VENDOR_WEBGL = UNMASKED_VENDOR_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLDebugRendererInfo]
  }
  @scala.inline
  implicit class WEBGLDebugRendererInfoOps[Self <: WEBGLDebugRendererInfo] (val x: Self) extends AnyVal {
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
    def setUNMASKED_RENDERER_WEBGL(value: Double): Self = this.set("UNMASKED_RENDERER_WEBGL", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNMASKED_VENDOR_WEBGL(value: Double): Self = this.set("UNMASKED_VENDOR_WEBGL", value.asInstanceOf[js.Any])
  }
  
}

