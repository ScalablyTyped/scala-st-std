package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechSynthesisUtteranceEventMap extends js.Object {
  var boundary: Event
  var end: Event
  var error: Event
  var mark: Event
  var pause: Event
  var resume: Event
  var start: Event
}

object SpeechSynthesisUtteranceEventMap {
  @scala.inline
  def apply(boundary: Event, end: Event, error: Event, mark: Event, pause: Event, resume: Event, start: Event): SpeechSynthesisUtteranceEventMap = {
    val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisUtteranceEventMap]
  }
  @scala.inline
  implicit class SpeechSynthesisUtteranceEventMapOps[Self <: SpeechSynthesisUtteranceEventMap] (val x: Self) extends AnyVal {
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
    def setBoundary(value: Event): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Event): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Event): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMark(value: Event): Self = this.set("mark", value.asInstanceOf[js.Any])
    @scala.inline
    def setPause(value: Event): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def setResume(value: Event): Self = this.set("resume", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Event): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

