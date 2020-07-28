package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEventInit extends SharedKeyboardAndMouseEventInit {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[Double] = js.undefined
  var repeat: js.UndefOr[scala.Boolean] = js.undefined
}

object KeyboardEventInit {
  @scala.inline
  def apply(): KeyboardEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardEventInit]
  }
  @scala.inline
  implicit class KeyboardEventInitOps[Self <: KeyboardEventInit] (val x: Self) extends AnyVal {
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
    def setKey(value: java.lang.String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setRepeat(value: scala.Boolean): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
  }
  
}

