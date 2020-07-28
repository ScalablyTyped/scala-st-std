package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MediaKeys interface of EncryptedMediaExtensions API the represents a set of keys that an associated HTMLMediaElement can use for decryption of media data during playback. */
@js.native
trait MediaKeys extends js.Object {
  def createSession(): MediaKeySession = js.native
  def createSession(sessionType: MediaKeySessionType): MediaKeySession = js.native
  def setServerCertificate(serverCertificate: BufferSource): js.Promise[scala.Boolean] = js.native
}

