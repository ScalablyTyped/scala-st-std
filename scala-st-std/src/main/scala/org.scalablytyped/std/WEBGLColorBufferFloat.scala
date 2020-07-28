package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGLColorBufferFloat extends js.Object {
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Double
  val RGB32F_EXT: Double
  val RGBA32F_EXT: Double
  val UNSIGNED_NORMALIZED_EXT: Double
}

object WEBGLColorBufferFloat {
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT: Double,
    RGB32F_EXT: Double,
    RGBA32F_EXT: Double,
    UNSIGNED_NORMALIZED_EXT: Double
  ): WEBGLColorBufferFloat = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT = FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT.asInstanceOf[js.Any], RGB32F_EXT = RGB32F_EXT.asInstanceOf[js.Any], RGBA32F_EXT = RGBA32F_EXT.asInstanceOf[js.Any], UNSIGNED_NORMALIZED_EXT = UNSIGNED_NORMALIZED_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLColorBufferFloat]
  }
  @scala.inline
  implicit class WEBGLColorBufferFloatOps[Self <: WEBGLColorBufferFloat] (val x: Self) extends AnyVal {
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
    def setFRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT(value: Double): Self = this.set("FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGB32F_EXT(value: Double): Self = this.set("RGB32F_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setRGBA32F_EXT(value: Double): Self = this.set("RGBA32F_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNSIGNED_NORMALIZED_EXT(value: Double): Self = this.set("UNSIGNED_NORMALIZED_EXT", value.asInstanceOf[js.Any])
  }
  
}

