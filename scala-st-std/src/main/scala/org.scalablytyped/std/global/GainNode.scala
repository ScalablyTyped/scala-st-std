package org.scalablytyped.std.global

import org.scalablytyped.std.GainOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GainNode")
@js.native
class GainNode protected ()
  extends org.scalablytyped.std.GainNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: GainOptions) = this()
}

@JSGlobal("GainNode")
@js.native
object GainNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.GainNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ GainOptions, 
      org.scalablytyped.std.GainNode
    ]

