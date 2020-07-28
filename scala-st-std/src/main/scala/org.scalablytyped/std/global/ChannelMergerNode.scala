package org.scalablytyped.std.global

import org.scalablytyped.std.ChannelMergerOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ChannelMergerNode")
@js.native
class ChannelMergerNode protected ()
  extends org.scalablytyped.std.AudioNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: ChannelMergerOptions) = this()
}

@JSGlobal("ChannelMergerNode")
@js.native
object ChannelMergerNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.ChannelMergerNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ ChannelMergerOptions, 
      org.scalablytyped.std.ChannelMergerNode
    ]

