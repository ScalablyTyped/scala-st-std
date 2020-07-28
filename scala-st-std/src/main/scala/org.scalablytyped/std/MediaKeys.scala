package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeys extends js.Object {
  def createSession(): MediaKeySession = js.native
  def createSession(sessionType: MediaKeySessionType): MediaKeySession = js.native
  def setServerCertificate(): js.Promise[Unit] = js.native
  def setServerCertificate(serverCertificate: ArrayBuffer): js.Promise[Unit] = js.native
  def setServerCertificate(serverCertificate: DataView): js.Promise[Unit] = js.native
  def setServerCertificate(serverCertificate: Float32Array): js.Promise[Unit] = js.native
  def setServerCertificate(serverCertificate: Float64Array): js.Promise[Unit] = js.native
  def setServerCertificate(serverCertificate: Int16Array): js.Promise[Unit] = js.native
  def setServerCertificate(serverCertificate: Int32Array): js.Promise[Unit] = js.native
  def setServerCertificate(serverCertificate: Int8Array): js.Promise[Unit] = js.native
  def setServerCertificate(serverCertificate: Uint16Array): js.Promise[Unit] = js.native
  def setServerCertificate(serverCertificate: Uint32Array): js.Promise[Unit] = js.native
  def setServerCertificate(serverCertificate: Uint8Array): js.Promise[Unit] = js.native
  def setServerCertificate(serverCertificate: Uint8ClampedArray): js.Promise[Unit] = js.native
}

