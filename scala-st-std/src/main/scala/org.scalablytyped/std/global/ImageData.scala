package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ImageData")
@js.native
class ImageData protected ()
  extends org.scalablytyped.std.ImageData {
  def this(width: Double, height: Double) = this()
  def this(array: org.scalablytyped.std.Uint8ClampedArray, width: Double, height: Double) = this()
  /* CompleteClass */
  override val data: org.scalablytyped.std.Uint8ClampedArray = js.native
  /* CompleteClass */
  override val height: Double = js.native
  /* CompleteClass */
  override val width: Double = js.native
}

@JSGlobal("ImageData")
@js.native
object ImageData
  extends Instantiable2[/* width */ Double, /* height */ Double, org.scalablytyped.std.ImageData]
     with Instantiable3[
      /* array */ org.scalablytyped.std.Uint8ClampedArray, 
      /* width */ Double, 
      /* height */ Double, 
      org.scalablytyped.std.ImageData
    ]

