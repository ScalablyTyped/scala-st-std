package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.default
import org.scalablytyped.std.stdStrings.flipY
import org.scalablytyped.std.stdStrings.high
import org.scalablytyped.std.stdStrings.low
import org.scalablytyped.std.stdStrings.medium
import org.scalablytyped.std.stdStrings.none
import org.scalablytyped.std.stdStrings.pixelated
import org.scalablytyped.std.stdStrings.premultiply
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmapOptions extends js.Object {
  var colorSpaceConversion: js.UndefOr[none | default] = js.undefined
  var imageOrientation: js.UndefOr[none | flipY] = js.undefined
  var premultiplyAlpha: js.UndefOr[none | premultiply | default] = js.undefined
  var resizeHeight: js.UndefOr[Double] = js.undefined
  var resizeQuality: js.UndefOr[pixelated | low | medium | high] = js.undefined
  var resizeWidth: js.UndefOr[Double] = js.undefined
}

object ImageBitmapOptions {
  @scala.inline
  def apply(): ImageBitmapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBitmapOptions]
  }
  @scala.inline
  implicit class ImageBitmapOptionsOps[Self <: ImageBitmapOptions] (val x: Self) extends AnyVal {
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
    def setColorSpaceConversion(value: none | default): Self = this.set("colorSpaceConversion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSpaceConversion: Self = this.set("colorSpaceConversion", js.undefined)
    @scala.inline
    def setImageOrientation(value: none | flipY): Self = this.set("imageOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageOrientation: Self = this.set("imageOrientation", js.undefined)
    @scala.inline
    def setPremultiplyAlpha(value: none | premultiply | default): Self = this.set("premultiplyAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremultiplyAlpha: Self = this.set("premultiplyAlpha", js.undefined)
    @scala.inline
    def setResizeHeight(value: Double): Self = this.set("resizeHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeHeight: Self = this.set("resizeHeight", js.undefined)
    @scala.inline
    def setResizeQuality(value: pixelated | low | medium | high): Self = this.set("resizeQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeQuality: Self = this.set("resizeQuality", js.undefined)
    @scala.inline
    def setResizeWidth(value: Double): Self = this.set("resizeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeWidth: Self = this.set("resizeWidth", js.undefined)
  }
  
}

