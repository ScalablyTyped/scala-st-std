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
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[AudioTrack]] = js.native
  val length: Double = js.native
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]) | Null = js.native
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(`type`: addtrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(`type`: removetrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def getTrackById(id: java.lang.String): AudioTrack | Null = js.native
  def item(index: Double): AudioTrack = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(`type`: addtrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(`type`: removetrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

