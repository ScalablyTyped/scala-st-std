package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.click
import org.scalablytyped.std.stdStrings.close
import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends EventTarget {
  val body: java.lang.String = js.native
  val dir: NotificationDirection = js.native
  val icon: java.lang.String = js.native
  val lang: java.lang.String = js.native
  val permission: NotificationPermission = js.native
  val tag: java.lang.String = js.native
  val title: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_click(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
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
  def addEventListener_show(`type`: show, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_show(
    `type`: show,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def close(): Unit = js.native
  def onclick(ev: Event): js.Any = js.native
  def onclose(ev: Event): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
  def onshow(ev: Event): js.Any = js.native
}

