package org.scalablytyped.std

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationKeyFrame
  extends /* index */ StringDictionary[
      js.UndefOr[java.lang.String | Double | (js.Array[Double | Null | java.lang.String]) | Null]
    ] {
  var easing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var offset: js.UndefOr[Double | Null | (js.Array[Double | Null])] = js.undefined
}

object AnimationKeyFrame {
  @scala.inline
  def apply(): AnimationKeyFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationKeyFrame]
  }
  @scala.inline
  implicit class AnimationKeyFrameOps[Self <: AnimationKeyFrame] (val x: Self) extends AnyVal {
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
    def setEasingVarargs(value: java.lang.String*): Self = this.set("easing", js.Array(value :_*))
    @scala.inline
    def setEasing(value: java.lang.String | js.Array[java.lang.String]): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setOffsetVarargs(value: (Double | Null)*): Self = this.set("offset", js.Array(value :_*))
    @scala.inline
    def setOffset(value: Double | (js.Array[Double | Null])): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOffsetNull: Self = this.set("offset", null)
  }
  
}

