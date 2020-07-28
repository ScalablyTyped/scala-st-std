package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.boundary
import org.scalablytyped.std.stdStrings.end
import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.mark
import org.scalablytyped.std.stdStrings.pause
import org.scalablytyped.std.stdStrings.resume
import org.scalablytyped.std.stdStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechSynthesisUtterance extends EventTarget {
  var lang: java.lang.String = js.native
  var pitch: Double = js.native
  var rate: Double = js.native
  var text: java.lang.String = js.native
  var voice: SpeechSynthesisVoice = js.native
  var volume: Double = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(`type`: boundary, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(`type`: end, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: end,
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
  def addEventListener_mark(`type`: mark, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(`type`: resume, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def onboundary(ev: Event): js.Any = js.native
  def onend(ev: Event): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
  def onmark(ev: Event): js.Any = js.native
  def onpause(ev: Event): js.Any = js.native
  def onresume(ev: Event): js.Any = js.native
  def onstart(ev: Event): js.Any = js.native
}

