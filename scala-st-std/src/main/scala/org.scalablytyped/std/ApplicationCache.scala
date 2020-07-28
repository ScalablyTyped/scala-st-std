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
  val CHECKING: Double = js.native
  val DOWNLOADING: Double = js.native
  val IDLE: Double = js.native
  val OBSOLETE: Double = js.native
  val UNCACHED: Double = js.native
  val UPDATEREADY: Double = js.native
  val status: Double = js.native
  def abort(): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cached(`type`: cached, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cached(
    `type`: cached,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(`type`: checking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_checking(
    `type`: checking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(`type`: downloading, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloading(
    `type`: downloading,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noupdate(`type`: noupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_noupdate(
    `type`: noupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(`type`: obsolete, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_obsolete(
    `type`: obsolete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(`type`: updateready, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateready(
    `type`: updateready,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
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

