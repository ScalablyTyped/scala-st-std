package org.scalablytyped.std.global

import org.scalablytyped.std.AudioBufferSourceOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AudioBufferSourceNode")
@js.native
class AudioBufferSourceNode protected ()
  extends org.scalablytyped.std.AudioBufferSourceNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: AudioBufferSourceOptions) = this()
}

@JSGlobal("AudioBufferSourceNode")
@js.native
object AudioBufferSourceNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.AudioBufferSourceNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ AudioBufferSourceOptions, 
      org.scalablytyped.std.AudioBufferSourceNode
    ]

