package org.scalablytyped.std.global

import org.scalablytyped.std.OscillatorOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OscillatorNode")
@js.native
class OscillatorNode protected ()
  extends org.scalablytyped.std.OscillatorNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: OscillatorOptions) = this()
}

@JSGlobal("OscillatorNode")
@js.native
object OscillatorNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.OscillatorNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ OscillatorOptions, 
      org.scalablytyped.std.OscillatorNode
    ]

