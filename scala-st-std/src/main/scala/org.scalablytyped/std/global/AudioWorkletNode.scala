package org.scalablytyped.std.global

import org.scalablytyped.std.AudioWorkletNodeOptions
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AudioWorkletNode")
@js.native
class AudioWorkletNode protected ()
  extends org.scalablytyped.std.AudioWorkletNode {
  def this(context: org.scalablytyped.std.BaseAudioContext, name: java.lang.String) = this()
  def this(
    context: org.scalablytyped.std.BaseAudioContext,
    name: java.lang.String,
    options: AudioWorkletNodeOptions
  ) = this()
}

@JSGlobal("AudioWorkletNode")
@js.native
object AudioWorkletNode
  extends Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* name */ java.lang.String, 
      org.scalablytyped.std.AudioWorkletNode
    ]
     with Instantiable3[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* name */ java.lang.String, 
      /* options */ AudioWorkletNodeOptions, 
      org.scalablytyped.std.AudioWorkletNode
    ]

