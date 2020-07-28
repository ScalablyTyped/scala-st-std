package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.ended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioBufferSourceNode extends AudioNode {
  var buffer: AudioBuffer | Null = js.native
  val detune: AudioParam = js.native
  var loop: scala.Boolean = js.native
  var loopEnd: Double = js.native
  var loopStart: Double = js.native
  val playbackRate: AudioParam = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def onended(ev: MediaStreamErrorEvent): js.Any = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
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

