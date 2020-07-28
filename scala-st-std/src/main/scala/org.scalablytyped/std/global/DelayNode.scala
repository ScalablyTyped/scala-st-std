package org.scalablytyped.std.global

import org.scalablytyped.std.DelayOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DelayNode")
@js.native
class DelayNode protected ()
  extends org.scalablytyped.std.DelayNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: DelayOptions) = this()
}

@JSGlobal("DelayNode")
@js.native
object DelayNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.DelayNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ DelayOptions, 
      org.scalablytyped.std.DelayNode
    ]

