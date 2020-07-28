package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.controllerchange
import org.scalablytyped.std.stdStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerContainer extends EventTarget {
  val controller: ServiceWorker | Null = js.native
  val ready: js.Promise[ServiceWorkerRegistration] = js.native
  @JSName("addEventListener")
  def addEventListener_controllerchange(`type`: controllerchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ServiceWorkerMessageEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ServiceWorkerMessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ServiceWorkerMessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def getRegistration(): js.Promise[js.UndefOr[ServiceWorkerRegistration]] = js.native
  def getRegistration(clientURL: USVString): js.Promise[js.UndefOr[ServiceWorkerRegistration]] = js.native
  def getRegistrations(): js.Promise[js.Array[ServiceWorkerRegistration]] = js.native
  def oncontrollerchange(ev: Event): js.Any = js.native
  def onmessage(ev: ServiceWorkerMessageEvent): js.Any = js.native
  def register(scriptURL: USVString): js.Promise[ServiceWorkerRegistration] = js.native
  def register(scriptURL: USVString, options: RegistrationOptions): js.Promise[ServiceWorkerRegistration] = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllerchange(`type`: controllerchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllerchange(
    `type`: controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ServiceWorkerMessageEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ServiceWorkerMessageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ServiceWorkerMessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

