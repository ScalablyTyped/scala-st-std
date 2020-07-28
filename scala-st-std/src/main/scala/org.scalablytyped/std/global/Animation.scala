package org.scalablytyped.std.global

import org.scalablytyped.std.AnimationEffectReadOnly
import org.scalablytyped.std.AnimationTimeline
import org.scalablytyped.std.stdStrings.idle
import org.scalablytyped.std.stdStrings.paused
import org.scalablytyped.std.stdStrings.running
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
  def this(effect: AnimationEffectReadOnly) = this()
  def this(effect: js.UndefOr[scala.Nothing], timeline: AnimationTimeline) = this()
  def this(effect: AnimationEffectReadOnly, timeline: AnimationTimeline) = this()
  /* CompleteClass */
  override var currentTime: Double | Null = js.native
  /* CompleteClass */
  override var effect: AnimationEffectReadOnly = js.native
  /* CompleteClass */
  override val finished: js.Promise[org.scalablytyped.std.Animation] = js.native
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /* CompleteClass */
  override val pending: scala.Boolean = js.native
  /* CompleteClass */
  override val playState: idle | running | paused | org.scalablytyped.std.stdStrings.finished = js.native
  /* CompleteClass */
  override var playbackRate: Double = js.native
  /* CompleteClass */
  override val ready: js.Promise[org.scalablytyped.std.Animation] = js.native
  /* CompleteClass */
  override var startTime: Double = js.native
  /* CompleteClass */
  override var timeline: AnimationTimeline = js.native
  /* CompleteClass */
  override def cancel(): Unit = js.native
  /* CompleteClass */
  override def finish(): Unit = js.native
  /* CompleteClass */
  override def oncancel(ev: org.scalablytyped.std.AnimationPlaybackEvent): js.Any = js.native
  /* CompleteClass */
  override def onfinish(ev: org.scalablytyped.std.AnimationPlaybackEvent): js.Any = js.native
  /* CompleteClass */
  override def pause(): Unit = js.native
  /* CompleteClass */
  override def play(): Unit = js.native
  /* CompleteClass */
  override def reverse(): Unit = js.native
}

@JSGlobal("Animation")
@js.native
object Animation
  extends Instantiable0[org.scalablytyped.std.Animation]
     with Instantiable1[/* effect */ AnimationEffectReadOnly, org.scalablytyped.std.Animation]
     with Instantiable2[
      js.UndefOr[/* effect */ AnimationEffectReadOnly], 
      /* timeline */ AnimationTimeline, 
      org.scalablytyped.std.Animation
    ]

