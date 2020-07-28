package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionObserverEntryInit extends js.Object {
  var boundingClientRect: js.UndefOr[DOMRectInit] = js.undefined
  var intersectionRect: js.UndefOr[DOMRectInit] = js.undefined
  var rootBounds: js.UndefOr[DOMRectInit] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var time: js.UndefOr[Double] = js.undefined
}

object IntersectionObserverEntryInit {
  @scala.inline
  def apply(): IntersectionObserverEntryInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntersectionObserverEntryInit]
  }
  @scala.inline
  implicit class IntersectionObserverEntryInitOps[Self <: IntersectionObserverEntryInit] (val x: Self) extends AnyVal {
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
    def setBoundingClientRect(value: DOMRectInit): Self = this.set("boundingClientRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundingClientRect: Self = this.set("boundingClientRect", js.undefined)
    @scala.inline
    def setIntersectionRect(value: DOMRectInit): Self = this.set("intersectionRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntersectionRect: Self = this.set("intersectionRect", js.undefined)
    @scala.inline
    def setRootBounds(value: DOMRectInit): Self = this.set("rootBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootBounds: Self = this.set("rootBounds", js.undefined)
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

