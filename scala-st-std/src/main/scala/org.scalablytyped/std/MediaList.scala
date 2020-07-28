package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaList
  extends /* index */ NumberDictionary[java.lang.String] {
  var length: Double
  var mediaText: java.lang.String
  def appendMedium(newMedium: java.lang.String): Unit
  def deleteMedium(oldMedium: java.lang.String): Unit
  def item(index: Double): java.lang.String
}

object MediaList {
  @scala.inline
  def apply(
    appendMedium: java.lang.String => Unit,
    deleteMedium: java.lang.String => Unit,
    item: Double => java.lang.String,
    length: Double,
    mediaText: java.lang.String
  ): MediaList = {
    val __obj = js.Dynamic.literal(appendMedium = js.Any.fromFunction1(appendMedium), deleteMedium = js.Any.fromFunction1(deleteMedium), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], mediaText = mediaText.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaList]
  }
  @scala.inline
  implicit class MediaListOps[Self <: MediaList] (val x: Self) extends AnyVal {
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
    def setAppendMedium(value: java.lang.String => Unit): Self = this.set("appendMedium", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteMedium(value: java.lang.String => Unit): Self = this.set("deleteMedium", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: Double => java.lang.String): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaText(value: java.lang.String): Self = this.set("mediaText", value.asInstanceOf[js.Any])
  }
  
}

