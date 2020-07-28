package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsZoomToOptions extends js.Object {
  var animate: js.UndefOr[java.lang.String] = js.undefined
  var contentX: js.UndefOr[Double] = js.undefined
  var contentY: js.UndefOr[Double] = js.undefined
  var scaleFactor: js.UndefOr[Double] = js.undefined
  var viewportX: js.UndefOr[java.lang.String] = js.undefined
  var viewportY: js.UndefOr[java.lang.String] = js.undefined
}

object MsZoomToOptions {
  @scala.inline
  def apply(): MsZoomToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsZoomToOptions]
  }
  @scala.inline
  implicit class MsZoomToOptionsOps[Self <: MsZoomToOptions] (val x: Self) extends AnyVal {
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
    def setAnimate(value: java.lang.String): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setContentX(value: Double): Self = this.set("contentX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentX: Self = this.set("contentX", js.undefined)
    @scala.inline
    def setContentY(value: Double): Self = this.set("contentY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentY: Self = this.set("contentY", js.undefined)
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleFactor: Self = this.set("scaleFactor", js.undefined)
    @scala.inline
    def setViewportX(value: java.lang.String): Self = this.set("viewportX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportX: Self = this.set("viewportX", js.undefined)
    @scala.inline
    def setViewportY(value: java.lang.String): Self = this.set("viewportY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportY: Self = this.set("viewportY", js.undefined)
  }
  
}

