package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OscillatorNodeEventMap extends js.Object {
  var ended: MediaStreamErrorEvent
}

object OscillatorNodeEventMap {
  @scala.inline
  def apply(ended: MediaStreamErrorEvent): OscillatorNodeEventMap = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any])
    __obj.asInstanceOf[OscillatorNodeEventMap]
  }
  @scala.inline
  implicit class OscillatorNodeEventMapOps[Self <: OscillatorNodeEventMap] (val x: Self) extends AnyVal {
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
    def setEnded(value: MediaStreamErrorEvent): Self = this.set("ended", value.asInstanceOf[js.Any])
  }
  
}

