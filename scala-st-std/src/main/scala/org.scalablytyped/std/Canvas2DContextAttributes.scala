package org.scalablytyped.std

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canvas2DContextAttributes
  extends /* attribute */ StringDictionary[js.UndefOr[scala.Boolean | java.lang.String]] {
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  var storage: js.UndefOr[scala.Boolean] = js.undefined
  var willReadFrequently: js.UndefOr[scala.Boolean] = js.undefined
}

object Canvas2DContextAttributes {
  @scala.inline
  def apply(): Canvas2DContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Canvas2DContextAttributes]
  }
  @scala.inline
  implicit class Canvas2DContextAttributesOps[Self <: Canvas2DContextAttributes] (val x: Self) extends AnyVal {
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
    def setAlpha(value: scala.Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setStorage(value: scala.Boolean): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    @scala.inline
    def setWillReadFrequently(value: scala.Boolean): Self = this.set("willReadFrequently", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWillReadFrequently: Self = this.set("willReadFrequently", js.undefined)
  }
  
}

