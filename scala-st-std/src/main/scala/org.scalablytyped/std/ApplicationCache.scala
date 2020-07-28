package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.cached
import org.scalablytyped.std.stdStrings.checking
import org.scalablytyped.std.stdStrings.downloading
import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.noupdate
import org.scalablytyped.std.stdStrings.obsolete
import org.scalablytyped.std.stdStrings.progress
import org.scalablytyped.std.stdStrings.updateready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCache extends EventTarget {
  var CHECKING: Double = js.native
  var DOWNLOADING: Double = js.native
  var IDLE: Double = js.native
  var OBSOLETE: Double = js.native
  var UNCACHED: Double = js.native
  var UPDATEREADY: Double = js.native
  var status: Double = js.native
  def abort(): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cached(`type`: cached, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cached(`type`: cached, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(`type`: checking, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(`type`: checking, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(`type`: downloading, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(`type`: downloading, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noupdate(`type`: noupdate, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noupdate(`type`: noupdate, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(`type`: obsolete, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(`type`: obsolete, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: js.Function1[/* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: js.Function1[/* ev */ ProgressEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(`type`: updateready, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(`type`: updateready, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  def oncached(ev: Event): js.Any = js.native
  def onchecking(ev: Event): js.Any = js.native
  def ondownloading(ev: Event): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
  def onnoupdate(ev: Event): js.Any = js.native
  def onobsolete(ev: Event): js.Any = js.native
  def onprogress(ev: ProgressEvent): js.Any = js.native
  def onupdateready(ev: Event): js.Any = js.native
  def swapCache(): Unit = js.native
  def update(): Unit = js.native
}

