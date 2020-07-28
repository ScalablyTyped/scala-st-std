package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EXTSRGB extends js.Object {
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: Double
  val SRGB8_ALPHA8_EXT: Double
  val SRGB_ALPHA_EXT: Double
  val SRGB_EXT: Double
}

object EXTSRGB {
  @scala.inline
  def apply(
    FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT: Double,
    SRGB8_ALPHA8_EXT: Double,
    SRGB_ALPHA_EXT: Double,
    SRGB_EXT: Double
  ): EXTSRGB = {
    val __obj = js.Dynamic.literal(FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT = FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT.asInstanceOf[js.Any], SRGB8_ALPHA8_EXT = SRGB8_ALPHA8_EXT.asInstanceOf[js.Any], SRGB_ALPHA_EXT = SRGB_ALPHA_EXT.asInstanceOf[js.Any], SRGB_EXT = SRGB_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTSRGB]
  }
  @scala.inline
  implicit class EXTSRGBOps[Self <: EXTSRGB] (val x: Self) extends AnyVal {
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
    def setFRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT(value: Double): Self = this.set("FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSRGB8_ALPHA8_EXT(value: Double): Self = this.set("SRGB8_ALPHA8_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSRGB_ALPHA_EXT(value: Double): Self = this.set("SRGB_ALPHA_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSRGB_EXT(value: Double): Self = this.set("SRGB_EXT", value.asInstanceOf[js.Any])
  }
  
}

