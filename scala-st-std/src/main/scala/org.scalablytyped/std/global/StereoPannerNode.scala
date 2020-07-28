package org.scalablytyped.std.global

import org.scalablytyped.std.StereoPannerOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StereoPannerNode")
@js.native
class StereoPannerNode protected ()
  extends org.scalablytyped.std.StereoPannerNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: StereoPannerOptions) = this()
}

@JSGlobal("StereoPannerNode")
@js.native
object StereoPannerNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.StereoPannerNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ StereoPannerOptions, 
      org.scalablytyped.std.StereoPannerNode
    ]

