package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStream extends _BodyInit {
  val locked: scala.Boolean
  def cancel(): js.Promise[Unit]
  def getReader(): ReadableStreamReader
}

object ReadableStream {
  @scala.inline
  def apply(cancel: () => js.Promise[Unit], getReader: () => ReadableStreamReader, locked: scala.Boolean): ReadableStream = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), getReader = js.Any.fromFunction0(getReader), locked = locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStream]
  }
  @scala.inline
  implicit class ReadableStreamOps[Self <: ReadableStream] (val x: Self) extends AnyVal {
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
    def setCancel(value: () => js.Promise[Unit]): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetReader(value: () => ReadableStreamReader): Self = this.set("getReader", js.Any.fromFunction0(value))
    @scala.inline
    def setLocked(value: scala.Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
  }
  
}

