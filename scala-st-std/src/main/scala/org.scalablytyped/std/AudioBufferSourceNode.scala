package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.ended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioBufferSourceNode extends AudioNode {
  var buffer: AudioBuffer = js.native
  var loop: scala.Boolean = js.native
  var loopEnd: Double = js.native
  var loopStart: Double = js.native
  var playbackRate: AudioParam = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  def onended(ev: Event): js.Any = js.native
  def start(): Unit = js.native
  def start(when: js.UndefOr[scala.Nothing], offset: js.UndefOr[scala.Nothing], duration: Double): Unit = js.native
  def start(when: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
  def start(when: js.UndefOr[scala.Nothing], offset: Double, duration: Double): Unit = js.native
  def start(when: Double): Unit = js.native
  def start(when: Double, offset: js.UndefOr[scala.Nothing], duration: Double): Unit = js.native
  def start(when: Double, offset: Double): Unit = js.native
  def start(when: Double, offset: Double, duration: Double): Unit = js.native
  def stop(): Unit = js.native
  def stop(when: Double): Unit = js.native
}

