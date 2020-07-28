package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamReader extends js.Object {
  def cancel(): js.Promise[Unit]
  def read(): js.Promise[_]
  def releaseLock(): Unit
}

object ReadableStreamReader {
  @scala.inline
  def apply(cancel: () => js.Promise[Unit], read: () => js.Promise[_], releaseLock: () => Unit): ReadableStreamReader = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read), releaseLock = js.Any.fromFunction0(releaseLock))
    __obj.asInstanceOf[ReadableStreamReader]
  }
  @scala.inline
  implicit class ReadableStreamReaderOps[Self <: ReadableStreamReader] (val x: Self) extends AnyVal {
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
    def setRead(value: () => js.Promise[_]): Self = this.set("read", js.Any.fromFunction0(value))
    @scala.inline
    def setReleaseLock(value: () => Unit): Self = this.set("releaseLock", js.Any.fromFunction0(value))
  }
  
}

