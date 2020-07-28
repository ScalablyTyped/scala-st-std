package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSMediaKeySession extends EventTarget {
  var error: MSMediaKeyError = js.native
  var keySystem: java.lang.String = js.native
  var sessionId: java.lang.String = js.native
  def close(): Unit = js.native
  def update(key: Uint8Array): Unit = js.native
}

