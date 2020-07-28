package org.scalablytyped.std.anon

import org.scalablytyped.std.WebKitEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleEvent extends js.Object {
  def handleEvent(entries: js.Array[WebKitEntry]): Unit
}

object HandleEvent {
  @scala.inline
  def apply(handleEvent: js.Array[WebKitEntry] => Unit): HandleEvent = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[HandleEvent]
  }
  @scala.inline
  implicit class HandleEventOps[Self <: HandleEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandleEvent(value: js.Array[WebKitEntry] => Unit): Self = this.set("handleEvent", js.Any.fromFunction1(value))
  }
  
}

