package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEncoderStream")
@js.native
class TextEncoderStream ()
  extends org.scalablytyped.std.TextEncoderStream {
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  /* CompleteClass */
  override val readable: org.scalablytyped.std.ReadableStream[_] = js.native
  /**
    * Returns a writable stream which accepts string chunks and runs them through UTF-8's encoder before making them available to readable.
    * Typically this will be used via the pipeThrough() method on a ReadableStream source.
    * textReadable
    * .pipeThrough(new TextEncoderStream())
    * .pipeTo(byteWritable);
    */
  /* CompleteClass */
  override val writable: org.scalablytyped.std.WritableStream[_] = js.native
}

@JSGlobal("TextEncoderStream")
@js.native
object TextEncoderStream
  extends Instantiable0[org.scalablytyped.std.TextEncoderStream]

