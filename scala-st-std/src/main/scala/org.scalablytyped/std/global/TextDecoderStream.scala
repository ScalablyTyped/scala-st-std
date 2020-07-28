package org.scalablytyped.std.global

import org.scalablytyped.std.BufferSource
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
  /**
    * Returns encoding's name, lowercased.
    */
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  /**
    * Returns true if error mode is "fatal", and false otherwise.
    */
  /* CompleteClass */
  override val fatal: scala.Boolean = js.native
  /**
    * Returns true if ignore BOM flag is set, and false otherwise.
    */
  /* CompleteClass */
  override val ignoreBOM: scala.Boolean = js.native
  /**
    * Returns a readable stream whose chunks are strings resulting from running encoding's decoder on the chunks written to writable.
    */
  /* CompleteClass */
  override val readable: org.scalablytyped.std.ReadableStream[_] = js.native
  /* CompleteClass */
  @JSName("readable")
  override val readable_TextDecoderStream: org.scalablytyped.std.ReadableStream[java.lang.String] = js.native
  /**
    * Returns a writable stream which accepts [AllowShared] BufferSource chunks and runs them through encoding's decoder before making them available to readable.
    * 
    * Typically this will be used via the pipeThrough() method on a ReadableStream source.
    * 
    * ```
    * var decoder = new TextDecoderStream(encoding);
    * byteReadable
    *   .pipeThrough(decoder)
    *   .pipeTo(textWritable);
    * ```
    * 
    * If the error mode is "fatal" and encoding's decoder returns error, both readable and writable will be errored with a TypeError.
    */
  /* CompleteClass */
  override val writable: org.scalablytyped.std.WritableStream[_] = js.native
  /* CompleteClass */
  @JSName("writable")
  override val writable_TextDecoderStream: org.scalablytyped.std.WritableStream[BufferSource] = js.native
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

