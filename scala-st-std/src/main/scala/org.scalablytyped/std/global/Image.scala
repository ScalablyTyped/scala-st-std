package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Image")
@js.native
class Image ()
  extends org.scalablytyped.std.HTMLImageElement {
  def this(width: Double) = this()
  def this(width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(width: Double, height: Double) = this()
  /* CompleteClass */
  override val childElementCount: Double = js.native
  /* CompleteClass */
  override val children: org.scalablytyped.std.HTMLCollection = js.native
  /* CompleteClass */
  override val firstElementChild: org.scalablytyped.std.Element | Null = js.native
  /* CompleteClass */
  override val lastElementChild: org.scalablytyped.std.Element | Null = js.native
  /* CompleteClass */
  override val nextElementSibling: org.scalablytyped.std.Element | Null = js.native
  /* CompleteClass */
  override val previousElementSibling: org.scalablytyped.std.Element | Null = js.native
  /* CompleteClass */
  override def remove(): Unit = js.native
}

@JSGlobal("Image")
@js.native
object Image
  extends Instantiable0[org.scalablytyped.std.HTMLImageElement]
     with Instantiable1[/* width */ Double, org.scalablytyped.std.HTMLImageElement]
     with Instantiable2[
      js.UndefOr[/* width */ Double], 
      /* height */ Double, 
      org.scalablytyped.std.HTMLImageElement
    ]

