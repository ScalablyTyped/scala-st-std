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
  def generateRequest(initDataType: java.lang.String): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: ArrayBuffer): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: DataView): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: Float32Array): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: Float64Array): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: Int16Array): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: Int32Array): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: Int8Array): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: Uint16Array): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: Uint32Array): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: Uint8Array): js.Promise[Unit] = js.native
  def generateRequest(initDataType: java.lang.String, initData: Uint8ClampedArray): js.Promise[Unit] = js.native
  def load(sessionId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def remove(): js.Promise[Unit] = js.native
  def update(): js.Promise[Unit] = js.native
  def update(response: ArrayBuffer): js.Promise[Unit] = js.native
  def update(response: DataView): js.Promise[Unit] = js.native
  def update(response: Float32Array): js.Promise[Unit] = js.native
  def update(response: Float64Array): js.Promise[Unit] = js.native
  def update(response: Int16Array): js.Promise[Unit] = js.native
  def update(response: Int32Array): js.Promise[Unit] = js.native
  def update(response: Int8Array): js.Promise[Unit] = js.native
  def update(response: Uint16Array): js.Promise[Unit] = js.native
  def update(response: Uint32Array): js.Promise[Unit] = js.native
  def update(response: Uint8Array): js.Promise[Unit] = js.native
  def update(response: Uint8ClampedArray): js.Promise[Unit] = js.native
}

