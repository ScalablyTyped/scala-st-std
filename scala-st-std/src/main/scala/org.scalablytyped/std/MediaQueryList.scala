package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryList extends js.Object {
  val matches: scala.Boolean
  val media: java.lang.String
  def addListener(listener: MediaQueryListListener): Unit
  def removeListener(listener: MediaQueryListListener): Unit
}

object MediaQueryList {
  @scala.inline
  def apply(
    addListener: MediaQueryListListener => Unit,
    matches: scala.Boolean,
    media: java.lang.String,
    removeListener: MediaQueryListListener => Unit
  ): MediaQueryList = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), matches = matches.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[MediaQueryList]
  }
  @scala.inline
  implicit class MediaQueryListOps[Self <: MediaQueryList] (val x: Self) extends AnyVal {
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
    def setAddListener(value: MediaQueryListListener => Unit): Self = this.set("addListener", js.Any.fromFunction1(value))
    @scala.inline
    def setMatches(value: scala.Boolean): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia(value: java.lang.String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveListener(value: MediaQueryListListener => Unit): Self = this.set("removeListener", js.Any.fromFunction1(value))
  }
  
}

