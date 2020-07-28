package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.complete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfflineAudioContext extends AudioContextBase {
  val length: Double = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def oncomplete(ev: OfflineAudioCompletionEvent): js.Any = js.native
  def startRendering(): js.Promise[AudioBuffer] = js.native
  def suspend(suspendTime: Double): js.Promise[Unit] = js.native
}

