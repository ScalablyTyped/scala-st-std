package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.audioprocess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptProcessorNode extends AudioNode {
  val bufferSize: Double = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def onaudioprocess(ev: AudioProcessingEvent): js.Any = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AudioProcessingEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

