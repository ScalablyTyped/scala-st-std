package org.scalablytyped.std.global

import org.scalablytyped.std.ChannelSplitterOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ChannelSplitterNode")
@js.native
class ChannelSplitterNode protected ()
  extends org.scalablytyped.std.AudioNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: ChannelSplitterOptions) = this()
}

@JSGlobal("ChannelSplitterNode")
@js.native
object ChannelSplitterNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.ChannelSplitterNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ ChannelSplitterOptions, 
      org.scalablytyped.std.ChannelSplitterNode
    ]

