package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeys extends js.Object {
  def createSession(): MediaKeySession = js.native
  def createSession(sessionType: MediaKeySessionType): MediaKeySession = js.native
  def setServerCertificate(serverCertificate: BufferSource): js.Promise[Unit] = js.native
}

