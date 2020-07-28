package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.updatefound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerRegistration extends EventTarget {
  val active: ServiceWorker | Null = js.native
  val installing: ServiceWorker | Null = js.native
  val pushManager: PushManager = js.native
  val scope: USVString = js.native
  val sync: SyncManager = js.native
  val waiting: ServiceWorker | Null = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(`type`: updatefound, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def getNotifications(): js.Promise[js.Array[Notification]] = js.native
  def getNotifications(filter: GetNotificationOptions): js.Promise[js.Array[Notification]] = js.native
  def onupdatefound(ev: Event): js.Any = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(`type`: updatefound, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def showNotification(title: java.lang.String): js.Promise[Unit] = js.native
  def showNotification(title: java.lang.String, options: NotificationOptions): js.Promise[Unit] = js.native
  def unregister(): js.Promise[scala.Boolean] = js.native
  def update(): js.Promise[Unit] = js.native
}

