package org.scalablytyped.std.global

import org.scalablytyped.std.DynamicsCompressorOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DynamicsCompressorNode")
@js.native
class DynamicsCompressorNode protected ()
  extends org.scalablytyped.std.DynamicsCompressorNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: DynamicsCompressorOptions) = this()
}

@JSGlobal("DynamicsCompressorNode")
@js.native
object DynamicsCompressorNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.DynamicsCompressorNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ DynamicsCompressorOptions, 
      org.scalablytyped.std.DynamicsCompressorNode
    ]

