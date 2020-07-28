package org.scalablytyped.std.global

import org.scalablytyped.std.AudioNodeOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaStreamAudioDestinationNode")
@js.native
class MediaStreamAudioDestinationNode protected ()
  extends org.scalablytyped.std.MediaStreamAudioDestinationNode {
  def this(context: org.scalablytyped.std.AudioContext) = this()
  def this(context: org.scalablytyped.std.AudioContext, options: AudioNodeOptions) = this()
}

@JSGlobal("MediaStreamAudioDestinationNode")
@js.native
object MediaStreamAudioDestinationNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.AudioContext, 
      org.scalablytyped.std.MediaStreamAudioDestinationNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.AudioContext, 
      /* options */ AudioNodeOptions, 
      org.scalablytyped.std.MediaStreamAudioDestinationNode
    ]

