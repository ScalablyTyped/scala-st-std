package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.addtrack
import org.scalablytyped.std.stdStrings.change
import org.scalablytyped.std.stdStrings.removetrack
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioTrackList
  extends EventTarget
     with /* index */ NumberDictionary[AudioTrack] {
  val length: Double = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(`type`: addtrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(`type`: removetrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def getTrackById(id: java.lang.String): AudioTrack | Null = js.native
  def item(index: Double): AudioTrack = js.native
  def onaddtrack(ev: TrackEvent): js.Any = js.native
  def onchange(ev: Event): js.Any = js.native
  def onremovetrack(ev: TrackEvent): js.Any = js.native
}

