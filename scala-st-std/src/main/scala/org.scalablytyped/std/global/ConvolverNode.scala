package org.scalablytyped.std.global

import org.scalablytyped.std.ConvolverOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ConvolverNode")
@js.native
class ConvolverNode protected ()
  extends org.scalablytyped.std.ConvolverNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: ConvolverOptions) = this()
}

@JSGlobal("ConvolverNode")
@js.native
object ConvolverNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.ConvolverNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ ConvolverOptions, 
      org.scalablytyped.std.ConvolverNode
    ]

