package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.addtrack
import org.scalablytyped.std.stdStrings.inactive
import org.scalablytyped.std.stdStrings.removetrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStream extends EventTarget {
  val active: scala.Boolean = js.native
  val id: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_active(
    `type`: org.scalablytyped.std.stdStrings.active,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_active(
    `type`: org.scalablytyped.std.stdStrings.active,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inactive(`type`: inactive, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inactive(
    `type`: inactive,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def addTrack(track: MediaStreamTrack): Unit = js.native
  def getAudioTracks(): js.Array[MediaStreamTrack] = js.native
  def getTrackById(trackId: java.lang.String): MediaStreamTrack | Null = js.native
  def getTracks(): js.Array[MediaStreamTrack] = js.native
  def getVideoTracks(): js.Array[MediaStreamTrack] = js.native
  def onactive(ev: Event): js.Any = js.native
  def onaddtrack(ev: MediaStreamTrackEvent): js.Any = js.native
  def oninactive(ev: Event): js.Any = js.native
  def onremovetrack(ev: MediaStreamTrackEvent): js.Any = js.native
  def removeTrack(track: MediaStreamTrack): Unit = js.native
  def stop(): Unit = js.native
}

