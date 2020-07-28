package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WEBGLCompressedTextureS3tc extends js.Object {
  var COMPRESSED_RGBA_S3TC_DXT1_EXT: Double
  var COMPRESSED_RGBA_S3TC_DXT3_EXT: Double
  var COMPRESSED_RGBA_S3TC_DXT5_EXT: Double
  var COMPRESSED_RGB_S3TC_DXT1_EXT: Double
}

object WEBGLCompressedTextureS3tc {
  @scala.inline
  def apply(
    COMPRESSED_RGBA_S3TC_DXT1_EXT: Double,
    COMPRESSED_RGBA_S3TC_DXT3_EXT: Double,
    COMPRESSED_RGBA_S3TC_DXT5_EXT: Double,
    COMPRESSED_RGB_S3TC_DXT1_EXT: Double
  ): WEBGLCompressedTextureS3tc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_S3TC_DXT1_EXT = COMPRESSED_RGBA_S3TC_DXT1_EXT.asInstanceOf[js.Any], COMPRESSED_RGBA_S3TC_DXT3_EXT = COMPRESSED_RGBA_S3TC_DXT3_EXT.asInstanceOf[js.Any], COMPRESSED_RGBA_S3TC_DXT5_EXT = COMPRESSED_RGBA_S3TC_DXT5_EXT.asInstanceOf[js.Any], COMPRESSED_RGB_S3TC_DXT1_EXT = COMPRESSED_RGB_S3TC_DXT1_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLCompressedTextureS3tc]
  }
  @scala.inline
  implicit class WEBGLCompressedTextureS3tcOps[Self <: WEBGLCompressedTextureS3tc] (val x: Self) extends AnyVal {
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
    def setCOMPRESSED_RGBA_S3TC_DXT1_EXT(value: Double): Self = this.set("COMPRESSED_RGBA_S3TC_DXT1_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMPRESSED_RGBA_S3TC_DXT3_EXT(value: Double): Self = this.set("COMPRESSED_RGBA_S3TC_DXT3_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMPRESSED_RGBA_S3TC_DXT5_EXT(value: Double): Self = this.set("COMPRESSED_RGBA_S3TC_DXT5_EXT", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMPRESSED_RGB_S3TC_DXT1_EXT(value: Double): Self = this.set("COMPRESSED_RGB_S3TC_DXT1_EXT", value.asInstanceOf[js.Any])
  }
  
}

