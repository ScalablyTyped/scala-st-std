package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackCueList extends /* index */ NumberDictionary[TextTrackCue] {
  val length: Double
  def getCueById(id: java.lang.String): TextTrackCue
  def item(index: Double): TextTrackCue
}

object TextTrackCueList {
  @scala.inline
  def apply(getCueById: java.lang.String => TextTrackCue, item: Double => TextTrackCue, length: Double): TextTrackCueList = {
    val __obj = js.Dynamic.literal(getCueById = js.Any.fromFunction1(getCueById), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackCueList]
  }
  @scala.inline
  implicit class TextTrackCueListOps[Self <: TextTrackCueList] (val x: Self) extends AnyVal {
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
    def setGetCueById(value: java.lang.String => TextTrackCue): Self = this.set("getCueById", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: Double => TextTrackCue): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

