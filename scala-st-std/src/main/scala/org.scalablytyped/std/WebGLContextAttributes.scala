package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLContextAttributes extends js.Object {
  var alpha: js.UndefOr[GLboolean] = js.undefined
  var antialias: js.UndefOr[GLboolean] = js.undefined
  var depth: js.UndefOr[GLboolean] = js.undefined
  var failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined
  var powerPreference: js.UndefOr[WebGLPowerPreference] = js.undefined
  var premultipliedAlpha: js.UndefOr[GLboolean] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[GLboolean] = js.undefined
  var stencil: js.UndefOr[GLboolean] = js.undefined
}

object WebGLContextAttributes {
  @scala.inline
  def apply(): WebGLContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLContextAttributes]
  }
  @scala.inline
  implicit class WebGLContextAttributesOps[Self <: WebGLContextAttributes] (val x: Self) extends AnyVal {
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
    def setAlpha(value: GLboolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setAntialias(value: GLboolean): Self = this.set("antialias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAntialias: Self = this.set("antialias", js.undefined)
    @scala.inline
    def setDepth(value: GLboolean): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setFailIfMajorPerformanceCaveat(value: scala.Boolean): Self = this.set("failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailIfMajorPerformanceCaveat: Self = this.set("failIfMajorPerformanceCaveat", js.undefined)
    @scala.inline
    def setPowerPreference(value: WebGLPowerPreference): Self = this.set("powerPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePowerPreference: Self = this.set("powerPreference", js.undefined)
    @scala.inline
    def setPremultipliedAlpha(value: GLboolean): Self = this.set("premultipliedAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremultipliedAlpha: Self = this.set("premultipliedAlpha", js.undefined)
    @scala.inline
    def setPreserveDrawingBuffer(value: GLboolean): Self = this.set("preserveDrawingBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveDrawingBuffer: Self = this.set("preserveDrawingBuffer", js.undefined)
    @scala.inline
    def setStencil(value: GLboolean): Self = this.set("stencil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStencil: Self = this.set("stencil", js.undefined)
  }
  
}

