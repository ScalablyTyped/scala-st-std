package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.afterprint
import org.scalablytyped.std.stdStrings.beforeprint
import org.scalablytyped.std.stdStrings.beforeunload
import org.scalablytyped.std.stdStrings.hashchange
import org.scalablytyped.std.stdStrings.message
import org.scalablytyped.std.stdStrings.offline
import org.scalablytyped.std.stdStrings.online
import org.scalablytyped.std.stdStrings.orientationchange
import org.scalablytyped.std.stdStrings.pagehide
import org.scalablytyped.std.stdStrings.pageshow
import org.scalablytyped.std.stdStrings.popstate
import org.scalablytyped.std.stdStrings.resize
import org.scalablytyped.std.stdStrings.storage
import org.scalablytyped.std.stdStrings.unload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLFrameSetElement extends HTMLElement {
  var border: java.lang.String = js.native
  /**
    * Sets or retrieves the border color of the object.
    */
  var borderColor: js.Any = js.native
  /**
    * Sets or retrieves the frame widths of the object.
    */
  var cols: java.lang.String = js.native
  /**
    * Sets or retrieves whether to display a border for the frame.
    */
  var frameBorder: java.lang.String = js.native
  /**
    * Sets or retrieves the amount of additional space between the frames.
    */
  var frameSpacing: js.Any = js.native
  var name: java.lang.String = js.native
  /**
    * Sets or retrieves the frame heights of the object.
    */
  var rows: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(`type`: hashchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(`type`: popstate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(`type`: storage, listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def onafterprint(ev: Event): js.Any = js.native
  def onbeforeprint(ev: Event): js.Any = js.native
  def onbeforeunload(ev: BeforeUnloadEvent): js.Any = js.native
  def onhashchange(ev: HashChangeEvent): js.Any = js.native
  def onmessage(ev: MessageEvent): js.Any = js.native
  def onoffline(ev: Event): js.Any = js.native
  def ononline(ev: Event): js.Any = js.native
  def onorientationchange(ev: Event): js.Any = js.native
  def onpagehide(ev: PageTransitionEvent): js.Any = js.native
  def onpageshow(ev: PageTransitionEvent): js.Any = js.native
  def onpopstate(ev: PopStateEvent): js.Any = js.native
  def onresize(ev: UIEvent): js.Any = js.native
  def onstorage(ev: StorageEvent): js.Any = js.native
  def onunload(ev: Event): js.Any = js.native
}

