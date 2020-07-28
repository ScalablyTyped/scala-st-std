package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Stores information on a media query applied to a document, and handles sending notifications to listeners when the media query state change (i.e. when the media query test starts or stops evaluating to true). */
@js.native
trait MediaQueryList extends EventTarget {
  val matches: scala.Boolean = js.native
  val media: java.lang.String = js.native
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  /** @deprecated */
  def addListener(): Unit = js.native
  def addListener(listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  /** @deprecated */
  def removeListener(): Unit = js.native
  def removeListener(listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]): Unit = js.native
}

