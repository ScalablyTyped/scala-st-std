package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.afterprint
import org.scalablytyped.std.stdStrings.beforeprint
import org.scalablytyped.std.stdStrings.beforeunload
import org.scalablytyped.std.stdStrings.hashchange
import org.scalablytyped.std.stdStrings.message
import org.scalablytyped.std.stdStrings.offline
import org.scalablytyped.std.stdStrings.online
import org.scalablytyped.std.stdStrings.pagehide
import org.scalablytyped.std.stdStrings.pageshow
import org.scalablytyped.std.stdStrings.popstate
import org.scalablytyped.std.stdStrings.storage
import org.scalablytyped.std.stdStrings.unload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowEventHandlers extends js.Object {
  var onafterprint: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onbeforeprint: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onbeforeunload: (js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]) | Null = js.native
  var onhashchange: (js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]) | Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]) | Null = js.native
  var onoffline: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var ononline: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onpagehide: (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]) | Null = js.native
  var onpageshow: (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]) | Null = js.native
  var onpopstate: (js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]) | Null = js.native
  var onstorage: (js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]) | Null = js.native
  var onunload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
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
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(`type`: hashchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
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
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
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
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(`type`: popstate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(`type`: storage, listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(`type`: hashchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(`type`: popstate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(`type`: storage, listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
}

