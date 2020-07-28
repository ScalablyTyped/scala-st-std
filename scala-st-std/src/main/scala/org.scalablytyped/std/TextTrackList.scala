package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.addtrack
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackList
  extends EventTarget
     with /* index */ NumberDictionary[TextTrack] {
  var length: Double = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(`type`: addtrack, listener: js.Function1[/* ev */ TrackEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(`type`: addtrack, listener: js.Function1[/* ev */ TrackEvent, _], useCapture: scala.Boolean): Unit = js.native
  def item(index: Double): TextTrack = js.native
  def onaddtrack(ev: TrackEvent): js.Any = js.native
}

