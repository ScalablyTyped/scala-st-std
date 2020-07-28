package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncoderStream
  extends TextEncoderCommon
     with GenericTransformStream

object TextEncoderStream {
  @scala.inline
  def apply(encoding: java.lang.String, readable: ReadableStream[_], writable: WritableStream[_]): TextEncoderStream = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderStream]
  }
}

