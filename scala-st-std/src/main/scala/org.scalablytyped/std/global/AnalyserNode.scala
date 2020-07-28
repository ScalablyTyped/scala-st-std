package org.scalablytyped.std.global

import org.scalablytyped.std.AnalyserOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AnalyserNode")
@js.native
class AnalyserNode protected ()
  extends org.scalablytyped.std.AnalyserNode {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: AnalyserOptions) = this()
}

@JSGlobal("AnalyserNode")
@js.native
object AnalyserNode
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.AnalyserNode
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ AnalyserOptions, 
      org.scalablytyped.std.AnalyserNode
    ]

