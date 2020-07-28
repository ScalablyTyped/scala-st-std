package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionObserverEntry extends js.Object {
  val boundingClientRect: ClientRect | DOMRect
  val intersectionRatio: Double
  val intersectionRect: ClientRect | DOMRect
  val isIntersecting: scala.Boolean
  val rootBounds: ClientRect | DOMRect
  val target: Element
  val time: Double
}

object IntersectionObserverEntry {
  @scala.inline
  def apply(
    boundingClientRect: ClientRect | DOMRect,
    intersectionRatio: Double,
    intersectionRect: ClientRect | DOMRect,
    isIntersecting: scala.Boolean,
    rootBounds: ClientRect | DOMRect,
    target: Element,
    time: Double
  ): IntersectionObserverEntry = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], rootBounds = rootBounds.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserverEntry]
  }
  @scala.inline
  implicit class IntersectionObserverEntryOps[Self <: IntersectionObserverEntry] (val x: Self) extends AnyVal {
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
    def setBoundingClientRect(value: ClientRect | DOMRect): Self = this.set("boundingClientRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersectionRatio(value: Double): Self = this.set("intersectionRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersectionRect(value: ClientRect | DOMRect): Self = this.set("intersectionRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIntersecting(value: scala.Boolean): Self = this.set("isIntersecting", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootBounds(value: ClientRect | DOMRect): Self = this.set("rootBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

