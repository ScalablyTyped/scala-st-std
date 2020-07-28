package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.complete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfflineAudioContext extends BaseAudioContext {
  val length: Double = js.native
  var oncomplete: (js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def startRendering(): js.Promise[AudioBuffer] = js.native
  def suspend(suspendTime: Double): js.Promise[Unit] = js.native
}

