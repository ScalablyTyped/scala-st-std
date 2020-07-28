package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.ended
import org.scalablytyped.std.stdStrings.mute
import org.scalablytyped.std.stdStrings.overconstrained
import org.scalablytyped.std.stdStrings.unmute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamTrack extends EventTarget {
  var enabled: scala.Boolean = js.native
  val id: java.lang.String = js.native
  val kind: java.lang.String = js.native
  val label: java.lang.String = js.native
  val muted: scala.Boolean = js.native
  val readonly: scala.Boolean = js.native
  val readyState: MediaStreamTrackState = js.native
  val remote: scala.Boolean = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(`type`: mute, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overconstrained(
    `type`: overconstrained,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overconstrained(
    `type`: overconstrained,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overconstrained(
    `type`: overconstrained,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(`type`: unmute, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def applyConstraints(constraints: MediaTrackConstraints): js.Promise[Unit] = js.native
  def getCapabilities(): MediaTrackCapabilities = js.native
  def getConstraints(): MediaTrackConstraints = js.native
  def getSettings(): MediaTrackSettings = js.native
  def onended(ev: MediaStreamErrorEvent): js.Any = js.native
  def onmute(ev: Event): js.Any = js.native
  def onoverconstrained(ev: MediaStreamErrorEvent): js.Any = js.native
  def onunmute(ev: Event): js.Any = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(`type`: mute, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(
    `type`: mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_overconstrained(
    `type`: overconstrained,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_overconstrained(
    `type`: overconstrained,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_overconstrained(
    `type`: overconstrained,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(`type`: unmute, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(
    `type`: unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def stop(): Unit = js.native
}

