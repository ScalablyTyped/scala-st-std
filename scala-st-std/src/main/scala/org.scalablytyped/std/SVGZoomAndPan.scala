package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGZoomAndPan extends js.Object {
  var SVG_ZOOMANDPAN_DISABLE: Double
  var SVG_ZOOMANDPAN_MAGNIFY: Double
  var SVG_ZOOMANDPAN_UNKNOWN: Double
}

object SVGZoomAndPan {
  @scala.inline
  def apply(SVG_ZOOMANDPAN_DISABLE: Double, SVG_ZOOMANDPAN_MAGNIFY: Double, SVG_ZOOMANDPAN_UNKNOWN: Double): SVGZoomAndPan = {
    val __obj = js.Dynamic.literal(SVG_ZOOMANDPAN_DISABLE = SVG_ZOOMANDPAN_DISABLE.asInstanceOf[js.Any], SVG_ZOOMANDPAN_MAGNIFY = SVG_ZOOMANDPAN_MAGNIFY.asInstanceOf[js.Any], SVG_ZOOMANDPAN_UNKNOWN = SVG_ZOOMANDPAN_UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGZoomAndPan]
  }
  @scala.inline
  implicit class SVGZoomAndPanOps[Self <: SVGZoomAndPan] (val x: Self) extends AnyVal {
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
    def setSVG_ZOOMANDPAN_DISABLE(value: Double): Self = this.set("SVG_ZOOMANDPAN_DISABLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSVG_ZOOMANDPAN_MAGNIFY(value: Double): Self = this.set("SVG_ZOOMANDPAN_MAGNIFY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSVG_ZOOMANDPAN_UNKNOWN(value: Double): Self = this.set("SVG_ZOOMANDPAN_UNKNOWN", value.asInstanceOf[js.Any])
  }
  
}

