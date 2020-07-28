package org.scalablytyped.std.global

import org.scalablytyped.std.ConstantSourceOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ConstantSourceNode")
@js.native
class ConstantSourceNode protected ()
  extends org.scalablytyped.std.ConstantSourceNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: ConstantSourceOptions) = this()
}

@JSGlobal("ConstantSourceNode")
@js.native
object ConstantSourceNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.ConstantSourceNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ ConstantSourceOptions, 
      org.scalablytyped.std.ConstantSourceNode
    ]

