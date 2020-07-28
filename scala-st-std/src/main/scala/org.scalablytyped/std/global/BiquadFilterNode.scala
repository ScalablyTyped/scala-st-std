package org.scalablytyped.std.global

import org.scalablytyped.std.BiquadFilterOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BiquadFilterNode")
@js.native
class BiquadFilterNode protected ()
  extends org.scalablytyped.std.BiquadFilterNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: BiquadFilterOptions) = this()
}

@JSGlobal("BiquadFilterNode")
@js.native
object BiquadFilterNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.BiquadFilterNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ BiquadFilterOptions, 
      org.scalablytyped.std.BiquadFilterNode
    ]

