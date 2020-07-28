package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechSynthesisEventInit extends EventInit {
  var charIndex: js.UndefOr[Double] = js.undefined
  var elapsedTime: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var utterance: js.UndefOr[SpeechSynthesisUtterance | Null] = js.undefined
}

object SpeechSynthesisEventInit {
  @scala.inline
  def apply(): SpeechSynthesisEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeechSynthesisEventInit]
  }
  @scala.inline
  implicit class SpeechSynthesisEventInitOps[Self <: SpeechSynthesisEventInit] (val x: Self) extends AnyVal {
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
    def setCharIndex(value: Double): Self = this.set("charIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharIndex: Self = this.set("charIndex", js.undefined)
    @scala.inline
    def setElapsedTime(value: Double): Self = this.set("elapsedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElapsedTime: Self = this.set("elapsedTime", js.undefined)
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUtterance(value: SpeechSynthesisUtterance): Self = this.set("utterance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtterance: Self = this.set("utterance", js.undefined)
    @scala.inline
    def setUtteranceNull: Self = this.set("utterance", null)
  }
  
}

