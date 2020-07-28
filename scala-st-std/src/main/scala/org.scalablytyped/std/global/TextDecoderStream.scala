package org.scalablytyped.std.global

import org.scalablytyped.std.TextDecoderOptions
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextDecoderStream")
@js.native
class TextDecoderStream ()
  extends org.scalablytyped.std.TextDecoderStream {
  def this(label: java.lang.String) = this()
  def this(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions) = this()
  def this(label: java.lang.String, options: TextDecoderOptions) = this()
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  /* CompleteClass */
  override val fatal: scala.Boolean = js.native
  /* CompleteClass */
  override val ignoreBOM: scala.Boolean = js.native
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

@JSGlobal("TextDecoderStream")
@js.native
object TextDecoderStream
  extends Instantiable0[org.scalablytyped.std.TextDecoderStream]
     with Instantiable1[/* label */ java.lang.String, org.scalablytyped.std.TextDecoderStream]
     with Instantiable2[
      js.UndefOr[/* label */ java.lang.String], 
      /* options */ TextDecoderOptions, 
      org.scalablytyped.std.TextDecoderStream
    ]

