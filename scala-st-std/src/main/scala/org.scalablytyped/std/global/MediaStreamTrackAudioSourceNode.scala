package org.scalablytyped.std.global

import org.scalablytyped.std.MediaStreamTrackAudioSourceOptions
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaStreamTrackAudioSourceNode")
@js.native
class MediaStreamTrackAudioSourceNode protected ()
  extends org.scalablytyped.std.AudioNode {
  def this(context: org.scalablytyped.std.AudioContext, options: MediaStreamTrackAudioSourceOptions) = this()
}

@JSGlobal("MediaStreamTrackAudioSourceNode")
@js.native
object MediaStreamTrackAudioSourceNode
  extends Instantiable2[
      /* context */ org.scalablytyped.std.AudioContext, 
      /* options */ MediaStreamTrackAudioSourceOptions, 
      org.scalablytyped.std.MediaStreamTrackAudioSourceNode
    ]

