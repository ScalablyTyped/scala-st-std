package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericTransformStream extends js.Object {
  val readable: ReadableStream[_]
  /**
    * Returns a writable stream which accepts string chunks and runs them through UTF-8's encoder before making them available to readable.
    * Typically this will be used via the pipeThrough() method on a ReadableStream source.
    * textReadable
    * .pipeThrough(new TextEncoderStream())
    * .pipeTo(byteWritable);
    */
  val writable: WritableStream[_]
}

object GenericTransformStream {
  @scala.inline
  def apply(readable: ReadableStream[_], writable: WritableStream[_]): GenericTransformStream = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTransformStream]
  }
  @scala.inline
  implicit class GenericTransformStreamOps[Self <: GenericTransformStream] (val x: Self) extends AnyVal {
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
    def setReadable(value: ReadableStream[_]): Self = this.set("readable", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritable(value: WritableStream[_]): Self = this.set("writable", value.asInstanceOf[js.Any])
  }
  
}

