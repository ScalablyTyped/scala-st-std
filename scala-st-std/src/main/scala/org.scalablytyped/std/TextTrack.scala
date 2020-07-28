package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.cuechange
import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.load
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrack extends EventTarget {
  val DISABLED: Double = js.native
  val ERROR: Double = js.native
  val HIDDEN: Double = js.native
  val LOADED: Double = js.native
  val LOADING: Double = js.native
  val NONE: Double = js.native
  val SHOWING: Double = js.native
  val activeCues: TextTrackCueList = js.native
  val cues: TextTrackCueList = js.native
  val inBandMetadataTrackDispatchType: java.lang.String = js.native
  val kind: java.lang.String = js.native
  val label: java.lang.String = js.native
  val language: java.lang.String = js.native
  var mode: js.Any = js.native
  val readyState: Double = js.native
  def addCue(cue: TextTrackCue): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def oncuechange(ev: Event): js.Any = js.native
  def onerror(ev: ErrorEvent): js.Any = js.native
  def onload(ev: Event): js.Any = js.native
  def removeCue(cue: TextTrackCue): Unit = js.native
}

