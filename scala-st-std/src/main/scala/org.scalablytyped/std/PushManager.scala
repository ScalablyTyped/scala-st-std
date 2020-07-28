package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushManager extends js.Object {
  val supportedContentEncodings: js.Array[java.lang.String] = js.native
  def getSubscription(): js.Promise[PushSubscription | Null] = js.native
  def permissionState(): js.Promise[PushPermissionState] = js.native
  def permissionState(options: PushSubscriptionOptionsInit): js.Promise[PushPermissionState] = js.native
  def subscribe(): js.Promise[PushSubscription] = js.native
  def subscribe(options: PushSubscriptionOptionsInit): js.Promise[PushSubscription] = js.native
}

