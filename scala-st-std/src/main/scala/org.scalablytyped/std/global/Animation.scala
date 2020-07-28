package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Animation")
@js.native
class Animation ()
  extends org.scalablytyped.std.Animation {
  def this(effect: org.scalablytyped.std.AnimationEffect) = this()
  def this(effect: js.UndefOr[scala.Nothing], timeline: org.scalablytyped.std.AnimationTimeline) = this()
  def this(effect: org.scalablytyped.std.AnimationEffect, timeline: org.scalablytyped.std.AnimationTimeline) = this()
  def this(effect: Null, timeline: org.scalablytyped.std.AnimationTimeline) = this()
}

@JSGlobal("Animation")
@js.native
object Animation
  extends Instantiable0[org.scalablytyped.std.Animation]
     with Instantiable1[
      /* effect */ org.scalablytyped.std.AnimationEffect, 
      org.scalablytyped.std.Animation
    ]
     with Instantiable2[
      js.UndefOr[(/* effect */ org.scalablytyped.std.AnimationEffect) | (/* effect */ Null)], 
      /* timeline */ org.scalablytyped.std.AnimationTimeline, 
      org.scalablytyped.std.Animation
    ]

