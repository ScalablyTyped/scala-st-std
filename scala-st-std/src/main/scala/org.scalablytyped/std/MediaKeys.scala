package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeys extends js.Object {
  def createSession(): MediaKeySession = js.native
  def createSession(sessionType: java.lang.String): MediaKeySession = js.native
  def setServerCertificate(serverCertificate: js.Any): js.Thenable[Unit] = js.native
}

