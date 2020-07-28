package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.cuechange
import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.load
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrack extends EventTarget {
  var DISABLED: Double = js.native
  var ERROR: Double = js.native
  var HIDDEN: Double = js.native
  var LOADED: Double = js.native
  var LOADING: Double = js.native
  var NONE: Double = js.native
  var SHOWING: Double = js.native
  var activeCues: TextTrackCueList = js.native
  var cues: TextTrackCueList = js.native
  var inBandMetadataTrackDispatchType: java.lang.String = js.native
  var kind: java.lang.String = js.native
  var label: java.lang.String = js.native
  var language: java.lang.String = js.native
  var mode: js.Any = js.native
  var readyState: Double = js.native
  def addCue(cue: TextTrackCue): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(`type`: cuechange, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(`type`: cuechange, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  def oncuechange(ev: Event): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
  def onload(ev: Event): js.Any = js.native
  def removeCue(cue: TextTrackCue): Unit = js.native
}

