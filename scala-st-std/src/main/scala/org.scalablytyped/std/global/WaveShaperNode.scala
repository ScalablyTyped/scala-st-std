package org.scalablytyped.std.global

import org.scalablytyped.std.WaveShaperOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WaveShaperNode")
@js.native
class WaveShaperNode protected ()
  extends org.scalablytyped.std.WaveShaperNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: WaveShaperOptions) = this()
}

@JSGlobal("WaveShaperNode")
@js.native
object WaveShaperNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.WaveShaperNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ WaveShaperOptions, 
      org.scalablytyped.std.WaveShaperNode
    ]

