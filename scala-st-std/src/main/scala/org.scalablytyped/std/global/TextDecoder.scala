package org.scalablytyped.std.global

import org.scalablytyped.std.TextDecoderOptions
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextDecoder")
@js.native
class TextDecoder ()
  extends org.scalablytyped.std.TextDecoder {
  def this(label: java.lang.String) = this()
  def this(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions) = this()
  def this(label: java.lang.String, options: TextDecoderOptions) = this()
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  /* CompleteClass */
  override val fatal: scala.Boolean = js.native
  /* CompleteClass */
  override val ignoreBOM: scala.Boolean = js.native
}

@JSGlobal("TextDecoder")
@js.native
object TextDecoder
  extends Instantiable0[org.scalablytyped.std.TextDecoder]
     with Instantiable1[/* label */ java.lang.String, org.scalablytyped.std.TextDecoder]
     with Instantiable2[
      js.UndefOr[/* label */ java.lang.String], 
      /* options */ TextDecoderOptions, 
      org.scalablytyped.std.TextDecoder
    ]

