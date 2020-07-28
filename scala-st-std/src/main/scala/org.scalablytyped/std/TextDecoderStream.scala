package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDecoderStream
  extends TextDecoderCommon
     with GenericTransformStream

object TextDecoderStream {
  @scala.inline
  def apply(
    encoding: java.lang.String,
    fatal: scala.Boolean,
    ignoreBOM: scala.Boolean,
    readable: ReadableStream[_],
    writable: WritableStream[_]
  ): TextDecoderStream = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderStream]
  }
}

