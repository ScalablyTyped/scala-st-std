package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeySession extends EventTarget {
  val closed: js.Promise[Unit] = js.native
  val expiration: Double = js.native
  val keyStatuses: MediaKeyStatusMap = js.native
  val sessionId: java.lang.String = js.native
  def close(): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: js.Any): js.Promise[Unit] = js.native
  def load(sessionId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def remove(): js.Promise[Unit] = js.native
  def update(response: js.Any): js.Promise[Unit] = js.native
}

