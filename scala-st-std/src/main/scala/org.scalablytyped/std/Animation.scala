package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.finished
import org.scalablytyped.std.stdStrings.idle
import org.scalablytyped.std.stdStrings.paused
import org.scalablytyped.std.stdStrings.running
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var currentTime: Double | Null
  var effect: AnimationEffectReadOnly
  val finished: js.Promise[Animation]
  var id: java.lang.String
  val pending: scala.Boolean
  val playState: idle | running | paused | org.scalablytyped.std.stdStrings.finished
  var playbackRate: Double
  val ready: js.Promise[Animation]
  var startTime: Double
  var timeline: AnimationTimeline
  def cancel(): Unit
  def finish(): Unit
  def oncancel(ev: AnimationPlaybackEvent): js.Any
  def onfinish(ev: AnimationPlaybackEvent): js.Any
  def pause(): Unit
  def play(): Unit
  def reverse(): Unit
}

object Animation {
  @scala.inline
  def apply(
    cancel: () => Unit,
    effect: AnimationEffectReadOnly,
    finish: () => Unit,
    finished: js.Promise[Animation],
    id: java.lang.String,
    oncancel: AnimationPlaybackEvent => js.Any,
    onfinish: AnimationPlaybackEvent => js.Any,
    pause: () => Unit,
    pending: scala.Boolean,
    play: () => Unit,
    playState: idle | running | paused | finished,
    playbackRate: Double,
    ready: js.Promise[Animation],
    reverse: () => Unit,
    startTime: Double,
    timeline: AnimationTimeline
  ): Animation = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), effect = effect.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], oncancel = js.Any.fromFunction1(oncancel), onfinish = js.Any.fromFunction1(onfinish), pause = js.Any.fromFunction0(pause), pending = pending.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), playState = playState.asInstanceOf[js.Any], playbackRate = playbackRate.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], reverse = js.Any.fromFunction0(reverse), startTime = startTime.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setEffect(value: AnimationEffectReadOnly): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinish(value: () => Unit): Self = this.set("finish", js.Any.fromFunction0(value))
    @scala.inline
    def setFinished(value: js.Promise[Animation]): Self = this.set("finished", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOncancel(value: AnimationPlaybackEvent => js.Any): Self = this.set("oncancel", js.Any.fromFunction1(value))
    @scala.inline
    def setOnfinish(value: AnimationPlaybackEvent => js.Any): Self = this.set("onfinish", js.Any.fromFunction1(value))
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setPending(value: scala.Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    @scala.inline
    def setPlayState(value: idle | running | paused | finished): Self = this.set("playState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setReady(value: js.Promise[Animation]): Self = this.set("ready", value.asInstanceOf[js.Any])
    @scala.inline
    def setReverse(value: () => Unit): Self = this.set("reverse", js.Any.fromFunction0(value))
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeline(value: AnimationTimeline): Self = this.set("timeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTimeNull: Self = this.set("currentTime", null)
  }
  
}

