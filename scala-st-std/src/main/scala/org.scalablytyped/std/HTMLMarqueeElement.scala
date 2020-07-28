package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.bounce
import org.scalablytyped.std.stdStrings.finish
import org.scalablytyped.std.stdStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLMarqueeElement extends HTMLElement {
  var behavior: java.lang.String = js.native
  var bgColor: js.Any = js.native
  var direction: java.lang.String = js.native
  var height: java.lang.String = js.native
  var hspace: Double = js.native
  var loop: Double = js.native
  var scrollAmount: Double = js.native
  var scrollDelay: Double = js.native
  var trueSpeed: scala.Boolean = js.native
  var vspace: Double = js.native
  var width: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_bounce(`type`: bounce, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bounce(
    `type`: bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(`type`: finish, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
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
  def onbounce(ev: Event): js.Any = js.native
  def onfinish(ev: Event): js.Any = js.native
  def onstart(ev: Event): js.Any = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

