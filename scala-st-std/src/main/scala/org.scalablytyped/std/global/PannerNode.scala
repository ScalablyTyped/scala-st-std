package org.scalablytyped.std.global

import org.scalablytyped.std.PannerOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PannerNode")
@js.native
class PannerNode protected ()
  extends org.scalablytyped.std.PannerNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: PannerOptions) = this()
}

@JSGlobal("PannerNode")
@js.native
object PannerNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.PannerNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ PannerOptions, 
      org.scalablytyped.std.PannerNode
    ]

