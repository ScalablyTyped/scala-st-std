package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechRecognitionEventMap extends js.Object {
  var audioend: Event
  var audiostart: Event
  var end: Event
  var error: Event
  var nomatch: SpeechRecognitionEvent
  var result: SpeechRecognitionEvent
  var soundend: Event
  var soundstart: Event
  var speechend: Event
  var speechstart: Event
  var start: Event
}

object SpeechRecognitionEventMap {
  @scala.inline
  def apply(
    audioend: Event,
    audiostart: Event,
    end: Event,
    error: Event,
    nomatch: SpeechRecognitionEvent,
    result: SpeechRecognitionEvent,
    soundend: Event,
    soundstart: Event,
    speechend: Event,
    speechstart: Event,
    start: Event
  ): SpeechRecognitionEventMap = {
    val __obj = js.Dynamic.literal(audioend = audioend.asInstanceOf[js.Any], audiostart = audiostart.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], nomatch = nomatch.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], soundend = soundend.asInstanceOf[js.Any], soundstart = soundstart.asInstanceOf[js.Any], speechend = speechend.asInstanceOf[js.Any], speechstart = speechstart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionEventMap]
  }
  @scala.inline
  implicit class SpeechRecognitionEventMapOps[Self <: SpeechRecognitionEventMap] (val x: Self) extends AnyVal {
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
    def setAudioend(value: Event): Self = this.set("audioend", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudiostart(value: Event): Self = this.set("audiostart", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Event): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Event): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setNomatch(value: SpeechRecognitionEvent): Self = this.set("nomatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: SpeechRecognitionEvent): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoundend(value: Event): Self = this.set("soundend", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoundstart(value: Event): Self = this.set("soundstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeechend(value: Event): Self = this.set("speechend", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeechstart(value: Event): Self = this.set("speechstart", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Event): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

