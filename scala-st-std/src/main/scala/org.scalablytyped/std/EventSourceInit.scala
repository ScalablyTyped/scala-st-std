package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSourceInit extends js.Object {
  val withCredentials: scala.Boolean
}

object EventSourceInit {
  @scala.inline
  def apply(withCredentials: scala.Boolean): EventSourceInit = {
    val __obj = js.Dynamic.literal(withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceInit]
  }
  @scala.inline
  implicit class EventSourceInitOps[Self <: EventSourceInit] (val x: Self) extends AnyVal {
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
    def setWithCredentials(value: scala.Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
  }
  
}

