package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.enter
import org.scalablytyped.std.stdStrings.exit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackCue extends EventTarget {
  var endTime: Double = js.native
  var id: java.lang.String = js.native
  var pauseOnExit: scala.Boolean = js.native
  var startTime: Double = js.native
  var text: java.lang.String = js.native
  var track: TextTrack = js.native
  @JSName("addEventListener")
  def addEventListener_enter(`type`: enter, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enter(`type`: enter, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(`type`: exit, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(`type`: exit, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  def getCueAsHTML(): DocumentFragment = js.native
  def onenter(ev: Event): js.Any = js.native
  def onexit(ev: Event): js.Any = js.native
}

