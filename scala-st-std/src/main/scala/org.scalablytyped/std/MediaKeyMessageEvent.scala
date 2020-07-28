package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the EncryptedMediaExtensions API contains the content and related data when the content decryption module generates a message for the session. */
@js.native
trait MediaKeyMessageEvent extends Event {
  val message: ArrayBuffer = js.native
  val messageType: MediaKeyMessageType = js.native
}

