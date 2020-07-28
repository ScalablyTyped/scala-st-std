package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamEventMap extends js.Object {
  var active: Event
  var addtrack: TrackEvent
  var inactive: Event
  var removetrack: TrackEvent
}

object MediaStreamEventMap {
  @scala.inline
  def apply(active: Event, addtrack: TrackEvent, inactive: Event, removetrack: TrackEvent): MediaStreamEventMap = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addtrack = addtrack.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamEventMap]
  }
  @scala.inline
  implicit class MediaStreamEventMapOps[Self <: MediaStreamEventMap] (val x: Self) extends AnyVal {
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
    def setActive(value: Event): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddtrack(value: TrackEvent): Self = this.set("addtrack", value.asInstanceOf[js.Any])
    @scala.inline
    def setInactive(value: Event): Self = this.set("inactive", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovetrack(value: TrackEvent): Self = this.set("removetrack", value.asInstanceOf[js.Any])
  }
  
}

