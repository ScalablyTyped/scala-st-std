package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeySession extends EventTarget {
  val closed: js.Thenable[Unit] = js.native
  val expiration: Double = js.native
  val keyStatuses: MediaKeyStatusMap = js.native
  val sessionId: java.lang.String = js.native
  def close(): js.Thenable[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: js.Any): js.Thenable[Unit] = js.native
  def load(sessionId: java.lang.String): js.Thenable[scala.Boolean] = js.native
  def remove(): js.Thenable[Unit] = js.native
  def update(response: js.Any): js.Thenable[Unit] = js.native
}

