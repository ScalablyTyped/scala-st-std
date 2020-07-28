package org.scalablytyped.std.global

import org.scalablytyped.std.PeriodicWaveOptions
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PeriodicWave")
@js.native
class PeriodicWave protected ()
  extends org.scalablytyped.std.PeriodicWave {
  def this(context: org.scalablytyped.std.BaseAudioContext) = this()
  def this(context: org.scalablytyped.std.BaseAudioContext, options: PeriodicWaveOptions) = this()
}

@JSGlobal("PeriodicWave")
@js.native
object PeriodicWave
  extends Instantiable1[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      org.scalablytyped.std.PeriodicWave
    ]
     with Instantiable2[
      /* context */ org.scalablytyped.std.BaseAudioContext, 
      /* options */ PeriodicWaveOptions, 
      org.scalablytyped.std.PeriodicWave
    ]

